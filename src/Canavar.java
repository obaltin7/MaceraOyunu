
public class Canavar {
	private String isim;
	private int saglik;
	private int saldiriGucu;
	private String saldiriMetodu;

	public Canavar(String isim, int saglik, int saldiriGucu, String saldiriMetodu) {
		super();
		this.isim = isim;
		this.saglik = saglik;
		this.saldiriGucu = saldiriGucu;
		this.saldiriMetodu = saldiriMetodu;
	}

	public int getSaglik() {
		return saglik;
	}

	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}

	public String getIsim() {
		return isim;
	}

	public int getSaldiriGucu() {
		return saldiriGucu;
	}

	public String getSaldiriMetodu() {
		return saldiriMetodu;
	}

	@Override
	public String toString() {
		return "Canavar [isim=" + isim + ", saglik=" + saglik + ", saldiriGucu=" + saldiriGucu + ", saldiriMetodu="
				+ saldiriMetodu + "]";
	}

	public void saldir(Karakter karakter) {
		if (saglik > 0) {
			int ekstraZirhKorumasi = 0;
			if (!karakter.getEkstraZırhlar().isEmpty()) {
				for (Zirh ekstraZırh : karakter.getEkstraZırhlar()) {
					ekstraZirhKorumasi += ekstraZırh.getSavunmaGucu();
				}
			}
			karakter.setSaglik(
					karakter.getSaglik() - saldiriGucu + karakter.getZırh().getSavunmaGucu() + ekstraZirhKorumasi);

			if (karakter.getSaglik() > 0) {
				System.out.println(toString() + " canavarı " + karakter + " kahramanına saldırdı. Kalan sağlığınız: "
						+ karakter.getSaglik());
			}

			else {
				System.err.println(toString() + " canavarı sizi öldürdü.");
			}
		}
	}
}
