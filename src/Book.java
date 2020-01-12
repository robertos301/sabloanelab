import java.util.Vector;

public class Book{

	private String title;
	private Vector<Authors> authVec = new Vector<>();
	private Vector<Element> elVec = new Vector<>();
	public Book(String title) {
		
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public int createAuthor (String authName)
	{
		Authors auth = new Authors(authName);
		authVec.add(auth);
		return authVec.indexOf(auth);
	}
	
	public void addAuthor(Authors x)
	{
		authVec.add(x);
	}
	
	
	public void print()
	{
		System.out.println("Carte: "+this.title);
		System.out.println("Autori:");
		for(int i=0;i<authVec.size();i++) {	
			authVec.get(i).print();
		}
		for(int i=0;i<elVec.size();i++)
		{
			elVec.get(i).print();
		}
	}
	
	public void addContent(Element e)
	{
		elVec.add(e);
	}
	
	
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}
	
	public Element getContent(int index)
	{
		return this.elVec.get(index);
	}

	
	
	
}
