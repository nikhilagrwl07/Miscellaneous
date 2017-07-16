package Java8Constructs.InputOutput.HackerRankUbertest;

/**
 * @author Nikhil Agrawal on 7/16/17.
 */
public class BotReachableProblem {

  public static void main(String args[] ) throws Exception {
      System.out.println(canReach(1,2,2,1));
  }

  static String canReach(int x1, int y1, int x2, int y2)
  {

      if(x1==x2 && y1==y2)
        return "Yes";

    if(x1>x2 || y1>y2 ){
      return "No";
    }
            /* Move forward in x direction */
      if (canReach( x1 + y1, y1, x2 , y2).equalsIgnoreCase("Yes") || canReach( x1, x1+y1, x2 , y2).equalsIgnoreCase("Yes"))
            return "Yes";

        return "No";
  }

}



