package ro.ase.csie.cts.lab4.faza3;

import java.util.ArrayList;

import ro.ase.csie.cts.lab3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.lab3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.lab4.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.lab4.faza3.servicii.InterfataValidare;
import ro.ase.csie.cts.lab4.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.lab4.faza3.servicii.StrategieMarketing2021;

public class TestProdus {
	
	public static ArrayList<Object> servicii = new ArrayList<>();
	public void startUp() {
		InterfataMarketing serviciuMk = new StrategieMarketing2021();
		InterfataValidare serviciuValidare = new ServiciuValidari();
		servicii.add(serviciuMk);
		servicii.add(serviciuValidare);
	}

	public static void main(String[] args) {
		Produs produs = new Produs(new StrategieMarketing2021(), new ServiciuValidari());
		
		try {
			float pretFinal = produs.getPretFinal(TipProdus.DISCOUNT, 100, 12);
			System.out.println(pretFinal);
			
			produs.setStrategieMK(new InterfataMarketing() {
				
				@Override
				public float getDiscountFidelitate(int vechimeClientInAni) {
					// TODO Auto-generated method stub
					return 0.3f;
				}
			});
			
		}catch(ExceptiePretInvalid e){
			e.printStackTrace();
		
		}catch(ExceptieVechimeClient e){
			e.printStackTrace();
		}
	}
}
