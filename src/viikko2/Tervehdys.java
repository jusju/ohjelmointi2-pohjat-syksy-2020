package viikko2;

import java.time.LocalTime;

public class Tervehdys {

	public static void main(String[] args) {
		// KOMENTO, JOLLA SAADAAN AJAN NYKYHETKI
		LocalTime nykyHetki = LocalTime.now();
		// SAADAAN AIKA KYSEISEN TIETOKONEEN KELLOLTA
		// AJAN VOISI HAKEA INTERNETIST�KIN
		int tunnit = nykyHetki.getHour();
		
		if(tunnit >= 7 && tunnit < 10) {
			System.out.println("Hyv�� huomenta!");
		} else if(tunnit < 17 && tunnit >= 10) {
			System.out.println("Hyv�� p�iv��!");
		} else if(tunnit >=17 && tunnit < 22) {
			System.out.println("Hyv�� iltaa!");
		} else if(tunnit >= 22 && tunnit <=23) {
			System.out.println("Hyv�� y�t�!");
		} else if(tunnit >= 0 && tunnit < 7) {
			System.out.println("Hyv�� y�t�!");
		}
	}

}
