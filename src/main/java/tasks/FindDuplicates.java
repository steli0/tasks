package tasks;

import java.util.LinkedList;
import java.util.List;

/**
 * You have got a range of numbers between 1 to N, where one of the number is
 * repeated. You need to write a program to find out the duplicate number.
 *
 * @author Stelio
 *
 */
public class FindDuplicates {

	public static void main(String[] args) {

	}

	public static int getDuplicate(int[] arr) {
		List<Integer> aux = new LinkedList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int num : aux) {
				if (num == arr[i]) {
					return num;
				}
			}
			aux.add(arr[i]);
		}

		return -1;
	}

}
