package ro.ase.csie.cts.dp.command;

public class TaskAsincron implements InterfataTaskAsincron {

	private InterfaraModulJoc modul = null;
	private String detalii;
	int prioritate;
	
	
	
 	public TaskAsincron(InterfaraModulJoc modul, String detalii, int prioritate) {
		super();
		this.modul = modul;
		this.detalii = detalii;
		this.prioritate = prioritate;
	}



	@Override
	public void startTaskAsincron() {
		this.modul.executaTask(detalii);
		
	}

}
