
package Hashing.Hashing1;

import java.util.Arrays;

public class RemoveDuplicateChar {
    
    public static void main(String args[])
    {
        char[] c="ergbdowqhjfrhgAJHVSKJQPOMNQERFNVjbvfvdfgborbvvbnn".toCharArray();
        
        System.out.println("Original String :\n"+Arrays.toString(c) );
        
        System.out.println("Array after removing duplicate charcters : " );
        removeDuplicates(c);
    }
    
    public static void removeDuplicates(char[] c)
    {
        if(c.length==0 || c.length==1)
        {
            System.out.println(c);
            return;
        }
        
        int[] a=new int[26+26];
        
        for(int j=0;j<a.length;j++)
        {
            a[j]=0;
        }
        
        for(int i=0;i<c.length;i++)
        {
            int t;
            if(c[i]>=97 && c[i]<=122)
            {
                t=c[i]-97+26;
            }
            else 
            {
                t=c[i]-65;
            }
           
           // System.out.println(t);
            if(a[t]==0)
            {
                System.out.print(c[i]+" ");
                a[t]=1;
            }
            
        }
    }
}
