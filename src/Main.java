
public class Main {

public static void main(String[] args) {
//		
////		Book diseaTitanic = new Book("Disea Titanic");
////		Authors rPaul = new Authors("Radu Paul");
////		diseaTitanic.addAuthor(rPaul);
////		int indexOfChapter = diseaTitanic.createChapter("Chapter One");
////		Chapter chpOne = diseaTitanic.getChapter(indexOfChapter);
////		int indexOfSubChapter = chpOne.createSubChapter("ChapterOneOne");
////		SubChapter chponeone= chpOne.getSubChapter(indexOfSubChapter);
////		int indexOfParagraph = chponeone.createParagraph("Paragraph");
////		int indexofImage = chponeone.createImage("Image");
////		int indexofTable = chponeone.createTable("Table");
//		
//	// LAB 2
////		Book discoTitanic = new Book("Disco Titanic");
////		Authors rpGheo = new Authors("Radu Pavel Gheo");
////		
////		discoTitanic.addAuthor(rpGheo);
////		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
////		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
////		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
////		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
////		
////		scOneOne.createParagraph("Paragraph1");
////		scOneOne.createParagraph("Paragraph2");
////		scOneOne.createParagraph("Paragraph3");
////		scOneOne.createImage("Image 1 ");
////		scOneOne.createParagraph("Paragraph4");
////		scOneOne.createTable("Table 1");
////		scOneOne.createParagraph("Paragraph5");
////		
////		scOneOne.print();
////		
//
//		
//	// LAB 3
////		
////Book noapteBuna = new Book("Nb copii");
////Authors rpGheo = new Authors("Radu Pavel Gheo");
////noapteBuna.addAuthor(rpGheo);
////
////Section cap1 = new Section("Capitolul 1");
////Section cap11 = new Section("Capitolul 1.1");
////Section cap111 = new Section("Capitolul 1.1.1");
////Section cap1111= new Section("SubCh 1.1.1.1");
////noapteBuna.addContent(new Paragraph("Multumesc celor care au facut .."));
////noapteBuna.addContent(cap1);
////cap1.add(new Paragraph("Moto capitol"));
////cap1.add(cap11);
////cap11.add(new Paragraph("Text from subchapter 1.1"));
////cap11.add(cap111);
////cap111.add(new Paragraph("Text from subchapter 1.1.1"));
////cap111.add(cap1111);
////cap1111.add(new Image("Image subchapter 1.1.1.1"));
////
////noapteBuna.print();
//
//		// LAB 4
//	
////		long startTime = System.currentTimeMillis();
////		ImageProxy img1 = new ImageProxy("Pamela Anderson");
////		ImageProxy img2 = new ImageProxy("Kim Kardashian");
////		ImageProxy img3 = new ImageProxy("Kirby Griffin");
////		Section playboyS1 = new Section("Front Cover");
////		playboyS1.add(img1);
////		Section playboyS2 = new Section("Summer Girls");
////		playboyS2.add(img2);
////		playboyS2.add(img3);
////		Book playboy = new Book("Playboy");
////
////		playboy.addContent(playboyS1);
////		playboy.addContent(playboyS2);
////		long endTime = System.currentTimeMillis();
////		System.out.println("Creation of the content took " + (endTime -
////		startTime) + " milliseconds");
////		startTime = System.currentTimeMillis();
////		playboyS1.print();
////		endTime = System.currentTimeMillis();
////		System.out.println("Printing of the section 1 took " + (endTime -
////		startTime) + " milliseconds");
////		startTime = System.currentTimeMillis();
////		playboyS1.print();
////		endTime = System.currentTimeMillis();
////		System.out.println("Printing again the section 1 took " + (endTime -
////		startTime) + " milliseconds");
////		
//		
//		
//		
//		//LAB 5
//		
//
////			Section cap1 = new Section("Capitolul 1");
////			Paragraph p1 = new Paragraph("Paragraph 1");
////			cap1.add(p1);
////			Paragraph p2 = new Paragraph("Paragraph 2");
////			cap1.add(p2);
////			Paragraph p3 = new Paragraph("Paragraph 3");
////			cap1.add(p3);
////			Paragraph p4 = new Paragraph("Paragraph 4");
////			cap1.add(p4);
////			System.out.println("Printing without Alignment");
////
////			System.out.println();
////			cap1.print();
////			p1.setAlignStrategy(new AlignCenter());
////			p2.setAlignStrategy(new AlignRight());
////			p3.setAlignStrategy(new AlignLeft());
////			System.out.println();
////			System.out.println("Printing with Alignment");
////			System.out.println();
////			cap1.print();
//		
//		
//		/////// LAB 6 //////////////
//		
//		 
//			Section cap1 = new Section("Capitolul 1");
//			Paragraph p1 = new Paragraph("Paragraph 1");
//			cap1.add(p1);
//			Paragraph p2 = new Paragraph("Paragraph 2");
//			cap1.add(p2);
//			Paragraph p3 = new Paragraph("Paragraph 3");
//			cap1.add(p3);
//			Paragraph p4 = new Paragraph("Paragraph 4");
//			cap1.add(p4);
//			cap1.add(new ImageProxy("ImageOne"));
//			cap1.add(new Image("ImageTwo"));
//			cap1.add(new Paragraph("Some text"));
//			cap1.add(new Table("Table 1"));
//			//BookStatistics stats = new BookStatistics();
//			//cap1.accept(stats);
//			//stats.printStatistics();
//			FinancialBook stats = new FinancialBook();
//			cap1.accept(stats);
//			stats.printFinancialStatistics();
//		
	    //// LAB 7 //////////
//	
//	Builder jsonBuilder = new JSONbuilder("src/book.json");
//	jsonBuilder.build();
//	Element myBook = jsonBuilder.getResult();
//	myBook.print();

	///////// LAB 8 ///////////
//	Command cmd1 = new OpenCommand("src/book.json");
//	cmd1.execute();
//	Command cmd2 = new StatisticsCommand();
//	cmd2.execute();
//	DocumentManager.getInstance().getBook().print();
//	
	
//	Section cap1 = new Section("Capitolul 1");
//	Paragraph p1 = new Paragraph("Paragraph 1");
//	cap1.add(p1);
//	Paragraph p2 = new Paragraph("Paragraph 2");
//	cap1.add(p2);
//	Paragraph p3 = new Paragraph("Paragraph 3");
//	cap1.add(p3);
//	Paragraph p4 = new Paragraph("Paragraph 4");
//	cap1.add(p4);
//	cap1.add(new ImageProxy("ImageOne"));
//	cap1.add(new Image("ImageTwo"));
//	cap1.add(new Paragraph("Some text"));
//	cap1.add(new Table("Table 1"));
//	FirstObserver firstObserver = new FirstObserver();
//	SecondObserver secondObserver = new SecondObserver();
//	cap1.addObserver(firstObserver);
//	cap1.addObserver(secondObserver);
//	p1.addObserver(firstObserver);
//	p1.addObserver(secondObserver);
//	p2.addObserver(firstObserver);
//	cap1.setNewValue("CHAPTER 1");
//	p1.setNewValue("PARAGRAPH 2");
//	p2.setNewValue("PARAGRAPH 3");
//	//cap1.removeObserver(firstObserver);
//	cap1.setNewValue("CHAPTER 1.1");
//		
//	}
	
	
	
// LAB 10 ///////////////

Section cap11 = new Section("Capitolul 1");
cap11.add(new Paragraph("Moto capitol"));
cap11.add(new Paragraph("Another One"));
cap11.add(new Paragraph("Another Two"));
cap11.add(new Paragraph("Another Three"));
DocumentManager.getInstance().setSectiune(cap11);
System.out.println("Book Content: ");
DocumentManager.getInstance().getSectiune().print();

new DeleteCommand().execute();
System.out.println("Book Content after the first delete: ");
DocumentManager.getInstance().getSectiune().print();
new DeleteCommand().execute();
System.out.println("Book Content after the second delete: ");
DocumentManager.getInstance().getSectiune().print();

Command undoCommand = new UndoCommand();
undoCommand.execute();
System.out.println("Book Content after first undo: ");
DocumentManager.getInstance().getSectiune().print();
undoCommand.execute();
System.out.println("Book Content after second undo: ");
DocumentManager.getInstance().getSectiune().print();


}}

	


