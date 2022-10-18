/*
Goal: Write a program that will sort an array. It must have the following specs:
- Sort an array from highest to lowest
- The array to be sorted must be inputed from the terminal. So the Scanner class must be used.
- The class must have the following methods:
    1. getIntegers that takes in a parameter of type int.
    2. printArray accepts an array and prints out the contents of the array.
    3. sortIntegers accepts an unsorted array, and will return a new sorted array.
 - The expected flow:
    - getIntegers() -> sortIntegers() -> printArray
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {
public int[] getIntegers(int lengthOfArray){
    Scanner scanner = new Scanner(System.in);
    int[] numbersArray = new int[lengthOfArray];
    System.out.println("Enter the numbers in the array:");
    for(int i =0;i<lengthOfArray;i++){
        int number = scanner.nextInt();
        numbersArray[i] = number;
    }
    scanner.close();
    return numbersArray;
}

public int[] sortIntegers(int[] unsortedArray){
    Arrays.sort(unsortedArray);
    int[] sortedArray = new int[unsortedArray.length];
    int j=0;
    for (int i=unsortedArray.length-1; i>=0;i--){
        sortedArray[j]=unsortedArray[i];
    }
     return unsortedArray;
}
public  void printArray(int[] sortedArray){
    for (int i = 0; i < sortedArray.length; i++) {
        System.out.println("Element "+i + " contents "+ sortedArray[i]);
    }
}
}
