package viikko3;

import java.util.Scanner;

public class EnterOngelmaDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna ik�si: ");
		int ika = input.nextInt(); // LUVUN LUKEMINEN JATTAA ENTERIN PUSKURIIN
		// ENTERIN ELI RIVINVAIHDON POISTAMINEN PUSKURISTA
		input.nextLine();
		
		System.out.print("Anna nimesi: ");
		String nimi = input.nextLine();
		
		System.out.println("Ik�si on " + ika);
		System.out.println("Nimesi on " + nimi);
		
	}
}
