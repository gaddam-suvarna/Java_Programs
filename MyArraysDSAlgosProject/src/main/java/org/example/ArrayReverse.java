package org.example;
import java.util.Scanner;

public class ArrayReverse {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        //Enter the array size from user
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        //Create an array
         int array[] = new int[n];
         //Enter the array elements
         System.out.println("Enter the array elements");
         for(int i =0; i < n; i++) {
             array[i] = sc.nextInt();
         }
         // Initialize start to the left
         int start = 0;
        // Initialize end to the right
         int end = n-1;
    //Iterate till start is less than end
         while(start < end) {

        //Swap the elements position
             int temp = array[start];
             array[start] = array[end];
             array[end] = temp;

             //Increase the start
             start++;
             //Decrease the end
             end--;
         }
         //Print the reversed array
        System.out.println("Reversed Array");
         for(int i = 0; i < n; i++) {
             System.out.print(array[i]+ " ");
         }


    }

    /*public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        //create the temp array
        int temp[] = new int[n];
        //copy elements in reverse array
        for(int i = 0; i < n; i++) {
            temp[i] = array[n-1-i];
        }
        for(int i =0; i < n; i++) {
            array[i] = temp[i];
        }
        System.out.println("Reversed Array");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }*/


}
