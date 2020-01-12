
public class Authors {
 private String author;

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public Authors(String author) {
	super();
	this.author = author;
}

@Override
public String toString() {
	return "Authors [author=" + author + "]";
}

public void print() {
	System.out.println("Author:" + this.author);
}
}
