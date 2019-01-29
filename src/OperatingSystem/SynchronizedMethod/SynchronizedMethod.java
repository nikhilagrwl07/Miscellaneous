
package OperatingSystem.SynchronizedMethod;


class Myclass extends Thread
{
  private String name;
  private MyObject myObj;
  
  public Myclass(MyObject obj,String n)
  {
      name=n;
     myObj=obj;
  }
  
  @Override
  public void run()
  {
      myObj.foo(name);
  }
    
}

class MyObject
{
    public  void foo(String name)
    {
        synchronized(this)
        {
            try {
                System.out.println("Thread "+name+" .foo() starting");
                Thread.sleep(3000);
                System.out.println("Thread "+name+" .foo() ending");
            } catch (InterruptedException ex) {
                System.out.println("Thread "+name+" .foo() interrupted");
            }
        }
    }
}

public class SynchronizedMethod
{
      public static void main(String args[])
      {
          
   // Different objects are called so synchronized will not into focus       
          MyObject obj1=new MyObject();
          MyObject obj2=new MyObject();
          
//          Myclass thread1=new Myclass(obj1, "1");
//          Myclass thread2=new Myclass(obj2, "2");
//          
//          thread1.start();
//          thread2.start();
          
        MyObject obj=new MyObject();
          Myclass thread1=new Myclass(obj, "1");
          Myclass thread2=new Myclass(obj, "2");
          
          thread1.start();
          thread2.start();
          
      }
}
