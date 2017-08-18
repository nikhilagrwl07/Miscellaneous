/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing.CustomhashMap;

public class HashMapCustomApp {

	public static void main(String[] args) {
		HashMapCustom<String, Integer> hashMapCustom = new HashMapCustom<String, Integer>();
		hashMapCustom.put("abc", 12);
		hashMapCustom.put("abcd", 100);
		hashMapCustom.put("abcde", 121);
		hashMapCustom.put("abcdef", 121);
		hashMapCustom.put("abcd", 122);
		hashMapCustom.put("abc", 123);

		// hashMapCustom.put(29, 150);
		//           hashMapCustom.put(30, 151);
		//           hashMapCustom.put(33, 15);
		//           hashMapCustom.put(35, 89);
		//
		//           System.out.println("value corresponding to key 21="
		//                        + hashMapCustom.get("nikki"));
		//           System.out.println("value corresponding to key 29="
		//                        + hashMapCustom.get("nikki"));
		////
		////           System.out.print("Displaying : ");
		////           hashMapCustom.display();
		////
		//           System.out.println("\n\nvalue corresponding to key 21 removed: "
		//                        + hashMapCustom.remove(21));
		//
		//            System.out.println("value corresponding to key 21="
		//                        + hashMapCustom.get(21));

		//           System.out.println("value corresponding to key 51 removed: "
		//                        + hashMapCustom.remove("nikki"));
		System.out.println("value corresponding to key =" + hashMapCustom.get("abc"));
		//
		//           System.out.print("Displaying : ");
		//           hashMapCustom.display();

	}
}
 
