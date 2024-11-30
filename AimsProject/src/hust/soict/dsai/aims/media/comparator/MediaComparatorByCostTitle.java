package hust.soict.dsai.aims.media.comparator;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {
	
	public int compare(Media a, Media b) {
		
		Comparator<Media> CostTitle =
				Comparator.comparing(Media::getCost).reversed().thenComparing(Media::getTitle);
		
		return CostTitle.compare(a, b);
	}
}
