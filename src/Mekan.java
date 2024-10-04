
public class Mekan {
	private String yer;

	public Mekan(String yer) {
		super();
		this.yer = yer;
	}

	public String mevcutYer() {
		return "Şu anda buradasınız: "+yer;
	}

	public void mekanDegis(String yer) {
		this.yer = yer;
		System.out.println(yer+" mekanına gidiliyor.");
	}
	
	
	
}
