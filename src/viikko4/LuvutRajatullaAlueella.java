package viikko4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

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

        System.out.print("Mist�? ");
        int mista = lukija.nextInt();

        System.out.print("Mihin? ");
        int mihin = lukija.nextInt();

        lukija.close();

        // TODO: T�ydenn� koodia teht�v�nannon mukaisesti
        // LUODAAN INDEKSI-MUUTTUJA, JOKA ON ROOLISSA KERRYTT�J�
        int indeksi = mista;
        // TOISTOLAUSEKE, JOKA TOISTAA TARVITTAVAN M��R�N
        // VOISI RATKAISTA MY�S FOR LAUSEELLA
        while(indeksi <= mihin) {
        	// HAETAAN ARVO LISTASTA TIETYST� INDEKSIST�
        	// KUN LUKU HAETAAN GETILL� SE ON TALLENNETTAVA MUUTTUJAAN,
        	// MUUTEN SE H�VI�� TAIVAAN TUULIIN
        	int luku = luvut.get(indeksi);
        	System.out.println(luku);
        	indeksi++;
        }
        
    }
}