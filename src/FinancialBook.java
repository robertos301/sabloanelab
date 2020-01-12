
public class FinancialBook extends BookStatistics {
 
	public void printFinancialStatistics()
	{
		System.out.println("PretImgs: " + this.imgC * 5 + "$" );
		System.out.println("PretPghs: "+ this.pghC * 3 + "$");
		System.out.println("PretTbl: "+this.tbC * 6 + "$");
		System.out.println("NrSectiuni: "+this.scC * 4 + "$");
	}
	

}
