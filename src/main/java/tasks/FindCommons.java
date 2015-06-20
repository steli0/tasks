package tasks;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a program to identify common elements or numbers between two given
 * arrays. You should not use any inbuilt methods are list to find common
 * values.
 * 
 * @author Stelio
 *
 */
public class FindCommons {

    public static void main(String[] args) {
        int a[] = new int[]{ 4, 2, 10, 7, 18 };
        int b[] = new int[]{ 1, 4, 2, 17, 12 };
        
        System.out.println("The common numbers are:");
        for (int num : getCommons(a, b)) {
            System.out.printf("%d ", num);
        }
    }

    public static Set<Integer> getCommons(int[] arrOne, int[] arrTwo) {
        Set<Integer> result = new HashSet<Integer>();

        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                if (arrOne[i] == arrTwo[j]) {
                    result.add(arrOne[i]);
                    break;
                }
            }
        }

        return result;
    }
}
