package dsa.Java_Array.ArrayLesson;

/* Problem: Given an array of integers, write a method to find the index
   of a given target number.

   Note: If the target exists, return its first index; if not return -1.
*/

public class ArrayLinearSearch {
    public static void main (String[] args) {

        int[] num1 = {87, 5, 6, 97, 97, 69}; // Declare array 
        int index1 = linearSearch1(num1, 69); // Used function linearSearch to search for the value 69

        System.out.print("Array Elements 1: ");

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + ", ");
        }
        System.out.println(" ");
        // Conditionals: This checks the loop of the program 
        // if (index != -1) This means that if the the index is not equal to -1 the element is found
        if(index1 != -1) {
            System.out.println("Element found at index: " + index1);
        } else {
            System.out.println("Element not found.");
        } 

        int[] num2 = {44, 98, 74, 54, 65, 58};
        int index2 = linearSearch2(num2, 98);

        System.out.print("\nArray Elements 2: ");

        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + ", ");
        }
        System.out.println(" ");

        if(index2 != -1) {
            System.out.println("Element found at:  " + index2);
        } else {
            System.out.println("Element not found");
        }

        int[] num3 = {56, 98, 51, 66, 23, 54, 98};
        int index3 = linearSearch3(num3, 66);

        System.out.print("\nArray Element 3: ");

        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i] + ", ");
        }
        System.out.println("");

        if(index3 != -1) {
            System.out.println("Element found at: " + index3);
        } else {
            System.out.println("Element not found");
        }
    }

    // Create private function use for loop and use int[] num and int value as parameters
    private static int linearSearch1(int[] num1, int value) {
        // For Loops: As the previous exercises, for loops will keep looping until it faild to meet its condition
        for (int i = 0; i < num1.length; i++) {
            if(num1[i] == value) { // This explains that if num[i] lets say its num[2] == value it will return i, and that i based on the array will return as 6
                return i;
            }
        }
       return -1; // Return -1 one if not found. Why use -1 ? Because -1 is not a valid index in Java Arrays.
       // Returning to -1 is a convention in programming to indacate that something is not found 
    }  

    private static int linearSearch2(int[] num2, int value) {
        for(int i = 0; i < num2.length; i++) {
            if(num2[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static int linearSearch3(int[] num3, int value) {
        for(int i = 0; i < num3.length; i++) {
            if(num3[i] == value) {
                return i;
            }
        }
        return -1;
    }
}