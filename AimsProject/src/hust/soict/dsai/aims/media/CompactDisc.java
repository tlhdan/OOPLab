package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}

	public CompactDisc(String title) {
		super(title);
	}

	public CompactDisc(String title, String artist) {
		super(title);
		this.artist = artist;
	}
	
	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public CompactDisc(String title, String category, String artist, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}

	public void addTrack(Track track) {
		
		if (tracks.contains(track)) {
			
			System.out.println("The track is already on the disc.");
		
		} else {
			
			tracks.add(track);
			System.out.println("The track has been added.");
		}
	}
	
	public void removeTrack(Track track) {
		
		if (!tracks.contains(track)) {
			
			System.out.println("The track is not on the disc.");
		
		} else {
			
			tracks.remove(track);
			System.out.println("The track has been removed.");
		}
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getLength() {
		
		int length = 0;
		
		for (Track track : tracks) {
			length += track.getLength();
		}
		
		return length;
	}

	public String toString() {
		
		String str = "CD";
		if (getTitle() != null) {
			str += " - " + getTitle();
		}
		if (getCategory() != null) {
			str += " - " + getCategory();
		}
		if (artist != null) {
			str += " - " + artist;
		}
		str += " - " + getLength();
		str += ": " + getCost() + " $";
		
		return str;
	}
	
	@Override
	public void play() {
		
		System.out.println("\nPlaying CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		
		for (Track track : tracks) {
			track.play();
		}
	}
}