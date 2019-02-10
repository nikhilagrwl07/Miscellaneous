/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaIsPassByValue;

/**
 *
 * @author nikhil.agrawal
 */
public class JavaIsPassByValue {
    
    public static void main(String[] args) {

        Dog d = new Dog("Max");
        
        if(d.getName().equalsIgnoreCase("MAX"))
        {
            System.out.println("Inside MAX");
        }
        
        // Here object reference is passed by value
        modifyDog(d);
        
        
        if(d.getName().equalsIgnoreCase("MAX"))
        {
            System.out.println("Inside MAX");
        }
        
    }
    
     static void modifyDog(Dog newDog)
    {
        
       if(newDog.getName().equalsIgnoreCase("MAX"))
        {
            System.out.println("Inside MAX");
        }
        
       newDog= new Dog("jeeni");
       
        if(newDog.getName().equalsIgnoreCase("MAX"))
        {
            System.out.println("Inside MAX");
        }
        else
        {
          System.out.println("Inside Jenni"); 
        }
       
       
    }


}


class Dog
{
    String name;

    public Dog(String name) {
        this.name=name;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
//    String height;
    
    
    
}
