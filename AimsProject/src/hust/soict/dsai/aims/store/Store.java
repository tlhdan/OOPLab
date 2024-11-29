package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	
	private static ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		
		if (itemsInStore.contains(media)) {
			
			System.out.println("The item is already in store.");
		
		} else {
			
			itemsInStore.add(media);
			System.out.println("The item has been added.");
		}
	}
	
	public void removeMedia(Media media) {
		
		if (itemsInStore.contains(media)) {
			
			itemsInStore.remove(media);
			System.out.println("The item has been removed.");
		
		} else {
			
			System.out.println("The item is not in store.");
		}	
	}
	
	public void print() {
		
		System.out.println("***********************STORE***********************");
		
		if (itemsInStore.size() == 0) {
			
			System.out.println("No items in store.");
			
		} else {
			
			System.out.println("Items in store:");
			
			for (Media media : itemsInStore) {
				System.out.println(media.getId() + ". " + media);
			}
		}
		
		System.out.println("***************************************************");
	}
}
