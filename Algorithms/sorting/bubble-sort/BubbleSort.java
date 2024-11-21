public class BubbleSort {

    public static void sort(int[] arr) {
        int endIndex = arr.length - 1;
//        Adding swap flag to determine if array is already sorted to prevent unncessary iterations.
        boolean swap = false;

        while ( endIndex > 0) {
            swap = false;
            for (int i = 0; i < endIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }

            endIndex--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {3, -1, 4, 1, 5, -9, 2, 6, 5, 3, 5},
                {8, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1},
                {1,2,3,4}
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i + 1) + " Before sorting: ");
            printArray(testCases[i]);
            BubbleSort.sort(testCases[i]);
            System.out.println("Test Case " + (i + 1) + " After sorting: ");
            printArray(testCases[i]);
            System.out.println(); // Add a blank line between test cases
        }
    }
}