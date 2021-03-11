package ro.ase.csie.cts.lab3.faza1;

public class Produs {
	
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_FINAL_MAXIM = 0.15f;
	
	
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientAni)
	  {
	    float pretFinal = 0;
	    float discountFidelitate = (vechimeClientAni > VECHIME_CLIENT_MAXIMA ) ? (float)DISCOUNT_FINAL_MAXIM : (float)vechimeClientAni/100; 
	    if (tipProdus == TipProdus.NOU)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipProdus == TipProdus.DISCOUNT)
	    {
	      pretFinal = (pretInitial - (0.1f * pretInitial)) - discountFidelitate * (pretInitial - (0.1f * pretInitial));
	    }
	    else if (tipProdus == TipProdus.STOC_LIMITAT)
	    {
	      pretFinal = (pretInitial - (0.25f * pretInitial)) - discountFidelitate * (pretInitial - (0.25f * pretInitial));
	    }
	    else if (tipProdus == TipProdus.VECHI)
	    {
	      pretFinal = (pretInitial - (0.35f * pretInitial)) - discountFidelitate * (pretInitial - (0.35f * pretInitial));
	    }
	    return pretFinal;
	  }
}
