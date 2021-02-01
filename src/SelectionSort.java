import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums) { //https://stackabuse.com/selection-sort-in-java/
        System.out.println(ConsoleColours.RED_BOLD_BRIGHT+"Array to sort:" + ConsoleColours.RESET+Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;

            for (int j = i + 1; j < nums.length; j++) {//finds the min element from unsorted array
                if (nums[j] < nums[min]) {
                    min = j;
                    
                }
            }
//            System.out.println("Swapping:"+nums[i]+"<="+nums[min]);
            // Swapping i-th and min-th elements
            int swap = nums[i];
            nums[i] = nums[min];
            nums[min] = swap;


        }
        System.out.println(ConsoleColours.GREEN_BOLD_BRIGHT + "Sorted Array:" + ConsoleColours.RESET + Arrays.toString(nums));
    }
}
