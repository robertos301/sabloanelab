
public class BookStatistics implements Visitor {

	protected int imgC ;
	protected int imgP_C;
	protected int pghC ;
	protected int tbC;
	protected int scC;
	protected int bcC;
	public BookStatistics() {
		super();
		this.imgC = 0;
		this.imgP_C = 0;
		this.pghC = 0;
		this.tbC = 0;
		this.scC = 0;
	}

	@Override
	public void visit(Image img) {
this.imgC ++;
		
	}

	@Override
	public void visit(ImageProxy imgproxy) {
		// TODO Auto-generated method stub
		this.imgC ++;
	}

	@Override
	public void visit(Paragraph pgh) {
		// TODO Auto-generated method stub
		this.pghC ++;
		
	}

	@Override
	public void visit(Table tb) {
		// TODO Auto-generated method stub
		this.tbC++;
	}
	
	public void printStatistics()
	{
		System.out.println("Nr img: " + this.imgC );
		System.out.println("NrPgh: "+ this.pghC);
		System.out.println("NrTbl: "+this.tbC);
		System.out.println("NrSectiuni: "+this.scC);
	}

	@Override
	public void visit(Section sc) {
	
		this.scC++;
		
	}

	@Override
	public void visit(Book book) {
	
		bcC++;
	}

	
	
}
