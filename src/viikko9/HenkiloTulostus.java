package viikko9;

import java.util.ArrayList;
import java.util.List;

public class HenkiloTulostus {

    public static void main(String[] args) {
        List<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Henkilo("Ada Lovelace", "Korsontie 1 03100 Vantaa"));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));

        tulostaHenkilot(henkilot);
    }

    public static void tulostaHenkilot(List<Henkilo> henkilot) {
        // T�ydenn� metodin toteutus t�nne
    	// pit�� k�yd� l�pi henkilot-lista
    	for (int i = 0; i < henkilot.size(); i++) {
    		System.out.println(henkilot.get(i));
		}	
    }
}
