package ro.ase.csie.testare;

import ro.ase.csie.testare.exceptii.ExceptieImpatireLaZero;

public class OperatiiMatematice {

	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static double impartire(int a, int b) throws ExceptieImpatireLaZero {
		if(b == 0) {
			throw new ExceptieImpatireLaZero();
		}
		return a/b;
	}
}
