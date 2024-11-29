package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	
	private String director;
	private int length;
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		
		String str = "DVD";
		if (getTitle() != null) {
			str += " - " + getTitle();
		}
		if (getCategory() != null) {
			str += " - " + getCategory();
		}
		if (director != null) {
			str += " - " + director;
		}
		str += " - " + length;
		str += ": " + getCost() + " $";
		
		return str;
	}

}