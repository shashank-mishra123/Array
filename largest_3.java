package oops;

import java.util.*;
public class largest_3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 50, 493, 31};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter how many element largest");
        int lar = sc.nextInt();


        int large = arr.length - lar;


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
                if (count>=large) {
                    System.out.println(arr[i]);
                }
        }
    }
}
