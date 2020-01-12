
public class FirstObserver implements Observer{

	@Override
	public void update(String oldValue, String newValue) {
		System.out.println("First Observer: " + "Old Value:" + oldValue + " New Value:" + newValue);
	}

	
	
}
