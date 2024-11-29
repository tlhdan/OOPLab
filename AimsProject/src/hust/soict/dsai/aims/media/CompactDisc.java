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

	public CompactDisc(String title, String category, String artist, int length, float cost) {
		super(title, category, length, cost);
		this.artist = artist;
	}

	public void addTrack(Track track) {
		
		if (tracks.contains(track)) {
			
			System.out.print("The track is already on the disc.");
		
		} else {
			
			tracks.add(track);
			System.out.println("The track has been added.");
		}
	}
	
	public void removeAuthor(Track track) {
		
		if (!tracks.contains(track)) {
			
			System.out.println("The track is not on the disc.");
		
		} else {
			
			tracks.remove(track);
			System.out.println("The track has been removed.");
		}
	}
	
	public int getLength() {
		
		int length = 0;
		
		for (Track track : tracks) {
			length += track.getLength();
		}
		
		return length;
	}

	@Override
	public void play() {
		
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		
		for (Track track : tracks) {
			track.play();
		}
	}
}
