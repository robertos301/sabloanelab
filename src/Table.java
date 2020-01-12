import java.util.ArrayList;
import java.util.Vector;

public class Table implements Element,Observable {

	private String title;
	private ArrayList<Observer> observersList = new ArrayList<>();
	private String oldValue;

	public Table(String title) {
		super();
		this.title = title;
		addObserver(DocumentManager.getInstance().getObserver1());
	}

	public Table copy()
	{
		return new Table(this.title);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void print()
	{
		System.out.println("Table with title: "+this.title);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}

	@Override
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
