package oops;

public class arry_palindrtome {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2,3, 1, 0};
        int n = arr.length;
        int count = 0;
        for (int j=0;j< arr.length;j++) {
            for (int i =n-1; i >0; i--) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
        }
            if (count == (n / 2)) {
                System.out.println("  not palindrome");
            } else {
                System.out.println(" palindrome");
            }

    }
}
