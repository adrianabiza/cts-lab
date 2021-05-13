package ro.ase.csie.cts.dp.chain;

public class ModulMesajePrivate extends ModulProcesareMesaj{

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		if(!mesaj.destinatie.toLowerCase().equals("@everyone")) {
			System.out.println("Mesaj privat pt " + mesaj.destinatie + ": "+mesaj.text);
		}
		else
		{
			if(this.next != null)
				this.next.procesareMesaj(mesaj);
		}
	}
}
