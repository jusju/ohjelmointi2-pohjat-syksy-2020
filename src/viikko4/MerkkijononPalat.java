package viikko4;

import java.util.Scanner;

public class MerkkijononPalat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kirjoita lause: ");
		String lause = input.nextLine();
		// LUODAAN TAULUKKO SOLUT, JOHON SPLITATAAN LAUSEEN SANAT
		// K�YTT�EN SPACEA EROTINKOHTANA
		String[] sanat = lause.split(" ");
		// TYHJ� SYSO TEKEE TYHJ�N RIVIN
		System.out.println();
		// SEURAAVAKSI TULOSTETAAN TAULUKON ARVOT N�YT�LLE
		for (int i = 0; i < sanat.length; i++) {
			System.out.println(sanat[i]);
		}
	}
}
