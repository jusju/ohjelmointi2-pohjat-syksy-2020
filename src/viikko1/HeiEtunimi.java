package viikko1;

import java.util.Scanner;

public class HeiEtunimi {

	public static void main(String[] args) {
		// SCANNERIN LUONTI
		// ECLIPSESS� CTRL+SPACE ON T�RKE�
		Scanner input = new Scanner(System.in);
		// TULOSTETAAN N�YT�LLE JOKATAPAUKSESSA
		System.out.print("Sy�t� etunimi: ");
		// LUETAAN ETUNIMI MERKKIJONO N�PP�IMIST�LT�
		String nimi;
		nimi = input.nextLine();
		// TULOSTETAAN N�YT�LLE SANA HEI JA SEN J�LKEEN NIMI
		System.out.println("Hei " + nimi + "!");

	}

}
