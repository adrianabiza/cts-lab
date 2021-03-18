package ro.ase.csie.cts.lab4.faza3.servicii;

import ro.ase.csie.cts.lab3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.lab3.exceptii.ExceptieVechimeClient;

public class ServiciuValidari implements InterfataValidare {

	@Override
	public void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
	}

	@Override
	public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient {
		if(vechimeClientInAni < 0) {
			throw new ExceptieVechimeClient();
		}
	}

}
