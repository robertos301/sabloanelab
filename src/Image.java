import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Observable {

	private String title;
	private ArrayList<Observer> observersList = new ArrayList<>();
	private String oldValue;

	Image(String name) {
title = name;
addObserver(DocumentManager.getInstance().getObserver1());
		try {
		TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void print()
	{
		System.out.println("ImageName: "+ this.title);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
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
	
	public Image copy()
	{
		return new Image(this.title);
	}
	
}
