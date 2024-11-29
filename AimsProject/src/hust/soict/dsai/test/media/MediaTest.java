package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.*;
import java.util.List;
import java.util.ArrayList;

public class MediaTest {

	public static void main(String[] args) {
		
		List<Media> mediae = new ArrayList<Media>();
		
		CompactDisc cd = new CompactDisc("Supernatural", "K-Pop", "NewJeans", 351, 8.93f);
		DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		Book book = new Book("The Communist Manifesto", "Philosophy", 4.65f);
		book.addAuthor("Karl Marx");
		book.addAuthor("Friedrich Engels");
		
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
	}

}