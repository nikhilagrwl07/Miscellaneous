
package OperatingSystem.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockedATM
{
    private Lock lock;
    private int balance=100;
    
    public LockedATM()
    {
        lock=new ReentrantLock();
    }
    
    public int withdraw(int value)
    {
        lock.lock();
        int temp=balance;
        try {
             Thread.sleep(100);
             temp=temp-value;
             Thread.sleep(100);
             balance=temp;
             System.out.println("Balance= "+balance);
        } catch (InterruptedException ex) {
            System.out.println("Withdraw operation interrupted");
        }
        lock.unlock();
       return balance;
    }
    
    public void deposit(int value)
    {
        lock.lock();
        int temp=balance;
        try {
             Thread.sleep(100);
             temp=temp+value;
             Thread.sleep(100);
             balance=temp;
             System.out.println("Balance= "+balance);
        } catch (InterruptedException ex) {
            System.out.println("Deposit operation interrupted");
        }
        lock.unlock();
    }
}

public class Locks {
    
      public static void main(String args[])
      {
         LockedATM user1=new LockedATM();
        // LockedATM user2=new LockedATM();
        
         user1.deposit(100);
         user1.deposit(100);
         user1.deposit(100);
         user1.withdraw(150);
         user1.withdraw(150);
        // user2.deposit(100);
         user1.withdraw(150);
          
          //user2.withdraw(1000);
      }
}
