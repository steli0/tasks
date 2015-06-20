package tasks;

import java.util.LinkedList;
import java.util.List;

/**
 * In mathematics, the Fibonacci numbers or Fibonacci series or Fibonacci
 * sequence are the numbers in the following integer sequence: 0, 1, 1, 2, 3, 5,
 * 8, 13, 21, 34, 55, 89, 144... By definition, the first two numbers in the
 * Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the
 * previous two. Below example shows how to create fibonacci series.
 * 
 * @author Stelio
 *
 */
public class PrintFibonacci {
    
    public static void main(String[] args) {
        for (int num : getFibonacciNumbers(15)) {
            System.out.printf("%d ", num);
        }
    }

    public static List<Integer> getFibonacciNumbers(int n) {
        List<Integer> result = new LinkedList<Integer>();

        int counter = 1;
        int fibNumber = 1;
        int prev = 0;
        int temp;

        result.add(fibNumber);
        counter++;

        while (counter <= n) {
            temp = fibNumber;
            fibNumber = fibNumber + prev;
            prev = temp;

            result.add(fibNumber);
            counter++;
        }

        return result;
    }

}
