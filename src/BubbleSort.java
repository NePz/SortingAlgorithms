import java.io.Console;
import java.util.Arrays;

public class BubbleSort {
    //https://www.geeksforgeeks.org/bubble-sort/
    public static void bubbleSort(int[] N) {
        System.out.println("Bubble Sort:");
        System.out.println("Unsorted: " + Arrays.toString(N));

        //Sorting Code:
        for (int i = 0; i < N.length - 1; i++) {
            for (int j = 0; j < N.length - 1; j++) {
                if (N[j] > N[j + 1]) {
                    int temp = N[j];
                    N[j] = N[j + 1];
                    N[j + 1] = temp;
                }
            }

        }
        System.out.println(ConsoleColours.GREEN_BRIGHT + "Sorted: " + Arrays.toString(N) + ConsoleColours.RESET);
    }

    public static void bubbleSortSteps(int[] N) {
        int count = 0;
        System.out.println(ConsoleColours.RED_BOLD_BRIGHT + "To sort:" + Arrays.toString(N) + ConsoleColours.RESET);
        for (int i = 0; i < N.length - 1; i++) {
            for (int j = 0; j < N.length - 1; j++) {
                System.out.println("Comparing:" + N[j] + "," + N[j + 1]);
                if (N[j] < N[j + 1]) {
                    System.out.println(ConsoleColours.BLUE_BRIGHT+"No swap needed"+ConsoleColours.RESET);
//                    System.out.println(N[j] + "," + N[j + 1] + ConsoleColours.GREEN_BRIGHT + "OK" + ConsoleColours.RESET);
                }
                if (N[j] > N[j + 1]) {
                    count++;
                    System.out.println(ConsoleColours.RED_BRIGHT + "Swap (" + N[j] + " <- " + N[j + 1] + ")" + ConsoleColours.RESET);
                    int temp = N[j]; // store bigger value to temp memory
                    N[j] = N[j + 1]; // Load smaller value into bigger value's position
                    N[j + 1] = temp; // Load the bigger value (stored in temp) into the next array element order
                    System.out.print("Step " + count + ": " + Arrays.toString(N) + "\n");
                }
            }

        }
        System.out.println(ConsoleColours.GREEN_BOLD_BRIGHT + "Sorted: " + Arrays.toString(N) + ConsoleColours.RESET);
    }
}

