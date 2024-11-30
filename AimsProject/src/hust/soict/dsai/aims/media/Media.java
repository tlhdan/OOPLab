package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.media.comparator.*;
import java.util.Comparator;

public abstract class Media {
	
	public Media(String title) {
		super();
		this.title = title;
		this.setId();
	}

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.setId();
	}

	private int id;
	private String title;
	private String category;
	private float cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	private static int nbMedia = 0;
	
	private void setId() {
		nbMedia += 1;
		this.id = nbMedia;
	}
	
	public boolean equals(Object o) {
		
		if (!(o instanceof Media)) {
			
			return false;
		}
		
		if (!(this.getClass().equals(o.getClass()))) {
			
			return false;
		}
		
		Media obj = (Media) o;
		
		return this.getTitle().equals(obj.getTitle());
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST =
			new MediaComparatorByTitleCost();
	
	public static final Comparator<Media> COMPARE_BY_COST_TITLE =
			new MediaComparatorByCostTitle();
}