import java.util.ArrayList;
import java.util.Scanner;

public class Mağaza extends Mekan {
	private ArrayList<Silah> ekstraSilahlar;
	private ArrayList<Zırh> ekstraZırhlar;
	private ArrayList<String> ekstraAlınanlar;

	Scanner scn = new Scanner(System.in);

	public Mağaza(Karakter karakter) {
		super("Mağaza");
		ekstraSilahlar = new ArrayList<>();
		ekstraZırhlar = new ArrayList<>();
		ekstraAlınanlar = new ArrayList<>();
		int secim=0;
		System.out.println("Mağazaya hoşgeldiniz. Alabileceğiniz Eşyalar: " + "Silah: Tabanca(1), Kılıç(2), Tüfek(3)"
				+ " Zırh: Hafif(4), Orta(5), Ağır(6)");
		char cikis = 'D';
		while (cikis != 'c' && cikis != 'C') {
			if(scn.hasNextInt())
			{
				secim = scn.nextInt();
			}
			else
			{
				System.err.println("Hatalı seçim! Güvenli Eve yönlendiriliyorsunuz.");
				mekanDegis("Güvenli Ev");
				GüvenliEv gvnEv = new GüvenliEv(karakter);
				break;
			}
			if (secim == 1) {
				Tabanca tabanca = new Tabanca();
				ekstraSilahlar.add(tabanca);
				System.out.println("Ekstra Tabanca aldınız.");
				ekstraAlınanlar.add("Tabanca");
			} else if (secim == 2) {
				Kılıç kılıç = new Kılıç();
				ekstraSilahlar.add(kılıç);
				System.out.println("Ekstra Kılıç aldınız.");
				ekstraAlınanlar.add("Kılıç");
			} else if (secim == 3) {
				Tüfek tüfek = new Tüfek();
				ekstraSilahlar.add(tüfek);
				System.out.println("Ekstra Tüfek aldınız.");
				ekstraAlınanlar.add("Tüfek");
			} else if (secim == 4) {
				HafifZırh hafifZırh = new HafifZırh();
				ekstraZırhlar.add(hafifZırh);
				System.out.println("Ekstra Hafif Zırh aldınız.");
				ekstraAlınanlar.add("Hafif Zırh");
			} else if (secim == 5) {
				OrtaZırh ortaZırh = new OrtaZırh();
				ekstraZırhlar.add(ortaZırh);
				System.out.println("Ekstra Orta Zırh aldınız.");
				ekstraAlınanlar.add("Orta Zırh");
			} else if (secim == 6) {
				AğırZırh ağırZırh = new AğırZırh();
				ekstraZırhlar.add(ağırZırh);
				System.out.println("Ekstra Ağır Zırh aldınız.");
				ekstraAlınanlar.add("Ağır Zırh");
			}
			else
			{
				System.err.println("Hatalı seçim yaptınız! Tekrar deneyin!");
				continue;
			}
			System.out.println("Almaya devam etmek istiyor musunuz?" + " Çıkış: C/c");
			cikis = scn.next().charAt(0);
			if (cikis == 'c' || cikis == 'C') {
				karakter.setEkstraSilahlar(ekstraSilahlar);
				karakter.setEkstraZırhlar(ekstraZırhlar);
				System.out.print("Ekstralar: ");
				for (String ekstralar : ekstraAlınanlar) {
					System.out.println(ekstralar);
				}
				mekanDegis("Güvenli Ev");
				GüvenliEv gvnEv = new GüvenliEv(karakter);
			}
		}
	}
}
