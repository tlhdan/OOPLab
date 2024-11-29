package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private static DigitalVideoDisc itemsordered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private static int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsordered[qtyOrdered] = disc;
			qtyOrdered += 1;
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The disc has been added. The cart is almost full.");
			} else {
				System.out.println("The disc has been added.");
			}
		} else {
			System.out.println("Can't add disc to full cart.");
		}
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
			System.out.println("Not enough space in cart.");
		} else {
			for (int i = 0; i < dvdList.length; i++) {
				itemsordered[qtyOrdered] = dvdList[i];
				qtyOrdered += 1;
			}
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The discs have been added. The cart is almost full.");
			} else {
				System.out.println("The discs have been added.");
			}
		}
	}
	
	/*
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
			System.out.println("Not enough space in cart.");
		} else {
			for (int i = 0; i < dvdList.length; i++) {
				itemsordered[qtyOrdered] = dvdList[i];
				qtyOrdered += 1;
			}
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The discs have been added. The cart is almost full.");
			} else {
				System.out.println("The discs have been added.");
			}
		}
	}
	*/
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("Not enough space in cart.");
		} else {
			itemsordered[qtyOrdered] = dvd1;
			qtyOrdered += 1;
			itemsordered[qtyOrdered] = dvd2;
			qtyOrdered += 1;
			
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The discs have been added. The cart is almost full.");
			} else {
				System.out.println("The discs have been added.");
			}
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsordered[i] == disc) {
				qtyOrdered -= 1;
				for (int j = i; j < qtyOrdered; j++) {
					itemsordered[j] = itemsordered[j + 1];
				}
				itemsordered[MAX_NUMBERS_ORDERED - 1] = null;
				System.out.println("The disc has been removed.");
				return;
			}
		}
		System.out.println("The disc is not in cart.");
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsordered[i].getCost();
		}
		return total;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty.");
		} else {
			System.out.println("Ordered Items:");
			for (int i = 0; i < qtyOrdered; i++) {
				System.out.println(i + 1 + ". " + itemsordered[i]);
			}
			System.out.println("Total cost: " + totalCost() + " $");
			System.out.println("***************************************************");
		}
	}
	
	public void searchID(int id) {
		boolean inCart = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsordered[i].getId() == id) {
				System.out.println(itemsordered[i] + " is number " + (i + 1) + " in cart.");
				inCart = true;
			}
		}
		if (!inCart) {
			System.out.println("Disc ID " + id + " is not in cart.");
		}
	}
	
	public void searchTitle(String title) {
		boolean inCart = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsordered[i].getTitle().equals(title)) {
				System.out.println(itemsordered[i] + " is number " + (i + 1) + " in cart.");
				inCart = true;
			}
		}
		if (!inCart) {
			System.out.println("Disc titled " + title + " is not in cart.");
		}
	}
	
}
