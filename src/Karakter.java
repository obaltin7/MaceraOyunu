import java.util.ArrayList;

public class Karakter {
	private int saglik;
	private Silah silah;
	private Zırh zırh;
	private String isim;
	private ArrayList<Silah> ekstraSilahlar;
	private ArrayList<Zırh> ekstraZırhlar;
	private boolean isOdun;
	private boolean isWater;
	private boolean isYemek;
	

	public Karakter(int saglik, Silah silah, Zırh zırh, String isim) {
		super();
		this.saglik = saglik;
		this.silah = silah;
		this.zırh = zırh;
		this.isim = isim;
		ekstraSilahlar = new ArrayList<>();
		ekstraZırhlar = new ArrayList<>();
	}

	public int getSaglik() {
		return saglik;
	}

	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}

	public Silah getSilah() {
		return silah;
	}

	public void setSilah(Silah silah) {
		this.silah = silah;
	}

	public Zırh getZırh() {
		return zırh;
	}

	public void setZırh(Zırh zırh) {
		this.zırh = zırh;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public ArrayList<Silah> getEkstraSilahlar() {
		return ekstraSilahlar;
	}
	
	public void setEkstraSilahlar(ArrayList<Silah> ekstraSilahlar) {
		this.ekstraSilahlar = ekstraSilahlar;
	}
	
	public ArrayList<Zırh> getEkstraZırhlar() {
		return ekstraZırhlar;
	}
	
	public void setEkstraZırhlar(ArrayList<Zırh> ekstraZırhlar) {
		this.ekstraZırhlar = ekstraZırhlar;
	}
	
	public void setOdun(boolean isOdun) {
		this.isOdun = isOdun;
	}

	public void setWater(boolean isWater) {
		this.isWater = isWater;
	}

	public void setYemek(boolean isYemek) {
		this.isYemek = isYemek;
	}

	public boolean isOdun() {
		return isOdun;
	}

	public boolean isWater() {
		return isWater;
	}

	public boolean isYemek() {
		return isYemek;
	}

	@Override
	public String toString() {
		return "Karakter [saglik=" + saglik + ", silah=" + silah + ", zırh=" + zırh + ", isim=" + isim + "]";
	}

	public void saldir(Canavar canavar, Silah silah) {
		if(saglik > 0)
		{
			int ekstraSilahHasari=0;
			if(!ekstraSilahlar.isEmpty())
			{
				for (Silah ekstraSilah : ekstraSilahlar) {
					ekstraSilahHasari += ekstraSilah.getSaldiriGucu();
				}
			}
			
			canavar.setSaglik(canavar.getSaglik() - silah.getSaldiriGucu()-ekstraSilahHasari);
			if (canavar.getSaglik() > 0) {
				System.out.println(isim+" olarak "+canavar.getIsim() + " Canavarına " + silah.toString()
						+ " ile saldırdınız. Canavarın kalan sağlığı: " + canavar.getSaglik());
			} else {
				System.out.println(canavar.getIsim() + " Canavarını yok ettiniz.");
			}
		}
	}

}
