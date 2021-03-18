
package ro.ase.csie.cts.lab4.faza3;

import ro.ase.csie.cts.lab3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.lab3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.lab4.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.lab4.faza3.servicii.InterfataValidare;

public class Produs {
	
	InterfataMarketing serviciuMK = null;
	InterfataValidare seviciuValidare = null;
	
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount * pretInitial);
	}
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) 
			throws ExceptiePretInvalid, ExceptieVechimeClient
	  {
		
		seviciuValidare.validarePret(pretInitial);
		seviciuValidare.validareVechimeClient(vechimeClientInAni);
		
	    float discountFidelitate = (tipProdus == TipProdus.NOU) ? 0:serviciuMK.getDiscountFidelitate(vechimeClientInAni);
	    
	    float discount = tipProdus.getDiscount();
    	float valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
    	float pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);	   
	    
	    return pretFinal;
	  }
}