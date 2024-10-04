
public class Savasci extends Karakter {
	private Kilic kılıç;
	private HafifZirh hafifZırh;

	public Savasci(Kilic kılıç, HafifZirh hafifZırh) {
		super(100, kılıç, hafifZırh, "Savaşçı");
		this.kılıç = kılıç;
		this.hafifZırh = hafifZırh;
	}

	public Kilic getKılıç() {
		return kılıç;
	}

	public HafifZirh getHafifZırh() {
		return hafifZırh;
	}

	@Override
	public String toString() {
		return "Savaşçı [Saglik=" + getSaglik() + ", Silah=" + getSilah() + ", Zırh=" + getZırh() + "]";
	}

}
