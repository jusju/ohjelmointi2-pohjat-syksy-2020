package viikko4;

import java.util.ArrayList;
import java.util.List;

/**
 * Lista on eritt�in hy�dyllinen kun halutaan s�il�� muuttujien arvoja my�hemp��
 * k�sittely� varten. Sill� on my�s helpohko tehd� virheit�.
 * 
 * Teht�v�pohjassa on listaa k�ytt�v� ohjelma. Muokkaa ohjelmaa siten, ett� sen
 * suorittaminen tuottaa aina virheen IndexOutOfBoundsException. Ohjelman tulee
 * olla sellainen, ett� k�ytt�j�n ei tarvitse antaa koneelle sy�tett� (esim.
 * n�pp�imist�lt�).
 * 
 * Ohjelmassa n�kyy my�s tapa listan l�pik�yntiin � palaamme t�h�n tapaan
 * my�hemmin.
 * 
 * T�m�n teht�v�n on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhm�. Teht�v� on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssill� ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class IndexOutOfBounds {

    public static void main(String[] args)  {
        List<String> sanalista = new ArrayList<>();

        sanalista.add("Ensimm�inen");
        sanalista.add("Toinen");

        int kokonaispituus = 0;

        for (int i = 0; i <= sanalista.size(); i++) {
            String sana = sanalista.get(i);
            
            kokonaispituus += sana.length();
        }
        
    }
}
