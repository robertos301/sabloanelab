import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONbuilder implements Builder {
String filename;
	public JSONbuilder(String jsonfile) {
		filename = jsonfile;
		
	}

	Element document;
	@Override
	public Element getResult() {
  return document;
		
	}

	@Override
	public void build() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> map = mapper.readValue(new File(filename),
			HashMap.class);
			document = processMap(map);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
		
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Section section = new Section((String)map.get("title"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		children.forEach((childMap) -> {

		Element e = this.processMap(childMap);
		if (e != null) {
		try {
		section.add(e);
		} catch (Exception var5) {
		var5.printStackTrace();
		}
		}
		});
		return section;
		
	}

	private Element processMap(HashMap<String, Object> childMap) {
	String classname = (String) childMap.get("class");
	if(classname.contentEquals("Paragraph"))
	{
		return buildParagraph(childMap);
	}
	if(classname.contentEquals("Section"))
	{
		return buildSection(childMap);
	}
	if(classname.contentEquals("Image"))
	{
		return buildImage(childMap);
	}
	
	
	if(classname.contentEquals("ImageProxy"))
	{
		return buildImageProxy(childMap);
	}
	return null;
	}
	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		Paragraph pgh = new Paragraph((String)map.get("text"));
	
		return pgh;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		Image img = new Image((String)map.get("url"));
		
		return img;
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		ImageProxy img = new ImageProxy((String)map.get("url"));
	
		return img;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		Table tbl = new Table((String)map.get("title"));
		
		return tbl;
	}

}
