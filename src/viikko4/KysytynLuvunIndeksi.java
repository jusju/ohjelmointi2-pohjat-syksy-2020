package viikko4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ohjelmaan on toteutettu valmiina pohja, joka lukee k�ytt�j�lt� lukuja
 * listalle. Sy�tteiden lukeminen p��tet��n kun k�ytt�j� sy�tt�� luvun -1.
 * 
 * Lis�� ohjelmaan toiminnallisuus, joka kysyy k�ytt�j�lt� lukua ja kertoo luvun
 * indeksin. Mik�li lukua ei l�ydy, ohjelman ei tule kertoa siit�.
 * 
 * T�m�n teht�v�n on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhm�. Teht�v� on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssill� ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Sy�t� kokonaislukuja listalle (-1 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
            }
        }

        System.out.println(); // Tyhj� rivi tulosteeseen

        System.out.print("Mit� lukua etsit��n? ");
        int etsittava = lukija.nextInt();
        lukija.close();

        // TODO: T�ydenn� koodia teht�v�nannon mukaisesti
        // LISTAN L�PIK�YNTI
        // EI VOI TEHD� INDEXOFFILLA, KOSKA LUKU VOI ESIINTY� MONTA KERTAA
        // T�M�N VOISI RATKAISTA MY�S INDEXOF:LLA
        for (int i = 0; i < luvut.size(); i++) {
			if(luvut.get(i) == etsittava) {
				System.out.println("Luku " + etsittava + " on indeksiss� " + i);
			}
		}    
    }
}