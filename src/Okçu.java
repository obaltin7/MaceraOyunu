
public class Okçu extends Karakter{
	private Yay yay;
	private OrtaZırh ortaZırh;
	
	public Okçu(Yay yay, OrtaZırh ortaZırh) {
		super(80, yay, ortaZırh,"Okçu");
		this.yay = yay;
		this.ortaZırh = ortaZırh;
	}

	public Yay getYay() {
		return yay;
	}


	public OrtaZırh getOrtaZırh() {
		return ortaZırh;
	}

	@Override
	public String toString() {
		return "Okçu [Saglik=" + getSaglik() + ", Silah=" + getSilah() + ", Zırh=" + getZırh() + "]";
	}



	

}
