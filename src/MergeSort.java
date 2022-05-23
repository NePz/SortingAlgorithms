import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {//https://stackabuse.com/merge-sort-in-java/
    //Divide Sequence:
    public static int[] mergeSort(int[] array, int low, int high) {//low =0

        System.out.println(ConsoleColours.YELLOW_BOLD_BRIGHT + "// BEGIN DIVIDE SEQUENCE //" + ConsoleColours.RESET);
//        System.out.println("low:" + low + " high:" + high);
        // System.out.println("Passed Array:"+Arrays.toString(array));
        if (high <= low) {
            return null;
        }

        int mid = (low + high) / 2;
//        System.out.println(ConsoleColours.RED_BOLD_BRIGHT + "Array to Split: " + ConsoleColours.RESET + Arrays.toString(array));
        System.out.println("Midpoint: =>" + array[mid] + ", @Element position: {" + mid + "}");
        // Creating temporary subarrays
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        // Copying our subarrays into temporaries
//        System.out.println("Populating left array..");
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[low + i];
        }//wjwjwoiwowohello
//        System.out.println("Populating right array..");
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + i + 1];
        }
        System.out.print(ConsoleColours.RED_BRIGHT + "Left Split: " + ConsoleColours.RESET + Arrays.toString(leftArray));
        System.out.print(ConsoleColours.RED_BRIGHT + ", Right Split: " + ConsoleColours.RESET + Arrays.toString(rightArray) + "\n");

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        System.out.println(ConsoleColours.YELLOW_BOLD_BRIGHT + "// END DIVIDE SEQUENCE //" + ConsoleColours.RESET);
        return merge(array, leftArray, mid, rightArray, low, high);
    }

    public static int[] merge(int[] array, int[] leftArray, int mid, int[] rightArray, int low, int high) { //time to conquer bby
        System.out.println(ConsoleColours.YELLOW_BOLD_BRIGHT + "// BEGIN MERGE SEQUENCE //" + ConsoleColours.RESET);

        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        System.out.print(ConsoleColours.BLUE_BOLD_BRIGHT + "MERGING array(s):" + ConsoleColours.RESET);
        System.out.print(Arrays.toString(leftArray) + ">=<" + Arrays.toString(rightArray) + "\n");

        // Iterators containing current index pointers of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }

        }
        System.out.println(ConsoleColours.YELLOW_BOLD_BRIGHT + "// END MERGE SEQUENCE //" + ConsoleColours.RESET);
        return array;
    }


}
