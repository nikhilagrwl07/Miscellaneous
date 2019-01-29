
package OperatingSystem.ThreadClassExample;

public class ThreadClassExample extends Thread
{
    public int count=0;
    
    @Override
    public void run()
    {
        while(count<=5)
        {
            try {
                System.out.println("Inside RUN :: "+ Thread.currentThread().getName()+"==>"+count);
                Thread.sleep(500);
                count++;
            } catch (InterruptedException ex) {
                System.out.println("Multithreading interrupted");
            }
        }
       
    }
    
    public static void main(String args[])
    {
        ThreadClassExample instance=new ThreadClassExample();
        instance.setName("Thread 1");
        instance.start();//   run();
        
        while(instance.count<=5)
        {
            System.out.println("Main Method ==>"+instance.count);
            try {
                ThreadClassExample.sleep(250);
            } catch (InterruptedException ex) {
                System.out.println("Multithreading interrupted");
            }
        }
        
    }
    
}
