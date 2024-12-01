package hust.soict.dsai.aims.media;

public class Track implements Playable {
	
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track(String title) {
		super();
		this.title = title;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean equals(Object o) {
		
		if (!(o instanceof Track)) {
			
			return false;
		}
		
		Track obj = (Track) o;
		
		return this.getTitle().equals(obj.getTitle()) && this.getLength() == obj.getLength();
	}
	
	@Override
	public void play() {
		
		if (this.getLength() <= 0) {
			System.out.println("\nCan't play track " + this.getTitle());
		
		} else {
			System.out.println("\nPlaying track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		}
	}
}
