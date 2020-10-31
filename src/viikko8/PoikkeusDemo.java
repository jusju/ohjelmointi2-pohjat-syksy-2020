package viikko8;

import java.util.Scanner;

public class PoikkeusDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna ik�si: ");
		while (true) {
			try {
				int ika = input.nextInt();
				System.out.println("Ik�si on: " + ika);
				break;
			} catch (Exception e) {
				System.out.println("Annoit virheellisen i�n.");
				input.nextLine();
				System.out.println("Anna ik�si: ");
			}
		}

	}

}
