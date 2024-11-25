package hust.soict.dsai.aims.store;
import java.util.*;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
	
	private static ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
		System.out.println("The disc has been added.");
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		if (itemsInStore.contains(dvd)) {
			itemsInStore.remove(dvd);
			System.out.println("The disc has been removed.");
		} else {
			System.out.println("The disc is not in store.");
		}
		
	}
	
	public void print() {
		System.out.println("***********************STORE***********************");
		if (itemsInStore.size() == 0) {
			System.out.println("No items in store.");
		} else {
			System.out.println("Items in store:");
			for (int i = 0; i < itemsInStore.size(); i++) {
				System.out.println(itemsInStore.get(i).getID() + ". " + itemsInStore.get(i));
			}
		}
		System.out.println("***************************************************");
	}
}
