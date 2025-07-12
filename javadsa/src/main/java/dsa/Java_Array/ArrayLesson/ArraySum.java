package dsa.Java_Array.ArrayLesson;

// Calculate and print the sum of all elements
public class ArraySum {
    public static void main (String[] args) {

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
        
    }
}
