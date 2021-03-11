package ro.ase.csie.cts.lab3.faza1;

import ro.ase.csie.cts.lab3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.lab3.exceptii.ExceptieVechimeClient;

public class Produs {
	
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_FINAL_MAXIM = 0.15f;
	
	
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientAni) throws ExceptiePretInvalid, ExceptieVechimeClient
	  {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
		
		if(vechimeClientAni < 0) {
			throw new ExceptieVechimeClient();
		}
		
	    float pretFinal = 0;
	    float discountFidelitate = (vechimeClientAni > VECHIME_CLIENT_MAXIMA ) ? (float)DISCOUNT_FINAL_MAXIM : (float)vechimeClientAni/100; 
	    float discount = TipProdus.NOU.getDiscount();
	    
		switch(tipProdus) {
		case NOU:
		      pretFinal = pretInitial;
		      break;
		case DISCOUNT:
			discount = TipProdus.DISCOUNT.getDiscount();
	    	pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (discount * pretInitial));
	    	break;
		case STOC_LIMITAT:
			discount = TipProdus.STOC_LIMITAT.getDiscount();
	    	pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (discount * pretInitial));
	    	break;
		case VECHI:
			discount = TipProdus.VECHI.getDiscount();
	    	pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (discount * pretInitial));
	    	break;
	    default:
	    	throw new UnsupportedOperationException("Un simbol din enum nu este procesat");
		}
	    
	    return pretFinal;
	  }
}
