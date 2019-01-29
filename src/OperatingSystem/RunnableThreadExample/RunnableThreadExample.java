
package OperatingSystem.RunnableThreadExample;

public class RunnableThreadExample implements Runnable
{
    public int count=0;
    
    @Override
    public void run()
    {
        System.out.println("Runnable thread starting.");
        try{
            while(count<5)
            {
     System.out.println(Thread.currentThread().getName()+" ==>count = "+count);
                Thread.sleep(500);
                count++;
            }
        } 
        catch(InterruptedException exc)
        {
             System.out.println("Runnable thread interrupted");
        }
        
         System.out.println("Runnable thread terminating.");
    }
    
    public static void main(String args[])
    {
        RunnableThreadExample instance=new RunnableThreadExample();
        
        Thread thread=new Thread(instance);
        thread.setName("Thread 1");
        
        Thread thread2=new Thread(instance);
        thread2.setName("Thread 2");
        
//No new address will be created and process will run in same add space 
//method will simply be executed in the same Thread and new Thread will not be created        
       //instance.run();
        
//When we call start() method of Thread class Java Virtual machine execute run() method 
// of that Thread class into separate Thread other than calling thread.
      thread.start();
      //thread2.start();
      
      
        // Waits until above thread counts to 5(Slowly)
        while(instance.count!=5){
            try{
                System.out.println("Inside Main ==> count= "+instance.count);
                Thread.sleep(250);
                //instance.count++;
            } catch(InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }
    
    
}
