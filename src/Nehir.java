import java.util.ArrayList;
import java.util.Scanner;

public class Nehir extends Mekan {
	private boolean isWater;
	private ArrayList<Ayı> ayılar;
	Scanner scn = new Scanner(System.in);
	private char secim;
	
	public Nehir(int ayiSayisi, Karakter karakter) {
		super("Nehir");
		ayılar = new ArrayList<>();
		isWater = false;
		
		for (int i = 0; i < ayiSayisi; i++) {
			ayılar.add(new Ayı());
		}
		System.out.println("Nehre hoşgeldin "+karakter.getIsim()+ "! Nehirde " + ayiSayisi
				+ " tane ayı var. Savaşmak için S/s, kaçmak için K/k' ye bas.");
		secim = scn.next().charAt(0);
		if (secim == 's' || secim == 'S') {
			savas(karakter);
		} else if (secim == 'k' || secim == 'K') {
			mekanDegis("Güvenli Ev");
			GüvenliEv gvnEv = new GüvenliEv(karakter);
		}
	}
	
	public boolean isWater() {
		return isWater;
	}

	public void savas(Karakter karakter) {
		for (int i = 0; i < ayılar.size(); i++) {
			System.err.println((i+1) + ". "+ayılar.get(i));
			while(karakter.getSaglik() > 0 && ayılar.get(i).getSaglik() > 0)
			{
				karakter.saldir(ayılar.get(i), karakter.getSilah());
				ayılar.get(i).saldir(karakter);
			}
			if(ayılar.get(ayılar.size()-1).getSaglik() <= 0)
			{
				isWater = true;
				System.out.println("Tüm ayıları yok ederek su ganimetini kazandınız.");
				karakter.setWater(isWater);
				mekanDegis("Güvenli Ev");
				GüvenliEv gvnEv = new GüvenliEv(karakter);
			}
			else if(karakter.getSaglik() <= 0)
			{
				System.err.println("Öldünüz. GAME OVER :(");
				break;
			}
		}
		
	}

}
