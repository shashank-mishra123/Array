package oops;

public class check_sort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,1};
        int sort=0;
        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] < arr[j + 1]) {
                sort++;
            }

        }
        System.out.println(sort);
            if ((arr.length-1)==sort)
            {
                System.out.println(" given array sorted");
            }
            else {
                System.out.println("not sorted");
            }
    }
}
