
public class OpenCommand implements Command {
String jsonfile;

public OpenCommand(String json) {
	this.jsonfile = json;}
	public void execute() {
		Builder jsonBuilder = new JSONbuilder(jsonfile);
		jsonBuilder.build();
		Book b = new Book("Somthing");
		b.addContent(jsonBuilder.getResult());
	}
	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
