package ro.ase.csie.cts.singleton;

public class ConexiuneBD {

	String ip;
	String denumire;
	
	//versiune eager
	//private static ConectiuneBD = new new ConexiuneBD("10.0.0.1", "cts");
	
	private static ConexiuneBD conexiune = null;
	 
	private ConexiuneBD() {
		// TODO Auto-generated constructor stub
	}

	private ConexiuneBD(String ip, String denumire) {

		this.ip=ip;
		this.denumire=denumire;
	}
	
	//versiune lazy
	public static ConexiuneBD getConexiune() {
		if(conexiune==null) {
			conexiune = new ConexiuneBD("10.0.0.1", "cts");
			
		}
		return conexiune;
	}
}
