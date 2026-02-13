package org.example;
import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        //Read the array size
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        //create an array
        int array[] = new int[n];
        //Read the array elements
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i = 0; i < n-1; i++) {
            while(array[i] >= array[i+1] ) {
                isSorted = false;
                break;
            }

        }

        if(isSorted) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");

        }
    }
}
