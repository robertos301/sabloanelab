import java.util.ArrayList;

public class ImageProxy implements Element,Observable {
 private String imageName;
 private Image realImage;
	private ArrayList<Observer> observersList = new ArrayList<>();
	private String oldValue;


public ImageProxy(String imageName) {
	super();
	this.imageName = imageName;
	addObserver(DocumentManager.getInstance().getObserver1());
}

@Override
public void print() {
	if (realImage != null)
	{
		realImage.print();
	}
	else
		{
			realImage = new Image(imageName);
		}
}

@Override
public void accept(Visitor visitor) {
	visitor.visit(this);
	
}

public void setNewValue(String newValue) {
	
	
	oldValue = this.imageName;
	this.imageName = newValue;
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
		i.update(oldValue, this.imageName);
	}
	
}

public Element copy() {
	// TODO Auto-generated method stub
	return null;
}


}
