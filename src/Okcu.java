
public class Okcu extends Karakter{
	private Yay yay;
	private OrtaZirh ortaZırh;
	
	public Okcu(Yay yay, OrtaZirh ortaZırh) {
		super(80, yay, ortaZırh,"Okçu");
		this.yay = yay;
		this.ortaZırh = ortaZırh;
	}

	public Yay getYay() {
		return yay;
	}


	public OrtaZirh getOrtaZırh() {
		return ortaZırh;
	}

	@Override
	public String toString() {
		return "Okçu [Saglik=" + getSaglik() + ", Silah=" + getSilah() + ", Zırh=" + getZırh() + "]";
	}



	

}
