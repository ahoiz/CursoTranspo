package br.com.beginner;

import java.util.Scanner;

public class TalkingAboutDivisor2869 {

	public static int fatorarPrimos(int n) {
		int qtdeDivsCalc = 1;
		int qtdePrimos = 0;

		while (n % 2 == 0) {
			qtdePrimos++;
			n /= 2;
		}

		if (qtdePrimos > 0) {
			qtdeDivsCalc = qtdePrimos + 1;
		}

		for (int j = 3; j <= n; j += 2) {
			qtdePrimos = 0;
			while (n % j == 0) {
				qtdePrimos++;
				n /= j;
			}
			qtdeDivsCalc *= (qtdePrimos + 1);
		}

		return qtdeDivsCalc;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int qtdeNums, qtdeDivsInput, qtdeDivs, numTest;
		// Double qtDivInDb, numTestDb;

		qtdeNums = input.nextInt();
		System.out.println(qtdeNums);

		for (int i = 1; i <= qtdeNums; i++) {

			qtdeDivsInput = input.nextInt();
			// qtDivInDb = Double.valueOf(qtdeDivsInput);
			qtdeDivs = 1;
			// numTestDb = Math.pow(2, qtDivInDb);
			// numTest = numTestDb.intValue();
			numTest = 0;
			while (qtdeDivsInput != qtdeDivs) {

				numTest++;
				qtdeDivs = fatorarPrimos(numTest);
				System.out.printf("Resultado do número %s para fatorarPrimos: %s\n", numTest, qtdeDivs);

			}
			System.out.println(numTest);

		}
		input.close();

	}

}
