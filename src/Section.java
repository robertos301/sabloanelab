import java.util.ArrayList;
import java.util.Vector;


public class Section implements Element,Observable {

	private String sectionTitle;
	private Vector<Element> elVec = new Vector<>();
	
	private ArrayList<Observer> observersList = new ArrayList<>();
	private String oldValue;
	
	public Section(String sectionTitle, Vector<Element> elVec) {
		super();
		this.sectionTitle = sectionTitle;
		this.elVec = elVec;
		addObserver(DocumentManager.getInstance().getObserver1());
	}
	public String getSectionTitle() {
		return sectionTitle;
	}
	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}
	public Vector<Element> getElVec() {
		return elVec;
	}
	public void setElVec(Vector<Element> elVec) {
		this.elVec = elVec;
	}
	public Section(String sectionTitle) {
		super();
		this.sectionTitle = sectionTitle;
	}
	
	public int add(Element x)
	{	
		elVec.add(x);
		return elVec.indexOf(x);
	}
	
	public void remove(Element x)
	{
		elVec.remove(x);
	}
	
	public Element getElement(int x)
	{
		return elVec.get(x);
	}
	
	public void print()
	{
		System.out.println("SectionTitle: "+this.sectionTitle);
		System.out.println();
		
		for(Element e : elVec)
		{
			e.print();
		}
	}
	@Override
	public void accept(Visitor visitor) {
		for(Element e : elVec)
		{
			e.accept(visitor);
			}
		visitor.visit(this);
		}
	
	@Override
	public void setNewValue(String newValue) {
		
		
		oldValue = this.sectionTitle;
		this.sectionTitle = newValue;
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
			i.update(oldValue, this.sectionTitle);
		}
		
	}
	public Element getLastElement()
	{
		if(this.elVec.size() > 0)
		{
			return this.elVec.get(this.elVec.size() -1 );
		}
		else
		{
			return null;
		}
	}
	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		Section s = new Section(this.sectionTitle);
		
	
		 this.elVec.forEach(p -> {
			 s.add(p.copy());
		 });
		return s;
	}
		
	
	
}
