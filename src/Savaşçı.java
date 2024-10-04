
public class Savaşçı extends Karakter {
	private Kılıç kılıç;
	private HafifZırh hafifZırh;

	public Savaşçı(Kılıç kılıç, HafifZırh hafifZırh) {
		super(100, kılıç, hafifZırh, "Savaşçı");
		this.kılıç = kılıç;
		this.hafifZırh = hafifZırh;
	}

	public Kılıç getKılıç() {
		return kılıç;
	}

	public HafifZırh getHafifZırh() {
		return hafifZırh;
	}

	@Override
	public String toString() {
		return "Savaşçı [Saglik=" + getSaglik() + ", Silah=" + getSilah() + ", Zırh=" + getZırh() + "]";
	}

}
