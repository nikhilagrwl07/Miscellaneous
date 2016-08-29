
package Hashing.hashingbasic1;

import java.util.Objects;

public class HashingBasic {

    public static void main(String[] args) 
    {       
        Person other=new Person();
        other.setId(200901160);        
        other.setFirstName("Nikhil");
        other.setLastName("Agrawal");
   
        
        //System.out.println(other.getClass());
        int hashcode=other.hashCode();
        System.out.println("Hashcode = "+hashcode);
        
        // defining different object
        Person next=new Person();
        next.setId(200901149);
         next.setFirstName("Ritu");
        next.setLastName("Agrawal");
        
        
        
        if(other.equals(next))
            System.out.println("Same object");
        else
            System.out.println("Different object");
   
    
    }
}

class Person
{
    private int id;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) 
        {
            return true;
        }
        
        if (obj!=null && (this.getClass() != obj.getClass()))
        {
            return false;
        }
        
        final Person other = (Person) obj;
        
        if (this.id != other.id) {
            return false;
        }
        if (this.firstName.equals(other.firstName)) {
            return false;
        }
        if (this.lastName.equals(other.lastName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        int prime=31;
        hash = prime * hash + this.id;
        
        int t=(firstName==null)?0:hashcode(firstName);
        hash = prime * hash + t;
        
        int t2=(lastName==null)?0:hashcode(lastName);
        hash = prime * hash + t2;
        
        return hash;
    }
  
// Source: http://java-bytes.blogspot.in/2009/10/hashcode-of-string-in-java.html
    // For performing hashing of a string
    public int hashcode(String s)
    {
        if(s==null)
            return 0;
        
        int hashCode1=0;
      //  int hashCode2=0;
        int d=31; //s.length();
        int q=101;
        
       for(int i=0;i<s.length();i++)
       {
           hashCode1=(hashCode1*d+s.charAt(i))%q;
        //   hashCode2=(hashCode2<<5)-hashCode2+s.charAt(i);
       }
       
       
       System.out.println("String = "+s+" Hashcode ="+hashCode1);
      // System.out.println("Hashcode 2="+hashCode2);
       
       return hashCode1;
    }
    
}

class Name
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Name other = (Name) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    
    
}