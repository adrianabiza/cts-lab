package ro.ase.csie.cts.dp.strategy;

public class StrategieZiuaCopilului implements InterfataStrategieMarketing {

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {
		if(jucator.getClasaJucator() > 5) {
			jucator.clasaJucator *= 2;
			System.out.println("Strategie ziua copilului");

		}
	}

}
