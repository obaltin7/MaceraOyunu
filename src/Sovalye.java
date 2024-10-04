
public class Sovalye extends Karakter {
	private Mizrak mızrak;
	private AgirZirh ağırZırh;

	public Sovalye(Mizrak mızrak, AgirZirh ağırZırh) {
		super(120, mızrak, ağırZırh, "Şövalye");
		this.mızrak = mızrak;
		this.ağırZırh = ağırZırh;
	}

	public Mizrak getMızrak() {
		return mızrak;
	}

	public AgirZirh getAğırZırh() {
		return ağırZırh;
	}

	@Override
	public String toString() {
		return "Şövalye [Saglik=" + getSaglik() + ", Silah=" + getSilah() + ", Zırh=" + getZırh() + "]";
	}

}
