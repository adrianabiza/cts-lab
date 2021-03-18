package ro.ase.csie.cts.lab4.faza3.servicii;

import ro.ase.csie.cts.lab3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.lab3.exceptii.ExceptieVechimeClient;

public interface InterfataValidare {

	public void validarePret(float pretInitial) throws ExceptiePretInvalid;
	
	public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient;
	
}
