package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
	
	private String director;
	private int length;
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.setId();
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.setId();
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.setId();
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.setId();
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
	private void setId() {
		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	private static int nbDigitalVideoDiscs = 0;
	
	public String toString() {
		
		String str = "DVD";
		if (title != null) {
			str += " - " + title;
		}
		if (category != null) {
			str += " - " + category;
		}
		if (director != null) {
			str += " - " + director;
		}
		if (length != 0) {
			str += " - " + length;
		}
		str += ": " + cost + " $";
		
		return str;
	}

}