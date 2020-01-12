import java.util.ArrayList;

public class Paragraph implements Element,Observable {

	private String title;
	private String text;
	AlignStrategy align;
	private ArrayList<Observer> observersList = new ArrayList<>();
	private String oldValue;

	public Paragraph(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}

	public Paragraph(String title) {
		super();
		this.title = title;
		addObserver(DocumentManager.getInstance().getObserver1());
	}
	
	public void setAlignStrategy(AlignStrategy align)
	{
		this.align=align;
		
	}
	
	public Paragraph copy()
	{
		return new Paragraph(this.title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void print()
	{
		System.out.print("Paragraph: " + this.title);
		if(this.align!=null)
		{
			align.print(this.title);
		}
		else
		{
			System.out.println(this.title);
		}
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	public void setNewValue(String newValue) {
		
		
		oldValue = this.title;
		this.title = newValue;
		notifyObservers();
		
	}

	@Override
	public void addObserver(Observer obs) {
		observersList.add(obs);
		
	}

	@Override
	public void removeObserver(Observer obs) {
		observersList.remove(obs);
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observer i : observersList)
		{
			i.update(oldValue, this.title);
		}
		
	
	}
	
}
