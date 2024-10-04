import java.util.ArrayList;
import java.util.Scanner;

public class Orman extends Mekan {
	private boolean isOdun;
	private ArrayList<Vampir> vampirler;
	Scanner scn = new Scanner(System.in);
	private char secim;

	public Orman(int vampirSayisi, Karakter karakter) {
		super("Orman");
		vampirler = new ArrayList<>();
		this.isOdun = false;
		for (int i = 0; i < vampirSayisi; i++) {
			vampirler.add(new Vampir(5));
		}
		System.out.println("Ormana hoşgeldin "+karakter.getIsim()+"! Ormanda " + vampirSayisi
				+ " tane vampir var. Savaşmak için S/s, kaçmak için K/k' ye bas.");
		secim = scn.next().charAt(0);
		if (secim == 's' || secim == 'S') {
			savas(karakter);
		} else if (secim == 'k' || secim == 'K') {
			mekanDegis("Güvenli Ev");
			GüvenliEv gvnEv = new GüvenliEv(karakter);
		}
	}
	
	public boolean isOdun() {
		return isOdun;
	}

	public void savas(Karakter karakter)
	{
		for (int i = 0; i < vampirler.size(); i++) {
			System.err.println((i+1) + ". "+vampirler.get(i));
			while(karakter.getSaglik() > 0 && vampirler.get(i).getSaglik() > 0)
			{
				karakter.saldir(vampirler.get(i), karakter.getSilah());
				vampirler.get(i).saldir(karakter);
			}
			if(vampirler.get(vampirler.size()-1).getSaglik() <= 0)
			{
				isOdun = true;
				System.out.println("Tüm vampirleri yok ederek odun ganimetini kazandınız.");
				karakter.setOdun(isOdun);
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
