
public class Zombi extends Canavar {

	public Zombi() {
		super("Zombi", 15, 20, "Isırma");
	}

	@Override
	public String toString() {
		return "Zombi [Saglik=" + getSaglik() + ", Saldiri Gucu=" + getSaldiriGucu() + ", Saldiri Metodu="
				+ getSaldiriMetodu() + "]";
	}

}
