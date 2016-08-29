package Matrix;

/**
 * Created by nikhilagrawal on 29/08/16.
 */

public class MatrixProblem {

    public static void printMatrix_Spiral_form(int a[][])
    {
        if(a==null)
            return ;

        // int column=a.length;
        int row=a.length-1;  // correct answer

        int column=a[0].length-1;  // correct answer

        // first printing row then printing column
        int i=0,j=0,k=0,p=0;

        while(j<=column && i<=row)
        {
            k=j;
            while(j<=column)
            {
                System.out.print(a[i][j]+"  ");
                j++;
            }

            i++;
            j--;
            p=i;
            while(i<=row)
            {
                System.out.print(a[i][j]+"  ");
                i++;
            }

            i--;
            j--;
            while(j>=k)
            {
                System.out.print(a[i][j]+"  ");
                j--;
            }
            i--;
            j++;
            while(i>=p)
            {
                System.out.print(a[i][j]+"  ");
                i--;
            }
            i++;
            j++;

            column--;
            row--;
        }

    }

    //Source: http://leetcode.com/2010/10/searching-2d-sorted-matrix.html
    // Time complexity= O(log(!n)) better than O(nlogn)
    public static boolean diagonalBinarysearch(int a[][],int e)
    {
        int len=a.length;
        int i,j;             // i --> row
        // j--> column
        i=0;
        j=len-1;

        if(e<a[0][0] || e>a[len-1][len-1])
            return false;

        while(i!=len-1 && j!=0)
        {
            if(a[i][j]==e||a[j][i]==e)
            {
                return true;
            }

            else if(a[i][j]>e)
            {

                // search in that row
                if(rowsearch(a,i,j-1,e)==false)
                {
                    //   System.out.println("Check 1");
                    i++;
                    j--;
                }
                else
                {
                    return true;
                }
            }
            else
            {
                if(columnsearch(a,i+1,j,e)==false)
                {
                    i++;
                    j--;
                }
                else
                    return true;
            }

            //   System.out.println(i+" , "+j);
        }

        return false;
    }

    // apply binary search here
    public static boolean rowsearch(int a[][],int row,int col,int e)
    {
        int lo=0,hi=col;
        //  int mid=(lo+hi)/2;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            // System.out.println("Check 1");
            if(a[row][mid]==e)
                return true;
            else if(a[row][mid]>e)
                hi=mid-1;
            else
                lo=mid+1;
        }

        return false;
    }

    // apply binary search here
    public static boolean columnsearch(int a[][],int row,int col,int e)
    {
        int lo=row,hi=a.length-1;
        //    int mid=(lo+hi)/2;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(a[mid][col]==e)
                return true;
            else if(a[mid][col]>e)
                hi=mid-1;
            else
                lo=mid+1;
        }

        return false;
    }

    //Source: http://leetcode.com/2010/10/searching-2d-sorted-matrix.html
    // Time complexity= O(2*n) better than O(log(!n))
    // Try out third  approach. I am NOT getting it
    public static boolean stepWise(int a[][],int e)
    {
        int len=a.length;
        if(e<a[0][0] || a[len-1][len-1]<e)
            return false;

        int lo=0,hi=a.length-1;

        while(lo!=a.length && hi!=-1)
        {
            if(a[lo][hi]==e) return true;

            else if(a[lo][hi]<e)
                lo++;
            else
                hi--;
        }

        return false;
    }

    public static boolean quadpart(int mat[][], int rowLength, int colLength, int target, int l, int u, int r, int d, int targetRow, int targetCol)
    {
        // base cases and violations
        if(l>r || u>d) return false;

        if(target<mat[l][u] || target>mat[r][d]) return false;

        int row=l+(r-l)/2;
        int col=u+(d-u)/2;

        if(mat[row][col]==target)
            return true;
        else if(l==r && u==d)
            return false;

        if(mat[row][col]>target)
        {
            return quadpart(mat, rowLength, colLength, target, col+1, u, r, row, targetRow, targetCol) ||
                    quadpart(mat, rowLength, colLength, target, l, row+1, col, d, targetRow, targetCol) ||
                    quadpart(mat, rowLength, colLength, target, l, u, col, row, targetRow, targetCol);
        }
        else
        {
            return quadpart(mat, rowLength, colLength, target, col+1, u, r, row, targetRow, targetCol) ||
                    quadpart(mat, rowLength, colLength, target, l, row+1, col, d, targetRow, targetCol) ||
                    quadpart(mat, rowLength, colLength, target, col+1, row+1, r, d, targetRow, targetCol);
        }
        // returning the cases for quad Partition
    }

    public static void main(String[] args) {
        int a[][]={
                {1,4,7,11},
                {2,5,8,12},
                {3,6,9,16},
                {10,13,14,17},
                {18,21,23,26},
        };

//1,4,7,11,15
//1  4  7  11  15  19  22  24  30  26  23  21  18  10  3  2  5  8  12  16  17  14  13  6  9
        System.out.println("Spiral Order traversal of Matrix = ");
        printMatrix_Spiral_form(a);

//          int e=21;
//        System.out.println(a.length);
//      System.out.println("Element= "+e+" : "+diagonalBinarysearch(a,e));
        // System.out.println("Element= "+e+" : "+stepWise(a,e));

        //   int t=21;
        // System.out.println("Element = "+t+"  "+ quadpart(a,a.length,a.length,t,0,0,4,4,0,0));
    }
}
