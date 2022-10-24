/*
Goal:
- Write a method called readInteger() that has no parameters and returns an int.
    - It will take in an integer from the user. This integer will represent how many elements the user needs to enter.
- Write another method called readElements() that has one parameter of type `int`
    - This method will read from the console until it has the number of elements specified in the readInteger function
- Write another method called findMin() which will take in a parameter of type int[]. It will return the minimum value in the array.
 */
import java.util.Collections;
import java.util.Scanner;
public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements would you like in the array?");
        int number = scanner.nextInt();
        return number;
    }
    private static int[] readElements(int numOfElements){
        int[] returnedArray = new int[numOfElements];
        System.out.println("Input the elements in the array");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numOfElements; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            returnedArray[i]=number;
        }
        return returnedArray;
    }
    private static int findMin(int[] array){
        int smallest = array[0]; // Stores the smallest integer

        // Loop through array looking for smallest integer
        for (int i = 0; i < array.length; i++) {

            // Checking for smallest integer in array
            if (smallest > array[i]) {
                smallest = array[i];
            }
        } // End of loop

        return smallest;
    }
}
