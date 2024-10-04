import java.util.Random;
import java.util.Scanner;

public class GüvenliEv extends Mekan {
	private int secim;
	private boolean isFinish;
	Scanner scn = new Scanner(System.in);

	public GüvenliEv(Karakter karakter) {
		super("Güvenli Ev");
		isFinish = karakter.isOdun() && karakter.isWater() && karakter.isYemek();
		if (isFinish) {
			System.err.println("TEBRİKLER! KRALLIĞI KURTARDINIZ!");
		}
		else if (karakter instanceof Savaşçı) {
			karakter.setSaglik(100);
			System.out.println("Güvenli eve hoşgeldin Savaşçı! Sağlığın yenilendi: " + karakter.getSaglik());
		} else if (karakter instanceof Okçu) {
			karakter.setSaglik(80);
			System.out.println("Güvenli eve hoşgeldin Okçu! Sağlığın yenilendi: " + karakter.getSaglik());
		} else if (karakter instanceof Şövalye) {
			karakter.setSaglik(120);
			System.out.println("Güvenli eve hoşgeldin Şövalye! Sağlığın yenilendi: " + karakter.getSaglik());
		}
		while (!isFinish) {
			System.out.println("Nereye gitmek istersin? 1-Mağaza, 2-Orman, 3-Nehir, 4-Mağara");
			if(scn.hasNextInt())
			{
				secim = scn.nextInt();
			}
			else
			{
				secim = 1;
				System.err.println("Hatalı seçim yaptınız! Mağazaya yönlendiriliyorsunuz.");
			}
			if (secim == 1) {
				mekanDegis("Mağaza");
				Mağaza magaza = new Mağaza(karakter);
				break;
			} else if (secim == 2) {
				mekanDegis("Orman");
				int sayi;
				Random rnd = new Random();
				sayi = rnd.nextInt(3) + 1;
				Orman orman = new Orman(sayi, karakter);
				break;
			} else if (secim == 3) {
				mekanDegis("Nehir");
				int sayi;
				Random rnd = new Random();
				sayi = rnd.nextInt(3) + 1;
				Nehir nehir = new Nehir(sayi, karakter);
				break;
			} else if (secim == 4) {
				mekanDegis("Mağara");
				int sayi;
				Random rnd = new Random();
				sayi = rnd.nextInt(3) + 1;
				Mağara magara = new Mağara(sayi, karakter);
				break;
			} else {
				System.err.println("Yanlış seçim! Tekrar deneyin.");
				continue;
			}
		}
	}
}
