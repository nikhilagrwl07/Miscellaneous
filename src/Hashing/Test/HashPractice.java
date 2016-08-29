
package Hashing.Test;

import java.util.HashMap;

public class HashPractice {

    public static void main(String[] args) 
    {       
        HashMap <Test, String> hm = new HashMap(); 

        Test t1 = new Test(); 

      
         
       // hm.put(t1,"success"); 

        System.out.println(hm.get(t1)); //print success 

        t1.i = 10; 
        
         hm.put(t1,"failure"); 
        System.out.println(hm.get(t1)); //NULL 
        
         Test t2 = new Test(); 
          t2.i = 10; 
        
        // hm.put(t2,"failure"); 
          System.out.println(hm.get(t2)); //NULL 
          
//        //hm.put(t1,"success"); 
//        
//        t1.i = 100; 
//            System.out.println(hm.get(t1)); //NULL 
//         
//         t1.i = 10; 
//
//        System.out.println(hm.get(t1)); //NULL     
    }
    
}
class Test 
{ 
public int i=0; 

    @Override 
    
    public int hashCode() 
    { 
    return i; 
    }

   @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Test other = (Test) obj;
        if (this.i != other.i) {
            return false;
        }
        return true;
    }

} 