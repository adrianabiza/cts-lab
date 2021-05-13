package ro.ase.csie.cts.dp.strategy;

public class StrategieJucatorNou implements InterfataStrategieMarketing {

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {
		if(jucator.getTotalOreJucate() > 10) {
			jucator.clasaJucator += 1;
			System.out.println("Strategie jucator nou");
		}
	}

}
