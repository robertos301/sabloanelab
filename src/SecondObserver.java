
public class SecondObserver implements Observer {

	@Override
	public void update(String oldValue, String newValue) {
		System.out.println("Second Observer: " + "Old Value:" + oldValue + " New Value:" + newValue);
		
	}

}
