
public class Silah {
	private String isim;
	private int saldiriGucu;

	public Silah(String isim,int saldiriGucu) {
		super();
		this.isim = isim;
		this.saldiriGucu = saldiriGucu;
	}

	public int getSaldiriGucu() {
		return saldiriGucu;
	}

	public String getIsim() {
		return isim;
	}

	@Override
	public String toString() {
		return "Silah [isim=" + isim + ", saldiriGucu=" + saldiriGucu + "]";
	}


	
	
	
	
	
}
