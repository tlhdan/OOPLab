package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("Not enough space in cart.");
			
		} else {
			
			itemsOrdered.add(media);
			System.out.println("The item has been added.");
			
			if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
				System.out.print(" The cart is almost full.");
			}
		}
		
	}
	
	public void addMedia(Media[] mediaList) {
		
		if (itemsOrdered.size() + mediaList.length > MAX_NUMBERS_ORDERED) {
			System.out.println("Not enough space in cart.");
			
		} else {
			
			for (Media media : mediaList) {
				itemsOrdered.add(media);
			}
			System.out.println("The discs have been added.");
			
			if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
				System.out.print(" The cart is almost full.");
			}
			
		}
	}
	
	public void removeMedia(Media media) {
		
		if (!itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("The item has been removed.");
		
		} else {
			System.out.println("The item is not in cart.");
		}
	}
	
	public float totalCost() {
		
		float total = 0;
		for (Media media : itemsOrdered) {
			total += media.getCost();
		}
		
		return total;
	}
	
	public void print() {
		
		System.out.println("***********************CART***********************");
		
		if (itemsOrdered.size() == 0) {
			System.out.println("The cart is empty.");
		
		} else {
			
			System.out.println("Ordered Items:");
			
			for (int i = 0; i < itemsOrdered.size(); i++) {
				System.out.println(i + 1 + ". " + itemsOrdered.get(i));
			}
			
			System.out.println("Total cost: " + totalCost() + " $");
			
			System.out.println("***************************************************");
		}
	}
	
	public void searchId(int id) {
		
		boolean inCart = false;
		
		for (int i = 0; i < itemsOrdered.size(); i++) {
			
			if (itemsOrdered.get(i).getId() == id) {
				
				System.out.println(itemsOrdered.get(i) + " is number " + (i + 1) + " in cart.");
				inCart = true;
			}
		}
		
		if (!inCart) {
			System.out.println("Item ID " + id + " is not in cart.");
		}
	}
	
	public void searchTitle(String title) {
		
		boolean inCart = false;
		
		for (int i = 0; i < itemsOrdered.size(); i++) {
			
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				
				System.out.println(itemsOrdered.get(i) + " is number " + (i + 1) + " in cart.");
				inCart = true;
			}
		}
		
		if (!inCart) {
			System.out.println("Item titled " + title + " is not in cart.");
		}
	}
	
}
