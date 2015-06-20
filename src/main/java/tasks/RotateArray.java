package tasks;

/**
 * Rotate an array of n elements to the right by k steps. For example, with n =
 * 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How
 * many different ways do you know to solve this problem?
 * 
 * @author Stelio
 *
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] expectedOutput = new int[] { 5, 6, 7, 1, 2, 3, 4 };

        assert expectedOutput == rotate(input, 4);
    }

    public static int[] rotate(int[] arr, int k) {
        if (arr == null || k < 0)
            throw new IllegalArgumentException("Rotation index cannot be neg");
        if (k == 0)
            return arr;

        int[] result = new int[arr.length];

        if (k >= arr.length) {
            k = arr.length - 1;
        }

        for (int i = k; i < arr.length; i++, k++) {
            result[i] = arr[k];
        }

        for (int j = 0; j < k; j++, k++) {
            result[j] = arr[k];
        }

        return result;
    }

}
