package BubbleSort;

/**
 * Simple class to sort an array of integers using the bubble sort algorithm,
 * and print that array on one line to the console.  The integers are
 * pre-populated in the program.
 * 
 * @author Jimmy Shultz
 * @version 1.0
 * @since 1.0
 */
public class Main {
    /**
     * Main method of the class.
     * @param args command line arguments are unused in this program
     * @since 1.0
     */
    public static void main(String[] args) {
        int[] myArray = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};
        bubbleSort(myArray);
        printArray(myArray);
    }

    /**
     * Sorts the given array using the bubble sort algorithm.
     * @param listOfNums the array of numbers to be sorted
     * @since 1.0
     */
    public static void bubbleSort(int[] listOfNums) {
        int listOfNumsLength = listOfNums.length;
        for (int i = 0; i < listOfNumsLength; i++) {
            for (int j = 0; j < listOfNumsLength - i - 1; j++) {
                if (listOfNums[j] > listOfNums[j+1]) {
                    int temporaryElement = listOfNums[j];
                    listOfNums[j] = listOfNums[j+1];
                    listOfNums[j+1] = temporaryElement;
                }
            }
        }
    }

    /**
     * Prints all elements of the given array in order on one line
     * separated by a space.  Then prints a new line.
     * @param listOfNums the array to be printed
     * @since 1.0
     */
    public static void printArray(int[] listOfNums) {
        int listOfNumsLength = listOfNums.length;
        for (int i = 0; i < listOfNumsLength; i++) {
            System.out.print(listOfNums[i] + " ");
        }
        System.out.println();
    }
}
