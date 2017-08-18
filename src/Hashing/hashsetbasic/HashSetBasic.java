package Hashing.hashsetbasic;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class HashSetBasic {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://wordpress.org/extend/plugins/about/readme.txt");

		HashSet hs = new HashSet();
		TreeSet ts = new TreeSet();
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		Scanner sc = new Scanner(url.openStream());

       
        /*while(sc.hasNext()) 
           hs.add(sc.next());
                
    //    Iterator itr=hs.iterator();
        
        //while(itr.hasNext())
          //  System.out.println(itr.next());
        */
		//  while(sc.hasNext())
		//    ts.add(sc.next());

		while (sc.hasNext())
			lhs.add(sc.next());


		Iterator itr2 = lhs.iterator();

		while (itr2.hasNext())
			System.out.println(itr2.next());
	}
}
