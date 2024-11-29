package hust.soict.dsai.aims.media;

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
}
