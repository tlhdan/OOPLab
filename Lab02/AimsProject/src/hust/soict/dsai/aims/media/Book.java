package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public List<String> getAuthors() {
		return authors;
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
