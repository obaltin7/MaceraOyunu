
public class Şövalye extends Karakter {
	private Mızrak mızrak;
	private AğırZırh ağırZırh;

	public Şövalye(Mızrak mızrak, AğırZırh ağırZırh) {
		super(120, mızrak, ağırZırh, "Şövalye");
		this.mızrak = mızrak;
		this.ağırZırh = ağırZırh;
	}

	public Mızrak getMızrak() {
		return mızrak;
	}

	public AğırZırh getAğırZırh() {
		return ağırZırh;
	}

	@Override
	public String toString() {
		return "Şövalye [Saglik=" + getSaglik() + ", Silah=" + getSilah() + ", Zırh=" + getZırh() + "]";
	}

}
