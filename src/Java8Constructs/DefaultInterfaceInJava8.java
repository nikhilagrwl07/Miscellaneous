package Java8Constructs;

/**
 * @author Nikhil Agrawal on 5/19/17.
 */
public class DefaultInterfaceInJava8 {

}

interface vehicle{
  default void print(){
    System.out.println("I am in vehicle");
  }
}


interface fourWheeler{
  default void print(){
    System.out.println("I am in fourWheeler");
  }
}


//public class car implements vehicle, fourWheeler {
//  default void print(){
//    System.out.println("I am a four wheeler car vehicle!");
//  }
//}

//public class car implements vehicle, fourWheeler {
//  default void print(){
//    vehicle.super.print();
//  }
//}
