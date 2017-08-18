package Java8Constructs.Maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikhilagrawal on 21/02/17.
 */
public class MapToIntExample {
	
	public static void main(String[] args) {
	      /* Create an object of `Item` and set values */
		Item itemSamsungGalaxy6 = new Item();
		itemSamsungGalaxy6.setName("Samsung Galaxy 6");
		itemSamsungGalaxy6.setQuantity(20);
		
		Item itemNexus = new Item();
		itemNexus.setName("Nexus 5");
		itemNexus.setQuantity(12);
		
		/**
		 * - Create `List` of `Item`
		 * - Add `itemSamsungGalaxy6` and `itemNexus` to List.
		 */
		List<Item> listItems = new ArrayList<>();
		listItems.add(itemSamsungGalaxy6);
		listItems.add(itemNexus);
		
		/**
		 * JavaDoc: `mapToInt` method
		 * Returns an IntStream consisting of the results of applying the given function to the elements of this stream.
		 *
		 * Explanation: `.mapToInt(Item::getQuantity)` / `.mapToInt(item -> item.getQuantity())`
		 * In this operation we are calling method `getQuantity()` on each object of `Item` in List.
		 * That returns the `IntStream` of value(Quantity) of all object in List.
		 * And we are doing summation of all quantity
		 */
		int totalQuantity = listItems.stream().mapToInt(Item::getQuantity).sum();

        /* Print the total quantity */
		System.out.println("Total Quantity: " + totalQuantity);
	}
}
