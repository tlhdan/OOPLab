package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	public String toString() {
		
		String str = "DVD";
		if (getTitle() != null) {
			str += " - " + getTitle();
		}
		if (getCategory() != null) {
			str += " - " + getCategory();
		}
		if (getDirector() != null) {
			str += " - " + getDirector();
		}
		str += " - " + getLength();
		str += ": " + getCost() + " $";
		
		return str;
	}

	@Override
	public void play() {
		
		if (this.getLength() <= 0) {
			System.out.println("\nCan't play DVD " + this.getTitle());
		
		} else {
			System.out.println("\nPlaying DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
	}
}