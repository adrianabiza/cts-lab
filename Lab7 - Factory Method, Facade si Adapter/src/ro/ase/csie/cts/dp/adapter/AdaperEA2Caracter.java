package ro.ase.csie.cts.dp.adapter;

import ro.ase.csie.cts.dp.factory.method.CaracterJoc;

public class AdaperEA2Caracter extends CaracterJoc{
	
	InterfataCaracterEA caracterEA;
	
	public AdaperEA2Caracter(InterfataCaracterEA caracterEA) {
		super();
		this.caracterEA = caracterEA;
	}
	
	public void seDeplaseaza() {
		caracterEA.move();
	}
}
