import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {
    public static void main(String[] args) {
        System.out.println("Running Sorting Algorithm..");
        start();
    }

    public static void start() {
        System.out.println(ConsoleColours.YELLOW_BOLD_BRIGHT + "// Welcome to Sorting Algorithms Demo //");
        //Vars
        String choice = "0";
        int[] N = {5, 2, 3, 1};
        int[] tempArray = new int[N.length];
        System.out.println(ConsoleColours.PURPLE_BOLD_BRIGHT + "Input Array N =>: " + Arrays.toString(N) + ConsoleColours.RESET);

        //Prompt Interface
        Scanner sortSelection = new Scanner(System.in);

        System.out.println("Which Sort?");
        System.out.println(ConsoleColours.GREEN_UNDERLINED + "0 - Exit");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Merge Sort");
        System.out.println("3 - Selection Sort");
        System.out.println("4 - Quick Sort");
        System.out.println("5 - Heap Sort" + ConsoleColours.RESET);

        choice = sortSelection.nextLine();

        switch (choice) {
            case "0":
                System.out.println("Exit code 0");
                System.exit(0);
                break;
            case "1":
                System.out.println("BUBBLE SORT SELECTED:");
                BubbleSort BBS = new BubbleSort();
                BBS.bubbleSortSteps(N);
                break;
            case "2":
                System.out.println("MERGE SORT SELECTED:");
                System.out.println(ConsoleColours.RED_BOLD_BRIGHT + "Array to sort:" + ConsoleColours.RESET + Arrays.toString(N));
                MergeSort MS = new MergeSort();
//                System.out.println(ConsoleColours.GREEN_BOLD_BRIGHT + "Sorted Array: " + ConsoleColours.RESET + Arrays.toString(MS.mergeSort(N,N.length-1)));
                System.out.println(ConsoleColours.GREEN_BOLD_BRIGHT + "Sorted Array: " + ConsoleColours.RESET + Arrays.toString(MS.mergeSort(N, 0, N.length - 1)));
                break;
            case "3":
                System.out.println("SELECTION SORT SELECTED");
                SelectionSort SS = new SelectionSort();
                SS.selectionSort(N);
            case "4":
                System.out.println("QUICK SORT SELECTED");
                QuickSort QS = new QuickSort();
//                System.out.println(QS.quickSort(N,0,N.length-1));
                System.out.println(ConsoleColours.GREEN_BOLD_BRIGHT + "Sorted Array:" + ConsoleColours.RESET + Arrays.toString(QS.quickSort(N, 0, N.length - 1)));
            case "5":
                System.out.println("HEAP SORT SELECTED");
                HeapSort HS = new HeapSort();
                System.out.println(ConsoleColours.GREEN_BOLD_BRIGHT + "Sorted Array:" + ConsoleColours.RESET + Arrays.toString(HS.HeapSort(N)));

        }
        start();


    }
}
