package dsa.Java_Array.ArrayLesson;

// Array, a fixed size indexed collection of elements of the same type, that is stored contiguously in a memory.

// First DSA Problem
/* 1. Declare and initialize an array with at least 6 integers
   2. Print all the elements, SEPERATED by spaces
   3. Find and Print the maximum value in the array
   4. Calculate and print the sum of all elements
   5. Write a method to reverse the array in place (no new array)
 */

public class ArrayBasics {
    public static void main(String[] args) {

        int[] num1 = {3, 5, 10, 12, 56, 6}; // Declaring array of integers.
        // Index always starts at 0. And that 0 is valued as 3, since it is the first element in our array.
        // And the last index is 5 which is equals to 6. 
        System.out.print("Array Elements of Num1: ");

        // For loop explanation 
        // int i = 0. This indicates that the index starts at 0
        // i < num.length indicates that the program will loop as long as i is less than the length of the array which is 6.
        // i++ This indicates that after each loop, the i increments by 1 
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + ", ");
        }
        System.out.println("");
        // For in depth explanation: Lets translate the code into english, so the for loop works like 
        /* If int i = 0 and the i is less than num.length (6) we print the i. 
           If int i = 1 and the i is less than num length (6) we print the i.
           If int i = 2 and the i is less than num length (6) we perint the i.
           and so on.
           If int i = 6 then the loop will stop since it no longer meet its condition of i > num.length since it now will 6 = 6. 
         */
    }
}