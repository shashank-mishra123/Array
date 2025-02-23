package oops;

import java.util.Scanner;
import java.util.*;
public class insertion{
    public static void main(String[] args)
    {
        int arr[]={7,8,3,2,1};
        for (int i=0;i<arr.length-1;i++) {
            int smal = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smal] > arr[j]) {
                    smal = j;
                }
            }
                int temp = arr[smal];
                arr[smal] = arr[i];
                arr[i] = temp;

        }
        for (int a:arr){
            System.out.println(a);
        }
    }
}