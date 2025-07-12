package dsa.Java_Array.ArrayLesson;

public class ArrayMaxValue {
    public static void main (String[] args) { 

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
    }
}