
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsordered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
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
}
