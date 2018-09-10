package model;

public class Nedbør {

	/**
	 * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien, hvis
	 * man ønsker den minimale nedbørsmængde i de tre uger
	 */
	public int besteTreFerieUger(int[] nedbørPrUge) {
		int minSum = Integer.MAX_VALUE;
		int newSum = 0;
		int uge = 0;
		for (int i = 0; i < nedbørPrUge.length - 2; i++) {
			newSum = nedbørPrUge[i] + nedbørPrUge[i + 1] + nedbørPrUge[i + 2];
			if (newSum < minSum) {
				minSum = newSum;
				uge = i + 1;
			}
		}
		return uge;
	}

	/*
	 *
	 * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien, hvis*
	 * man ønsker den minimale nedbørsmængde i det antal uger, der er angivet
	 * i*parameteren**
	 *
	 * @param antal antal uger man gerne vil holde ferie
	 */

	public int bedsteFerieUgerStart(int[] nedbørPrUge, int antal) {
		int minSum = Integer.MAX_VALUE;

		int uge = 0;
		for (int i = 0; i < nedbørPrUge.length - antal + 1; i++) {
			int newSum = 0;
			for (int j = i; j < antal + i; j++) {
				newSum += nedbørPrUge[j];
			}
			if (newSum < minSum) {
				minSum = newSum;
				uge = i + 1;
			}
		}
		return uge;
	}

	// Returnerer ugenummeret på den første uge hvor nedbøren
	// har været præcis den* samme flest uger i træk

	public int mestEnsNedboer(int[] nedbørPrUge) {
		int currentNum = Integer.MIN_VALUE;
		int counter = 0;
		int weekNumber = -1;
		for (int i = 0; i < nedbørPrUge.length - 1; i++) {
			if (nedbørPrUge[i] == nedbørPrUge[i + 1]) {
				counter++;
				if (counter > currentNum) {
					weekNumber = i - counter + 2;
					currentNum = counter;
				}
			} else {
				counter = 0;
			}
		}
		return weekNumber;
	}
}
