package oops;

public class recursion_with_pattren {
    public static void patter(int i,int j)
    {
        if (j!=5 ||i<=5) {
            System.out.println("*");
            j++;
            patter(i+1,j+1);
        }
             else if (i==5) {
            System.out.println();
                 patter(i+1,j);
        }

          else {
            return;
        }
    }
    public static void main(String[] args) {
        int i=1;
        int j=1;
         patter(i,j );
    }
}
