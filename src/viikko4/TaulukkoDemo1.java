package viikko4;

public class TaulukkoDemo1 {

	public static void main(String[] args) {
		// LUODAAN INT TYYPPISI� ARVOJA SIS�LT�V� TAULUKKO
		// JONKA MAKSIMIKOKO ON 5, TAULUKON NIMI ON ARVOSANAT
		int[] arvosanat = new int[5];
		// TALLENNETAAN TAULUKON INDEKSIIN 0 ARVO 5
		//arvosanat[0] = 5;
		// TAULUKKOA EI SAA TULOSTETUA N�IN
		System.out.println(arvosanat);
		// TAULUKON L�PIK�YNTI FOR-SILMUKALLA - TYYPILLISIN TAPA K�SITELL� TAULUKKOA
		for (int i = 0; i < arvosanat.length; i++) {
			// YHDEN ARVON HAKEMINEN TAULUKOSTA
			int korotettu = arvosanat[i] + 1;
			arvosanat[i] = korotettu;
			System.out.println(korotettu);
		}
	}
}
