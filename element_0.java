package oops;

public class element_0 {
    public static void main(String[] args) {
        int [][] arr={{1,1,1},{1,0,1},{1,1,1}};
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++)
            {
                if (arr[i][j]==0)
                {
                    System.out.print(i+" "+j);
                }
            }
        }
        System.out.println(" for checked");
        for (int i=0;i< arr.length;i++)
        {
            for (int j=0;j< arr.length;j++)
            {
                if(i==1||j==1)
                {
                    arr[i][j]=0;
                }
                else {
                    arr[i][j]=arr[i][j];
                }
            }

        }
        System.out.println(" for  changes");
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
