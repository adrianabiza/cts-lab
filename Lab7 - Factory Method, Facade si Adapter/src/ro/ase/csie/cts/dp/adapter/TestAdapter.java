package ro.ase.csie.cts.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.dp.factory.method.CaracterDisney;
import ro.ase.csie.cts.dp.factory.method.CaracterJoc;

public class TestAdapter {
	
	public static void main(String[] args) {
		//1.colectie caractere existente
		ArrayList<CaracterJoc> caractere = new ArrayList<>();
		caractere.add(new CaracterDisney("Donald"));
		
		//1.colectie caractere EA
		ArrayList<InterfataCaracterEA> caractereEA = new ArrayList<>();
		caractereEA.add(new CaracterGenericEA());
		
		//folosind adaptor
		InterfataCaracterEA caracterEA = new CaracterGenericEA();
		AdaperEA2Caracter adapt = new AdaperEA2Caracter(caracterEA);
		caractere.add(adapt);
	}

}
