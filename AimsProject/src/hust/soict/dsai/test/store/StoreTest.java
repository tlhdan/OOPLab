package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		
		Store store = new Store();
		
		CompactDisc cd = new CompactDisc("Supernatural", "K-Pop", "NewJeans", 8.93f);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Supernatural", "Horror", "Eric Kripke", 24.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Supernatural");
		
		Book book = new Book("The Communist Manifesto", "Philosophy", 4.65f);
		
		store.addMedia(cd);
		store.addMedia(dvd1);
		store.addMedia(dvd3);
		store.addMedia(book);
		
		store.print();
		
		store.removeMedia(book);
		store.removeMedia(dvd2);
		
		store.print();
	}

}
