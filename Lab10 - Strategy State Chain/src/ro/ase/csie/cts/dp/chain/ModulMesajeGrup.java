package ro.ase.csie.cts.dp.chain;

public class ModulMesajeGrup extends ModulProcesareMesaj {

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		if(mesaj.destinatie.toLowerCase().equals("@everyone")) {
			System.out.println("Mesaj pt grup:" + mesaj.text);
		}
		
		if(this.next != null) {
			this.next.procesareMesaj(mesaj);
		}
	}
	
}
