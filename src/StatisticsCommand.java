
public class StatisticsCommand implements Command{

	@Override
	public void execute() {
		try {
			// TODO Auto-generated method stub
			BookStatistics stats = new BookStatistics();
			DocumentManager doc = DocumentManager.getInstance();
			Book c = doc.getBook();
			Element e = c.getContent(0);
			e.accept(stats);
			stats.printStatistics();
			} catch (NullPointerException e) {}
			
		}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
