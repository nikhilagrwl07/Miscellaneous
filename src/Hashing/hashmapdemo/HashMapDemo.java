
package Hashing.hashmapdemo;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {

    public static void main(String[] args)  throws IOException
    {
       String[] line="Ritu Ritu Nikhil Agrawal Agrawal Agrawal AA aa b B 99 is a 89 9 9 9  9 $ $ good boy is good".split(" ");
       //  URL url=new URL("http://www.andrew.cmu.edu/course/15-121/dictionary.txt");
              
    //  Scanner sc = new Scanner(url.openStream());
       
      HashMap<String, Integer> hm = new HashMap();
    
      TreeMap<String, Integer> tm = new TreeMap();
       LinkedHashMap<String, Integer> lhm = new LinkedHashMap();


       int i=-1; 
       
      while(++i<line.length)
      {
          String key=line[i];       //sc.next();
         Integer freq=lhm.get(key);
         // Integer freq=hm.get(key);
          if(freq==null)
              freq=1;
          else
              freq++;
          
          lhm.put(key, freq);
      }
      
      System.out.println(lhm);   
      System.out.println(); 
       
      int j=-1;
      
      while(++j<line.length)
      {
            String key=line[j];
          Integer freq=hm.get(key);
          if(freq==null)
              freq=1;
          else
              freq++;
          
          hm.put(key, freq);
      }
      
       System.out.println(hm);   
      System.out.println();
      
           
       System.out.println(); 
       
      int k=-1;
      
      while(++k<line.length)
      {
           String key=line[k];
          Integer freq=tm.get(key);
         
          if(freq==null)
              freq=1;
          else
              freq++;
          
          tm.put(key, freq);
        //  sc.next();
      }
        System.out.println(tm);
        
  } 
        
}
