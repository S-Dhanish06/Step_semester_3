public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] result = new int[10];

        int i = 0, j = 0, k = 0;

        // Compare and merge both arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        // Display result
        System.out.print("Resultant Array: ");

        for (i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
