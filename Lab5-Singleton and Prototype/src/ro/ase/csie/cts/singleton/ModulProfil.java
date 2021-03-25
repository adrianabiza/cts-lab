package ro.ase.csie.cts.singleton;

public class ModulProfil {

	public ModulProfil() {
		//ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1","HeroGame");
		ConexiuneBD conexiune = ConexiuneBD.getConexiune();

	}
}
