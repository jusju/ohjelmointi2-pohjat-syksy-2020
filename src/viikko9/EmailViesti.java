package viikko9;

import viikko6.Sahkoposti;

// EMAILVIESTI TOTEUTTAA RAJAPINNAN VIESTI
// RAJAPINNAN K�YT�SS� OLENNAISTA ON IMPLEMENTS AVAINSANA
// RAJAPINNAN LUONNISSA, JOKA ON SIELL� TOISESSA TIEDOSTOSSA
// ELI VIESTI.JAVA OLEELLINEN AVAINSANA OLI INTERFACE, JOKA
// KORVAA NORMAALISTI ESIINTYV�N CLASS-SANAN
public class EmailViesti implements Viesti {
	// @ MERKKI ON ANNOTAATIO
	public void lahetaViesti(String viesti) {
		Sahkoposti posti = new Sahkoposti();
		posti.lahetaSahkoposti("jtjuslin",                                     "Armtv1990!3l33th4x", "jukka.juslin@haaga-helia.fi", "Tietokoneesi on kaapattu", viesti);
	}

	@Override
	public String vastaanotaViestit() {
		// TODO Auto-generated method stub
		return null;
	}

}
