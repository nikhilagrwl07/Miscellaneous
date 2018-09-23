package Random;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class BufferedReaderExample {


    private static StringTokenizer st;

    public static void nextLine(BufferedReader br) throws IOException
    {
        st = new StringTokenizer(br.readLine());
    }

    public static int nextInt()
    {
        return Integer.parseInt(st.nextToken());
    }

    public static String next()
    {
        return st.nextToken();
    }

    public static long nextLong()
    {
        return Long.parseLong(st.nextToken());
    }

    public static double nextDouble()
    {
        return Double.parseDouble(st.nextToken());
    }
    public static void main(String[] args) throws IOException {
        int h1 , h2, a , b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nextLine(br);
        h1= nextInt();
        h2 = nextInt();
        System.out.println(h1);
        System.out.println(h2);
        nextLine(br);
        a= nextInt();
        b = nextInt();
        int days = getdays(h1, h2, a, b);
//        System.out.println("days  = " + days);

        // System.out.println(count + "count");
        //  BufferedOutputStream bos = new BufferedOutputStream(System.out);
        BufferedWriter bos = new BufferedWriter(new OutputStreamWriter(System.out));
        bos.write(days+"\n"); //    write(String.valueOf(count));
        bos.flush();
    }


    public static int getdays(int h1 , int h2 , int a , int b){
        if(h1==h2) return 0;
        if(h1>h2) return -1;

        // starting time 10 AM to 10 PM
        int i;
        int days=0;
//
        if(b>=a)
        {
            int compute = h1 + (a*(8)) - h2;
            if(compute<0)
            {
                return -1;

            }
        }

        while(h1!=h2)
        {
            for(i=15;i<=22;i++)
            {
//                print(h1, h2);
                if(h1<h2)
                {
                    h1=h1+a;
                }

                if(h1>=h2)
                {
                    return days;
                }
            }


            for(i=23;i<=24;i++)
            {
//               if(h1-b<=0)
//               {
//                   h1=0;
//                   break;
//               }

                h1=h1-b;
//                print(h1, h2);
//                if(h1==h2)
//                {
//                    break;
//                }
            }

            for(i=1;i<=10;i++)
            {
//               if(h1-b<=0)
//               {
//                   h1=0;
//                   break;
//               }


                h1=h1-b;
//                print(h1, h2);
//                if(h1==h2)
//                {
//                    break;
//                }
            }

            for(i=11;i<15;i++)
            {
//                print(h1, h2);

                if(h1<h2)
                {
                    h1=h1+a;
                }

//                if(h1==h2)
//                {
////                    System.out.println("going to break");
//                   break;
//                }
            }
            days++;

        }
        return days;


    }
    public static void print(int h1, int h2)
    {
        System.out.println("h1 = " + h1 + " h2 = " + h2);
    }



}