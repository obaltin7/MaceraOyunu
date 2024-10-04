import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		oyna();

	}

	public static void oyna() {
		int secim = 0;
		int devam = 1;
		boolean isFinish = false;
		Scanner scn = new Scanner(System.in);
		while (devam == 1) {

			System.out.println("Oyuna hoşgeldin cesur kahraman! Krallığı kurtarmak için Karakterini seç: "
					+ "\n1- Savaşçı" + "\n2- Okçu" + "\n3- Şövalye");
			if (scn.hasNextInt()) {
				secim = scn.nextInt();
				scn.nextLine();
			}
			else
			{
				secim = 1;
				scn.nextLine();
				System.err.println("Hatalı seçim yaptınız! Karakteriniz: Savaşçı olarak seçildi.");	
			}
			if (secim == 1) {
				Kılıç k1 = new Kılıç();
				HafifZırh hz1 = new HafifZırh();
				Savaşçı savasci = new Savaşçı(k1, hz1);
				System.out.println(savasci);
				GüvenliEv gvnEv = new GüvenliEv(savasci);
				isFinish = true;
			} else if (secim == 2) {
				Yay y1 = new Yay();
				OrtaZırh oz1 = new OrtaZırh();
				Okçu okcu = new Okçu(y1, oz1);
				System.out.println(okcu);
				GüvenliEv gvnEv = new GüvenliEv(okcu);
				isFinish = true;
			} else if (secim == 3) {
				Mızrak m1 = new Mızrak();
				AğırZırh az1 = new AğırZırh();
				Şövalye sövalye = new Şövalye(m1, az1);
				System.out.println(sövalye);
				GüvenliEv gvnEv = new GüvenliEv(sövalye);
				isFinish = true;
			} else {
				System.err.println("Hatalı seçim! Tekrar deneyin.");
				continue;
			}
			if (isFinish) {
				System.out.println("Tekrar oynamak için 1'e basın. Çıkmak için 0'a basın.");
				if (scn.hasNextInt()) {
					devam = scn.nextInt();
					scn.nextLine();
				} else {
					System.err.println("Hatalı girdi! Program sonlanıyor.");
					scn.nextLine();
					return;
				}
			}
		}
		scn.close();
	}
}
