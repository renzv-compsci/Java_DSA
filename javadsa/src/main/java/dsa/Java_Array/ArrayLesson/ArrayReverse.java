package dsa.Java_Array.ArrayLesson;

// Write a method to reverse the array in place (no new array)

import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[] args) {

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
