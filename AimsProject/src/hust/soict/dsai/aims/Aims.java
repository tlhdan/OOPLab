package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

	public class Aims {
		
		public static Scanner scanner = new Scanner(System.in);
		
		public static Store store = new Store();
		
		public static Cart cart = new Cart();
		
		public static void main(String[] args) {
			
		CompactDisc cd = new CompactDisc("Supernatural", "K-Pop", "NewJeans", 8.93f);
			
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Supernatural", "Horror", "Eric Kripke", 24.95f);
			
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
			
		Book book = new Book("The Communist Manifesto", "Philosophy", 4.65f);
			
		store.addMedia(cd);
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(book);
			
		showMenu();
		viewMenu();
	
	}
	
	public static void viewMenu() {
		
		String optionMenu = scanner.nextLine();
		
		if (optionMenu.equals("0")) {
			System.out.println("Goodbye!");
		
		} else if (optionMenu.equals("1")) {
			store.print();
			storeMenu();
			viewStore();
		
		} else if (optionMenu.equals("2")) {
			updateMenu();
			updateStore();
		
		} else if (optionMenu.equals("3")) {
			cart.print();
			cartMenu();
			seeCart();
		
		} else {
			System.out.println("Please enter a valid option.");
			viewMenu();
		}
	}
	public static void updateStore() {
		
		String optionUpdate = scanner.nextLine();
		
		if (optionUpdate.equals("0")) {
			showMenu();
			viewMenu();
		
		} else if (optionUpdate.equals("1")) {
			System.out.println("What type of media do you want to add?");
			addMediaTypeMenu();
			addMediaToStore();
		
		} else if (optionUpdate.equals("2")) {
			removeMediaFromStore();
		
		} else {
			System.out.println("Please enter a valid option.");
			updateStore();
		}
	}
	public static void addMediaToStore() {
		
		String optionMediaType = scanner.nextLine();
		
		if (optionMediaType.equals("0")) {
			updateMenu();
			updateStore();
		
		} else if (optionMediaType.equals("1")) {
			addDvd();
			showMenu();
			viewMenu();
		
		} else if (optionMediaType.equals("2")) {
			addCd();
			showMenu();
			viewMenu();
		
		} else if (optionMediaType.equals("3")) {
			addBook();
			showMenu();
			viewMenu();
		
		} else {
			System.out.println("Please enter a valid option.");
			addMediaToStore();
		}
	}
	public static void addDvd() {
		
		System.out.print("Enter DVD title: ");
		String dvdTitle = scanner.nextLine();
		
		System.out.print("Enter DVD category. Type 0 to skip: ");
		String dvdCategoryOption = scanner.nextLine();
		String dvdCategory = null;
		if (!(dvdCategoryOption).equals("0")) {
			dvdCategory = dvdCategoryOption;
		}
		
		System.out.print("Enter DVD director. Type 0 to skip: ");
		String dvdDirectorOption = scanner.nextLine();
		String dvdDirector = null;
		if (!(dvdDirectorOption).equals("0")) {
			dvdDirector = dvdDirectorOption;
		}
		
		System.out.print("Enter DVD length. Type 0 to skip: ");
		String dvdLengthOption = scanner.nextLine();
		int dvdLength = 0;
		if (isInteger(dvdLengthOption)) {
			dvdLength = Integer.parseInt(dvdLengthOption);
		} else {
			System.out.println("Not a valid length.");
		}
		
		System.out.print("Enter DVD cost. Type 0 to skip: ");
		String dvdCostOption = scanner.nextLine();
		float dvdCost = 0;
		if (isFloat(dvdCostOption)) {
			dvdCost = Float.parseFloat(dvdCostOption);
		} else {
			System.out.println("Not a valid cost.");
		}
		
		DigitalVideoDisc newDvd = new DigitalVideoDisc(dvdTitle, dvdCategory, dvdDirector, dvdLength, dvdCost);
		store.addMedia(newDvd);
	}
	public static void addCd() {
		
		System.out.print("Enter CD title: ");
		String cdTitle = scanner.nextLine();
		
		System.out.print("Enter CD category. Type 0 to skip: ");
		String cdCategoryOption = scanner.nextLine();
		String cdCategory = null;
		if (!(cdCategoryOption).equals("0")) {
			cdCategory = cdCategoryOption;
		}
		
		System.out.print("Enter CD artist. Type 0 to skip: ");
		String cdAritstOption = scanner.nextLine();
		String cdArtist = null;
		if (!(cdAritstOption).equals("0")) {
			cdArtist = cdAritstOption;
		}
		
		System.out.print("Enter CD cost. Type 0 to skip: ");
		String cdCostOption = scanner.nextLine();
		float cdCost = 0;
		if (isFloat(cdCostOption)) {
			cdCost = Float.parseFloat(cdCostOption);
		} else {
			System.out.println("Not a valid cost.");
		}
		
		CompactDisc newCd = new CompactDisc(cdTitle, cdCategory, cdArtist, cdCost);
		
		addNewTrack(newCd);
		
		store.addMedia(newCd);
	}
	public static void addNewTrack(CompactDisc cd) {
		
		System.out.print("Enter track title. Type 0 to skip: ");
		String trackTitleOption = scanner.nextLine();
		String trackTitle = null;
		if (trackTitleOption.equals("0")) {
			return;
		} else if (!(trackTitleOption).equals("0")) {
			trackTitle = trackTitleOption;
		}
		
		System.out.print("Enter track length. Type 0 to skip: ");
		String trackLengthOption = scanner.nextLine();
		int trackLength = 0;
		if (isInteger(trackLengthOption)) {
			trackLength = Integer.parseInt(trackLengthOption);
		} else {
			System.out.println("Not a valid length.");
		}
		
		Track newTrack = new Track(trackTitle, trackLength);
		cd.addTrack(newTrack);
		addNewTrack(cd);
	}
	public static void addBook() {
		
		System.out.print("Enter book title: ");
		String bookTitle = scanner.nextLine();
		
		System.out.print("Enter book category. Type 0 to skip: ");
		String bookCategoryOption = scanner.nextLine();
		String bookCategory = null;
		if (!(bookCategoryOption).equals("0")) {
			bookCategory = bookCategoryOption;
		}
		
		Book newBook = new Book(bookTitle, bookCategory);
		
		while (true) {
			System.out.print("Enter book authors. Type 0 to skip: ");
			String bookAuthorsOption = scanner.nextLine();
			if (bookAuthorsOption.equals("0")) {
				break;
			} else {
				newBook.addAuthor(bookAuthorsOption);;
			}
		}
		
		System.out.print("Enter book cost. Type 0 to skip: ");
		String bookCostOption = scanner.nextLine();
		float bookCost = 0;
		if (isFloat(bookCostOption)) {
			bookCost = Float.parseFloat(bookCostOption);
		} else {
			System.out.println("Not a valid cost.");
		}
		newBook.setCost(bookCost);
		
		store.addMedia(newBook);
	}
	public static void removeMediaFromStore() {
		
		System.out.print("Enter the title of the item: ");
		String strTitle = scanner.nextLine();

		ArrayList<Media> mediaWithTitle = new ArrayList<Media>();
		for (Media m : store.getItemsInStore()) {
			if (m.getTitle().equals(strTitle)) {
				mediaWithTitle.add(m);
			}
		}
		
		if (mediaWithTitle.size() == 0) {
			System.out.println("There is no item with the title " + strTitle + ".");
			noMatchingTitleMenu();
			String optionNoMatch = scanner.nextLine();
			
			if (optionNoMatch.equals("0")) {
				store.print();
				storeMenu();
				viewStore();
			
			} else if (optionNoMatch.equals("1")) {
				removeMediaFromStore();
			}
		
		} else if (mediaWithTitle.size() == 1) {
			store.removeMedia(mediaWithTitle.get(0));
			store.print();
			storeMenu();
			viewStore();
		
		} else {
			System.out.println("These are the items with title " + strTitle + ": ");
			for (int i = 0; i < mediaWithTitle.size(); i++) {
				System.out.println(i + 1 + ". " + mediaWithTitle.get(i).toString());
			}
			int i = chooseMedia(mediaWithTitle);
			store.removeMedia(mediaWithTitle.get(i));
			store.print();
			storeMenu();
			viewStore();
		}
	}
	
	public static void viewStore() {
		
		String optionStore = scanner.nextLine();
		
		if (optionStore.equals("0")) {
			showMenu();
			viewMenu();
		
		} else if (optionStore.equals("1")) {
			seeMediaDetails();
		
		} else if (optionStore.equals("2")) {
			addMediaToCart();
		
		} else if (optionStore.equals("3")) {
			playMedia();
		
		} else if (optionStore.equals("4")) {
			cart.print();
			cartMenu();
			seeCart();
		
		} else {
			System.out.println("Please enter a valid option.");
			viewStore();
		}
	}
	
	public static void seeCart() {
		
		String optionCart = scanner.nextLine();
		
		if (optionCart.equals("0")) {
			store.print();
			storeMenu();
			viewStore();
		
		} else if (optionCart.equals("1")) {
			filterMenu();
			filterMedia();
		
		} else if (optionCart.equals("2")) {
			sortMenu();
			sortMedia();
		
		} else if (optionCart.equals("3")) {
			removeMediaFromCart();
		
		} else if (optionCart.equals("4")) {
			playMedia();
		
		} else if (optionCart.equals("5")) {
			System.out.println("An order has been created");
			cart = new Cart();
			showMenu();
			viewMenu();
		
		} else {
			System.out.println("Please enter a valid option.");
			seeCart();
		}
	}
	
	public static void removeMediaFromCart() {
		
		System.out.print("Enter the title of the item: ");
		String strTitle = scanner.nextLine();

		ArrayList<Media> mediaWithTitle = new ArrayList<Media>();
		for (Media m : store.getItemsInStore()) {
			if (m.getTitle().equals(strTitle)) {
				mediaWithTitle.add(m);
			}
		}
		
		if (mediaWithTitle.size() == 0) {
			System.out.println("There is no item with the title " + strTitle + ".");
			noMatchingTitleMenu();
			String optionNoMatch = scanner.nextLine();
			
			if (optionNoMatch.equals("0")) {
				store.print();
				storeMenu();
				viewStore();
			
			} else if (optionNoMatch.equals("1")) {
				removeMediaFromCart();
			}
		
		} else if (mediaWithTitle.size() == 1) {
			cart.removeMedia(mediaWithTitle.get(0));
			cart.print();
			cartMenu();
			seeCart();
		
		} else {
			System.out.println("These are the items with title " + strTitle + ": ");
			for (int i = 0; i < mediaWithTitle.size(); i++) {
				System.out.println(i + 1 + ". " + mediaWithTitle.get(i).toString());
			}
			int i = chooseMedia(mediaWithTitle);
			cart.removeMedia(mediaWithTitle.get(i));
			cart.print();
			cartMenu();
			seeCart();
		}
	}

	public static void sortMedia() {
		
		String optionSort = scanner.nextLine();
		
		if (optionSort.equals("0")) {
			cart.print();
			cartMenu();
			seeCart();
		
		} else if (optionSort.equals("1")) {
			System.out.println("***********************CART***********************");
			System.out.println("Items sorted by title:");
			Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
			for (Media m : cart.getItemsOrdered()) {
				System.out.println(m);
			}
			System.out.println("***************************************************");
			System.out.println("Press 0 to go back.");
			while (true) {
				String optionBack = scanner.nextLine();
				if (optionBack.equals("0")) {
					break;
				}
			}
			cartMenu();
			seeCart();
		
		} else if (optionSort.equals("2")) {
			System.out.println("***********************CART***********************");
			System.out.println("Items sorted by cost:");
			Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
			for (Media m : cart.getItemsOrdered()) {
				System.out.println(m);
			}
			System.out.println("***************************************************");
			System.out.println("Press 0 to go back.");
			while (true) {
				String optionBack = scanner.nextLine();
				if (optionBack.equals("0")) {
					break;
				}
			}
			cartMenu();
			seeCart();
			
		
		} else {
			System.out.println("Please enter a valid option.");
			sortMedia();
		}
	}
	
	public static void filterMedia() {
		
		String optionFilter = scanner.nextLine();
		
		if (optionFilter.equals("0")) {
			cart.print();
			cartMenu();
			seeCart();
		
		} else if (optionFilter.equals("1")) {
			System.out.print("Enter ID: ");
			filterId();
			System.out.println("Press 0 to go back.");
			while (true) {
				String optionBack = scanner.nextLine();
				if (optionBack.equals("0")) {
					break;
				}
			}
			cartMenu();
			seeCart();
		
		} else if (optionFilter.equals("2")) {
			System.out.print("Enter title: ");
			filterTitle();
			System.out.println("Press 0 to go back.");
			while (true) {
				String optionBack = scanner.nextLine();
				if (optionBack.equals("0")) {
					break;
				}
			}
			cartMenu();
			seeCart();
			
		} else {
			System.out.println("Please enter a valid option.");
			filterMedia();
		}
	}
	
	public static void filterId() {
		
		String strId = scanner.nextLine();
		
		if (isInteger(strId)) {
			int iId = Integer.parseInt(strId);
			System.out.println("***********************CART***********************");
			System.out.println("Items with ID " + strId + ":");
			cart.searchId(iId);
		
		} else {
			System.out.println("Please enter a valid ID.");
			filterId();
		}
		
		System.out.println("***************************************************");
	}
	
	public static void filterTitle() {
		
		String strTitle = scanner.nextLine();
		
		System.out.println("***********************CART***********************");
		System.out.println("Items with title " + strTitle + ":");
		cart.searchTitle(strTitle);
		
		System.out.println("***************************************************");
	}
	
	public static void playMedia() {
		
		System.out.print("Enter the title of the item: ");
		String strTitle = scanner.nextLine();
		
		ArrayList<Media> mediaWithTitle = new ArrayList<Media>();
		for (Media m : store.getItemsInStore()) {
			if (m.getTitle().equals(strTitle)) {
				mediaWithTitle.add(m);
			}
		}
		
		if (mediaWithTitle.size() == 0) {
			System.out.println("There is no item with the title " + strTitle + ".");
			noMatchingTitleMenu();
			String optionNoMatch = scanner.nextLine();
			
			if (optionNoMatch.equals("0")) {
				store.print();
				storeMenu();
				viewStore();
			
			} else if (optionNoMatch.equals("1")) {
				playMedia();
			}
		
		} else if (mediaWithTitle.size() == 1) {
			checkAndPlayMedia(mediaWithTitle.get(0));
			System.out.println("Press 0 to go back.");
			while (true) {
				String optionBack = scanner.nextLine();
				if (optionBack.equals("0")) {
					break;
				}
			}
			System.out.println(mediaWithTitle.get(0));
			mediaDetailsMenu();
			viewMedia(mediaWithTitle.get(0));
		
		} else {
			System.out.println("These are the items with title " + strTitle + ": ");
			for (int i = 0; i < mediaWithTitle.size(); i++) {
				System.out.println(i + 1 + ". " + mediaWithTitle.get(i).toString());
			}
			int i = chooseMedia(mediaWithTitle);
			checkAndPlayMedia(mediaWithTitle.get(i));
			System.out.println("Press 0 to go back.");
			while (true) {
				String optionBack = scanner.nextLine();
				if (optionBack.equals("0")) {
					break;
				}
			}
			System.out.println(mediaWithTitle.get(i));
			mediaDetailsMenu();
			viewMedia(mediaWithTitle.get(i));
		}
	}
	
	public static void addMediaToCart() {
		
		System.out.print("Enter the title of the item: ");
		String strTitle = scanner.nextLine();

		ArrayList<Media> mediaWithTitle = new ArrayList<Media>();
		for (Media m : store.getItemsInStore()) {
			if (m.getTitle().equals(strTitle)) {
				mediaWithTitle.add(m);
			}
		}
		
		if (mediaWithTitle.size() == 0) {
			System.out.println("There is no item with the title " + strTitle + ".");
			noMatchingTitleMenu();
			String optionNoMatch = scanner.nextLine();
			
			if (optionNoMatch.equals("0")) {
				store.print();
				storeMenu();
				viewStore();
			
			} else if (optionNoMatch.equals("1")) {
				addMediaToCart();
			}
		
		} else if (mediaWithTitle.size() == 1) {
			cart.addMedia(mediaWithTitle.get(0));
			System.out.println("Number of items in cart: " + cart.getItemsOrdered().size());
			cart.print();
			cartMenu();
			seeCart();
		
		} else {
			System.out.println("These are the items with title " + strTitle + ": ");
			for (int i = 0; i < mediaWithTitle.size(); i++) {
				System.out.println(i + 1 + ". " + mediaWithTitle.get(i).toString());
			}
			int i = chooseMedia(mediaWithTitle);
			cart.addMedia(mediaWithTitle.get(i));
			System.out.println("Number of items in cart: " + cart.getItemsOrdered().size());
			cart.print();
			cartMenu();
			seeCart();
		}
	}
	
	public static void seeMediaDetails() {
		
		System.out.print("Enter the title of the item: ");
		String strTitle = scanner.nextLine();
		
		ArrayList<Media> mediaWithTitle = new ArrayList<Media>();
		for (Media m : store.getItemsInStore()) {
			if (m.getTitle().equals(strTitle)) {
				mediaWithTitle.add(m);
			}
		}
		
		if (mediaWithTitle.size() == 0) {
			System.out.println("There is no item with the title " + strTitle + ".");
			noMatchingTitleMenu();
			String optionNoMatch = scanner.nextLine();
			
			if (optionNoMatch.equals("0")) {
				store.print();
				storeMenu();
				viewStore();
			
			} else if (optionNoMatch.equals("1")) {
				seeMediaDetails();
			}
		
		} else if (mediaWithTitle.size() == 1) {
			System.out.println(mediaWithTitle.get(0));
			mediaDetailsMenu();
			viewMedia(mediaWithTitle.get(0));
		
		} else {
			System.out.println("These are the items with title " + strTitle + ": ");
			for (int i = 0; i < mediaWithTitle.size(); i++) {
				System.out.println(i + 1 + ". " + mediaWithTitle.get(i).toString());
			}
			int i = chooseMedia(mediaWithTitle);
			System.out.println(mediaWithTitle.get(i));
			mediaDetailsMenu();
			viewMedia(mediaWithTitle.get(i));
		}
	}
	
	public static int chooseMedia(ArrayList<Media> mediaList) {
		
		System.out.println("Enter the index of the item you want: ");
		String strIndex = scanner.nextLine();
		
		if (isInteger(strIndex)) {
			
			int iIndex = Integer.parseInt(strIndex) - 1;
			if (iIndex < mediaList.size()) {
				return iIndex;
			
			} else {
				System.out.println("Not a valid index.");
				return chooseMedia(mediaList);
			}
					
		} else {
			System.out.println("Not a valid index.");
			return chooseMedia(mediaList);
		}
	}
	
	public static void viewMedia(Media media) {
		
		String optionMediaDetails = scanner.nextLine();
		
		if (optionMediaDetails.equals("0")) {
			store.print();
			storeMenu();
			viewStore();
		
		} else if (optionMediaDetails.equals("1")) {
			cart.addMedia(media);
			System.out.println(media);
			mediaDetailsMenu();
			viewMedia(media);
		
		} else if (optionMediaDetails.equals("2")) {
			checkAndPlayMedia(media);
			System.out.println(media);
			mediaDetailsMenu();
			viewMedia(media);
		
		} else {
			System.out.println("Please enter a valid option.");
			viewMedia(media);
		}
	}
	
	public static void checkAndPlayMedia(Media media) {
		
		if (media instanceof CompactDisc) {
			((CompactDisc) media).play();
		
		} else if (media instanceof DigitalVideoDisc) {
			((DigitalVideoDisc) media).play();
		
		} else {
			System.out.println("'Play' option is not available for books.");
		}
	}
	
	public static boolean isInteger(String s) {
	    
		try { 
	        Integer.parseInt(s); 
	    
		} catch(NumberFormatException e) { 
	        return false; 
	    
		} catch(NullPointerException e) {
	        return false;
	    }

	    return true;
	}
	
	public static boolean isFloat(String s) {
	    
		try { 
	        Float.parseFloat(s); 
	    
		} catch(NumberFormatException e) { 
	        return false; 
	    
		} catch(NullPointerException e) {
	        return false;
	    }

	    return true;
	}
	
	
	public static void showMenu() {
		
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() { 

		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() { 

		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() { 

		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void noMatchingTitleMenu() { 

		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Choose another item");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
	}

	public static void filterMenu() {
		
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by ID");
		System.out.println("2. Filter by title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void sortMenu() {
		
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by title");
		System.out.println("2. Sort by cost");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void updateMenu() {
		
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a media to the store");
		System.out.println("2. Remove a media from the store");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
	}
	
	public static void addMediaTypeMenu() {
		
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. DVD");
		System.out.println("2. CD");
		System.out.println("3. Book");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

}