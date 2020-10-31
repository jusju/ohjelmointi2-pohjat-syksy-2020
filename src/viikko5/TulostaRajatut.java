package viikko5;

import java.util.ArrayList;

public class TulostaRajatut {

	public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int ylaraja) {
		for (int i = 0; i < luvut.size(); i++) {
			if(luvut.get(i) >= alaraja && luvut.get(i) <= ylaraja) {
				System.out.println(luvut.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> luvut = new ArrayList<>();
		luvut.add(3);
		luvut.add(2);
		luvut.add(6);
		luvut.add(-1);
		luvut.add(5);
		luvut.add(1);

		System.out.println("Luvut v�lill� [0, 5]");
		tulostaRajatutLuvut(luvut, 0, 5);

		System.out.println("Luvut v�lill� [3, 10]");
		tulostaRajatutLuvut(luvut, 3, 10);
	}
	
}
