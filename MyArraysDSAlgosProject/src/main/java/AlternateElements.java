import java.util.Scanner;
public class AlternateElements {

    /*public  static void main(String[] args) {

        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements");
        for(int i = 0; i < n ; i ++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Alternate elements are");
        for(int i = 0; i < n ; i += 2) {
            System.out.println(array[i]);

        }*/
    //printing the alternate numbers using the recursion method
    static void printAlternate(int array[] , int index) {
        if(index >= array.length) {
            return;
        }
        System.out.println(array[index] +" ");
        printAlternate(array, index+2);//method calling


    }
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Enter teh array size
        int array[] = new int[n];//array creation
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Alternate numbers in array");
        printAlternate(array, 0);
    }

}