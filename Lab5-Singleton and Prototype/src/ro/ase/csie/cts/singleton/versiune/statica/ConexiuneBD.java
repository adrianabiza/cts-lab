package ro.ase.csie.cts.singleton.versiune.statica;

public class ConexiuneBD {

	String ip;
	String denumire;
	
	public static final ConexiuneBD conexiune;
	
	static {
		String ip = "127.0.0.1";
		String denumire = "bdtest";
		
		conexiune = new ConexiuneBD(ip, denumire);
	}
	
	private ConexiuneBD(String ip, String denumire) {
		this.ip = ip;
		this.denumire = denumire;
	}
}
