package Chapter4;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Size of the array is " + myArray.length);
        System.out.println("Enter array elements:");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        System.out.println("Elements of the array are:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }

        System.out.println("Sum of the elements of the array: " + sum);
        
        input.close();
    }
}
