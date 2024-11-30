package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		
		Cart cart = new Cart();
		
		CompactDisc cd = new CompactDisc("Supernatural", "K-Pop", "NewJeans", 8.93f);
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("Supernatural", "Horror", "Eric Kripke", 24.95f);
		
		Book book = new Book("The Communist Manifesto", "Philosophy", 4.65f);
		
		cart.addMedia(cd);
		cart.addMedia(dvd);
		cart.addMedia(book);
		
		// Test the print method
		cart.print();
		
		// Test the search method
		cart.searchId(2);
		cart.searchId(4);
		
		cart.searchTitle("The Communist Manifesto");
		cart.searchTitle("Communist Manifesto");
	}

}
