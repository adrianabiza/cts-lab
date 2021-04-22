package ro.ase.csie.cts.dp.proxy;

public class ModulLogin implements InterfataLogin {

	String ipServer;
	
	
	public ModulLogin(String ipServer) {
		super();
		this.ipServer = ipServer;
	}

	@Override
	public boolean login(String user, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verificaStatusServer() {
		// TODO Auto-generated method stub
		return false;
	}

}
