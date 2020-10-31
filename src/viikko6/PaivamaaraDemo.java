package viikko6;

import java.time.LocalDate;
import java.util.Scanner;

public class PaivamaaraDemo {

	public static void main(String[] args) {
		// KOMENTORIVILT� ON MAHDOLLISTA LUKEA PARAMETREJ�
		// NE ON TAULUKOSSA NIMELT��N ARGS
		if(args[0] != null) {
			// LAITETAAN OHJELMA SULKEUTUMAAN, JOS ON VUOSI 2020
			if(args[0].equals("2020")) {
				System.out.println("Ihan paska vuosi.");
				System.out.println("Lopetan t�h�n.");
				System.exit(0);				
			}
		}
		
		LocalDate spaiva;
		String paiva;
		Scanner input = new Scanner(System.in);
		System.out.print("Anna syntym�p�iv�si (vvvv-kk-pp): ");
		paiva = input.nextLine();
		try {
			spaiva = LocalDate.parse(paiva);
			// LIS�T��N P�IVI�
			spaiva = spaiva.plusDays(10);
			int vuosi = spaiva.getYear();
			int nytVuosi = LocalDate.now().getYear();
			if (vuosi > nytVuosi) {
				System.out.println("Syntym�vuosi ei voi olla tulevaisuudessa ");
			} else {
				System.out.println("Syntym�vuosi on " + vuosi);
				System.out.println(spaiva.getMonthValue());
			}
		} catch (Exception error) {
			System.out.println("Syntym�p�iv� on virheellinen");
		}
	}

}
