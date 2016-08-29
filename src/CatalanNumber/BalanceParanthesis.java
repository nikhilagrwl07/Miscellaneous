package CatalanNumber;

/**
 * Created by nikhilagrawal on 29/08/16.
 */

public class BalanceParanthesis
{
    public static void main(String[] args) {

        System.out.println("All possible combinations:");
        int t=3;

//      paranthesis(t, 0, "");
//      System.out.println("---------------------");


        paranthesis2(0, 0, "",t);
        System.out.println("---------------------");

        paranthesis3(t, t, "");
        System.out.println("---------------------");

        //  paranthesisUtil(3);


        //  System.out.println("---------------------");
        // parens(3);  // Did not understood

    }

    public static void paranthesis(int s,int e,String st)
    {
        if(s==0 && e==0)
        {
            // System.out.println("s= "+s+" e= "+e+" st= "+st);
            System.out.println(st);
            return;
        }

        if(s>0)
        {
            //  System.out.println("s= "+s+" e= "+e+" st= "+st);
            paranthesis(s-1,e+1,st+"{");
        }

        if(e>0)
        {
            // System.out.println("s= "+s+" e= "+e+" st= "+st);
            paranthesis(s,e-1,st+"}");
        }

    }

    public static void paranthesis2(int s,int e,String st,int t)
    {

        if(s>t || e>t)
            return ;

        if(s==t && e==t)
        {
            System.out.println(st);
            return;
        }

        paranthesis2(s+1,e,st+"{",t);

        if(s>e)
        {
            paranthesis2(s,e+1,st+"}",t);
        }
    }

    public static void paranthesis3(int s,int e,String st)
    {
        if(s==0 && e==0)
        {
            //  System.out.println("s= "+s+" e= "+e+" st= "+st);
            System.out.println(st);
            return;
        }

        if(s>0)
        {
            //System.out.println("s= "+s+" e= "+e+" st= "+st);
            paranthesis3(s-1,e,st+"{");
        }

        if(e>0 && e>s)
        {
            //    System.out.println("s= "+s+" e= "+e+" st= "+st);
            paranthesis3(s,e-1,st+"}");
        }

    }

    public static void paranthesisUtil(int n)
    {
        if(n > 0)
            _printParenthesis(0, n, 0, 0);
        //  return;
    }

    static char[] str=new char[100];
    public static void _printParenthesis(int pos, int n, int s, int e)
    {

        if(e == n)
        {
            System.out.print("s= "+s+" e="+e+" str= ");
            System.out.println(str);
            // return;
        }
        else
        {
            if(s < n) {
                str[pos] = '{';
                System.out.println("s= "+s+" e="+e);
                _printParenthesis(pos+1, n, s+1, e);
            }


            if(s > e) {
                str[pos] = '}';
                System.out.println("s= "+s+" e="+e);
                _printParenthesis(pos+1, n, s, e+1);
            }
        }
    }




    //http://discuss.joelonsoftware.com/default.asp?interview.11.437754.20
    public static void parens(int pairs)
    {
        int i, j, s, n = 2*(pairs - 1);

        for (i = 0; i < 1 << n; i++) {
            for (s = 1, j = 0; (j < n) && (s >= 0) && (s <= pairs); j++)
                s += ((i >> j) & 1)==1 ? 1 : -1;
            if ((j != n) || (s != 1))
                continue;
            System.out.print('(');
            for (j = 0; j < n; j++)
            {
                if(((i >> j) & 1)==1)
                {
                    System.out.print('(');
                }
                else
                {
                    System.out.print(')');
                }
            }
            System.out.println(")\n");
        }
    }

}

