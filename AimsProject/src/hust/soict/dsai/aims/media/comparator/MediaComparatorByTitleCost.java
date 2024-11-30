package hust.soict.dsai.aims.media.comparator;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	
	public int compare(Media a, Media b) {
		
		Comparator<Media> TitleCost =
				Comparator.comparing(Media::getTitle).thenComparing(Comparator.comparing(Media::getCost).reversed());
		
		return TitleCost.compare(a, b);
	}
}
