package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MediaTest {

	public static void main(String[] args) {
		
		List<Media> mediae = new ArrayList<Media>();
		
		CompactDisc cd = new CompactDisc("Supernatural", "K-Pop", "NewJeans", 8.93f);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Supernatural", "Horror", "Eric Kripke", 936, 24.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		Book book = new Book("The Communist Manifesto", "Philosophy", 4.65f);
		book.addAuthor("Karl Marx");
		book.addAuthor("Friedrich Engels");
		
		mediae.add(cd);
		mediae.add(dvd1);
		mediae.add(book);
		mediae.add(dvd2);
		
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
		
		System.out.println("\nSort by title:");
		Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
		
		System.out.println("\nSort by cost:");
		Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
	}

}