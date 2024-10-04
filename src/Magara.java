import java.util.ArrayList;
import java.util.Scanner;

public class Magara extends Mekan {
	private boolean isYemek;
	private ArrayList<Zombi> zombiler;
	Scanner scn = new Scanner(System.in);
	private char secim;

	public Magara(int zombiSayisi, Karakter karakter) {
		super("Mağara");
		zombiler = new ArrayList<>();
		isYemek = false;
		for (int i = 0; i < zombiSayisi; i++) {
			zombiler.add(new Zombi());
		}
		System.out.println("Mağaraya hoşgeldin " + karakter.getIsim() + "! Mağarada " + zombiSayisi
				+ " tane zombi var. Savaşmak için S/s, kaçmak için K/k' ye bas.");
		secim = scn.next().charAt(0);
		if (secim == 's' || secim == 'S') {
			savas(karakter);
		} else if (secim == 'k' || secim == 'K') {
			mekanDegis("Güvenli Ev");
			GuvenliEv gvnEv = new GuvenliEv(karakter);
		}
	}
	
	public boolean isYemek() {
		return isYemek;
	}

	public void savas(Karakter karakter) {
		for (int i = 0; i < zombiler.size(); i++) {
			System.err.println((i+1) + ". "+zombiler.get(i));
			while(karakter.getSaglik() > 0 && zombiler.get(i).getSaglik() > 0)
			{
				karakter.saldir(zombiler.get(i), karakter.getSilah());
				zombiler.get(i).saldir(karakter);
			}
			if(zombiler.get(zombiler.size()-1).getSaglik() <= 0)
			{
				isYemek = true;
				System.out.println("Tüm zombileri yok ederek yemek ganimetini kazandınız.");
				karakter.setYemek(isYemek);
				mekanDegis("Güvenli Ev");
				GuvenliEv gvnEv = new GuvenliEv(karakter);
			}
			else if(karakter.getSaglik() <= 0)
			{
				System.err.println("Öldünüz. GAME OVER :(");
				break;
			}
		}

	}
}
