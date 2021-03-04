package ro.ase.csie.cts.lab.modele;

import ro.ase.csie.cts.lab.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.lab.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	
	public abstract double getBalanta();
	public abstract void alimenteaza(Double valoare);
	public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void transfer(Cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;

}
