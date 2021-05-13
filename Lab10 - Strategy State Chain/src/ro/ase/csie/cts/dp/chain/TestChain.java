package ro.ase.csie.cts.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		ModulProcesareMesaj modulFiltru = new ModulFiltruRomana();
		ModulProcesareMesaj modulPrivat = new ModulMesajePrivate();
		ModulProcesareMesaj modulGrup = new ModulMesajeGrup();
		
		modulFiltru.setNext(modulPrivat);
		modulPrivat.setNext(modulGrup);
		
		ModulProcesareMesaj serverChat = modulFiltru;
		
		serverChat.procesareMesaj(new MesajChat("salut!", 3, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("Esti rau!", 0, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("salut tuturor!", 0, "@everyone"));

	}

}
