
public class Vampir extends Canavar {
	private int saglikEm;

	public Vampir(int saglikEm) {
		super("Vampir", 25, 24, "Isırma");
		this.saglikEm = saglikEm;
	}

	public int getSaglikEm() {
		return saglikEm;
	}

	@Override
	public void saldir(Karakter karakter) {
		super.saldir(karakter);
		if(getSaglik() > 0)
		{
			setSaglik(getSaglik() + saglikEm);
			System.out.println("Vampir " + saglikEm + " kadar sağlığınızı emdi." + toString());
		}		
	}

	@Override
	public String toString() {
		return "Vampir [Sağlık= " + getSaglik() + " Saldırı Gücü: "+ getSaldiriGucu() +" Sağlık Emme: "+saglikEm+ " Saldırı Metodu: "+getSaldiriMetodu()+"]";
	}

}
