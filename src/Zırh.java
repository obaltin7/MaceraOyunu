
public class Zırh {
	private String isim;
	private int savunmaGucu;

	public Zırh(String isim, int savunmaGucu) {
		super();
		this.isim = isim;
		this.savunmaGucu = savunmaGucu;
	}

	public String getIsim() {
		return isim;
	}

	public int getSavunmaGucu() {
		return savunmaGucu;
	}

	public void setSavunmaGucu(int savunmaGucu) {
		this.savunmaGucu = savunmaGucu;
	}

	@Override
	public String toString() {
		return "Zırh [isim=" + isim + ", savunmaGucu=" + savunmaGucu + "]";
	}

}