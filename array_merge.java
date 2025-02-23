package oops;

public class array_merge {
    public static void main(String[] args) {
        int num1[]={8,3,5,7};
        int num2[]={5,4,6,8};
        int merg1[]={0,0,0,0};
        int lentgh= num2.length+ num1.length;
        for (int i=0;i<lentgh;i++)
        {
            for (int j=0;j< num1.length;j++)
            {
                for (int k=0;k< num2.length;k++)
                {
                    merg1[i]= Math.max(num1[j], num2[k]);
                }
            }
        }
        for (int i=0;i<lentgh;i++)
        {
            System.out.println(merg1[i]);
        }
    }
}
