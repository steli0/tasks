package tasks;

import java.util.Random;

/**
 * Greed is a dice rolling game. In the game, the roller will throw the dice
 * five times, trying to earn as many points as possible. Write code which will
 * calculate the best score based on any given roll using following set of
 * scoring rules:
 *  - Every single 1 scores 100, but every three 1 score 1000
 *  - Every three 2 score 200
 *  - Every three 3 score 300
 *  - Every three 4 score 400
 *  - Every single 5 scores 50, but every three 5 score 500
 *  - Every three 6 score 600
 * Eg:
 *  - 1,1,1,5,1 score 1150
 *  - 1,1,1,2,1 score 1100
 *  - 2,3,4,6,2 score 0
 *  - 3,4,5,3,3 score 350
 *  - 1,5,1,2,4 score 250
 *  - 5,5,5,5,5 score 600
 *
 * Use a test-driven approach.
 *
 * @author Stelio
 *
 */
public class DiceRoller {

	public static void main(String[] args) {
		int[] diceRolls = rollDiceFiveTimes();
		System.out.printf("Your sum is: %d", calculateScore(diceRolls));
	}

	public static int[] rollDiceFiveTimes() {
		int[] result = new int[5];
		Random random = new Random();

		for (int i = 0; i < result.length; i++) {
			result[i] = random.nextInt(5) + 1;
		}

		return result;
	}

	public static int calculateScore(int[] rolls) {
		int sum = 0;
		int counterForOne = 0;
		int counterForTwo = 0;
		int counterForThree = 0;
		int counterForFour = 0;
		int counterForFive = 0;
		int counterForSix = 0;

		for (int i = 0; i < rolls.length; i++) {
			switch (rolls[i]) {
			case 1:
				counterForOne++;
				if (counterForOne == 3) {
					counterForOne = 0;
					sum += 800;
				} else {
					sum += 100;
				}
				break;
			case 2:
				counterForTwo++;
				if (counterForTwo == 3) {
					counterForTwo = 0;
					sum += 200;
				}
				break;
			case 3:
				counterForThree++;
				if (counterForThree == 3) {
					counterForThree = 0;
					sum += 300;
				}
				break;
			case 4:
				counterForFour++;
				if (counterForFour == 3) {
					counterForFour = 0;
					sum += 400;
				}
				break;
			case 5:
				counterForFive++;
				if (counterForFive == 3) {
					counterForFive = 0;
					sum += 400;
				} else {
					sum += 50;
				}
				break;
			case 6:
				counterForSix++;
				if (counterForSix == 3) {
					counterForSix = 0;
					sum += 600;
				}
				break;
			default:
				break;
			}
		}

		return sum;
	}

}
