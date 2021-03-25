package ro.ase.csie.cts.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//ConexiuneBD conexiune1 = new ConexiuneBD("10.0.0.1", "cts");
		//ConexiuneBD conexiune2 = new ConexiuneBD("10.0.0.1", "cts");	
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune();
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune();

		
		if(conexiune1 == conexiune2) {
			System.out.println("identic");
		}
		else {
			System.out.println("diferit");
		}
		
		ModulUI modulUI = new ModulUI();
		ModulProfil modulProfil = new ModulProfil();
	}

}
