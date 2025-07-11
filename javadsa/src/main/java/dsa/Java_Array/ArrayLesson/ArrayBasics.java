package dsa.Java_Array.ArrayLesson;

import java.util.Arrays;
// DSA (DAY 1): Arrays in Java 

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

        int[] num2 = {3, 4, 87, 54, 69, 41}; // Declaring array element
        int largest = num2 [0]; // Declaring another int, which will be use for as an starting point for comparing each elements in an array
        // By setting it to 0 the machine will search all of the present elements to find the largest number of the array 

        System.out.print("\nArray Elements of Num2: ");

        // Same goes for the first problem, where I print all of the elements with respective spaces 
        for (int i = 0 ; i < num2.length; i++) {
            System.out.print(num2[i] + ", ");
        }
        System.out.println("");

        /* For loop explanation: FINDING MAX VALUE 
           int i = 0. As you may remember this declares that the starting point or the index of the array always starts at 0 and NOT in 1.
           i < num2.length. This checks the value of i where if it is less than num2.lenght it will increment by 1.
           i++. This just means that if i meets the requirement of i > num2.length, this means that the value will increment by 1, so if the index 0 the next loop will be i = 1.
           if (num2[i] > largest). This checks if the element of respective index is larger than 0. Now it you can see that the first element will always be the largest, and prints right away,
           but the for loop checks all of the index until it reaches 6 then it will stop finding the largest number.
           So for the largest number it will be 87, because its index is 5 and reaching to index 6 just cancels the loop.
         */
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] > largest) {
                largest = num2[i];
            }
        }
        System.out.println("Max Value of Num2: " + largest);

        int[] num3 = {52, 98, 57, 64, 31, 88}; // Declare an array of elements 
        int sum = 0; // Sets a variable of 0 so that you have a starter of value where the array can add on to 

        System.out.print("\nArray Elements of Num3: ");

        // Same in the first problem where we print all of the arrays with respective spaces
        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i] + ", ");
        }
        System.out.println("");  
        
        for (int i = 0; i < num3.length; i++) {
            sum = sum + num3[i]; // This just simply means 0 + num3[i]. For example if i is 0 the value will be 0 + 52.
            // And so on if i now will be 1 it will be 98, so going back earlier 0 + 52 is equals to 52 now 52 + 98 will be 150. 
            // Now this will go on until 5 < num3.length because pushing it further to 6 will just end the loop.
        }
        System.out.println("Total sum of Num3: " + sum);

        int[] num4 = {1, 2, 3, 4, 5, 6};
        System.out.print("\nOriginal Elements of Num4: ");

        // Samge goes in the first problem where we print all of the arrays with respective spaaces
        for (int i = 0; i < num4.length; i++) {
            System.out.print(num4[i]+ ", ");
        }
        System.out.println("");
        
        // For loop explanation
        /* i < num4.length / 2 this just means that the loop just run the first hal of the elements
           Why? Because once you reach the middle of the elements you will just swapped elemetns that have already been swaped
           Like if you swap Index 3 with index 2, that already happened in index 2 with index 3. 
         */
        for (int i = 0; i < num4.length / 2; i++) {
            int t = num4[i]; // Safety Check point, this saves the value at the front. For i = , num4[0] = 1 sp t = 1
            num4[i] = num4[num4.length - 1 - i]; // This works by just copying the back value to the front, lets say i = 0, num4.length - 1 - 0 = 5 so the index 5 is 6, now num4[0] is now 6
            num4[num4.length - 1 - i] = t; // Now the saved t = 1 will be put in the back position so num4[5] = 1
        }
        System.out.println("Reversed Array: " + Arrays.toString(num4));
    }
}