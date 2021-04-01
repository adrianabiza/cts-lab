package ro.ase.csie.cts.dp.factory;

import java.util.ArrayList;

public class TestFactory {

	public static void main(String[] args) {
//		CaracterDisney mickeyMouse = new CaracterDisney("rosu","Mickey Mouse");
//		CaracterMarvel spiderman = new CaracterMarvel("Spiderman", 100);
		
		CaracterAbstract mickeyMouse = FactoryCaracter.getCaracter(TipCaracter.DISNEY, "Mickey Mouse");
		ArrayList<CaracterAbstract> caractere = new ArrayList<>();

	}

}
