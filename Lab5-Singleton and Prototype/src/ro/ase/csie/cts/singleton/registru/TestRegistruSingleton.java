package ro.ase.csie.cts.singleton.registru;

public class TestRegistruSingleton {
	public static void main(String[] args) {
		
		ConexiuneBD conex1 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
		ConexiuneBD conex2 = ConexiuneBD.getConexiune("10.0.0.2", "cts");
		ConexiuneBD conex3 = ConexiuneBD.getConexiune("10.0.0.2", "test");
		
		
		if (conex1 == conex2 ){
			System.out.println("referinte identice registru");
		}
		else {
			System.out.println("referinte diferite");
		}
		
		if (conex1 == conex3 ){
			System.out.println("referinte identice registru");
		}
		else {
			System.out.println("referinte diferite");
		}

	}
}
