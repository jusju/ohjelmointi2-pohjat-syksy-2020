package viikko6;

import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna laskun p�iv�m��r� (vvvv-kk-pp): ");
		String paivamaaraString = input.nextLine();
		// MUUTETAAN MERKKIJONO P�IV�M��R� TYYPPISEKSI
		LocalDate paivamaara = LocalDate.parse(paivamaaraString);
		// LIS�T��N 14 P�IV�� P�IV�M��R��N
		paivamaara = paivamaara.plusDays(14);
		System.out.println(
				"Er�p�iv� on " + paivamaara);

	}

}
