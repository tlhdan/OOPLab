package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title) {
		super(title);
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Book(String title, String category, List<String> authors,float cost) {
		super(title, category, cost);
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.print("The author is already in the author list.");
		} else {
			authors.add(authorName);
			System.out.println("The author has been added.");
		}
	}
	
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			System.out.println("The author is not in the author list.");
		} else {
			authors.remove(authorName);
			System.out.println("The author has been removed.");
		}
	}

}
