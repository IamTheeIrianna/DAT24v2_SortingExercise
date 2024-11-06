import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {

        //------------- Array creation ------------------
        // Creating an array of numbers, like a messy drawer of socks
        //each number in the array represents the number of socks in that drawer
        int[] numbers = {5, 2, 8, 1, 9, 3};

        //-----------Print--------------
        // Printing the unsorted array, like showing the messy drawer
        //This is equivalent to dumping out all the socks on the bed
        //and looking at the mess. We're seeing what we're dealing with before we
        //start organizing.
        System.out.println("Usorteret array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    // Adding a new line for better readability, like taking a breath before organizing
        System.out.println(); // for udprintes skyld så hver talrække kommer på hver deres linje

    //------------------------ sorting the Array ------------------------
        // Sorting the array, like organizing the socks by color or size
        //This is the actual process of organizing the socks. Maybe you're pairing them up, or arranging them by color
        Arrays.sort(numbers);

        // Printing the sorted array, like showing off the neatly organized drawer
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
