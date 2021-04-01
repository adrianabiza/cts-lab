package ro.ase.csie.cts.dp.factory;

public class CaracterDisney extends CaracterAbstract{
	String culoareString;
	
	public CaracterDisney(String culoareString, String nume) {
		this.culoareString = culoareString;
		this.nume = nume;
	}

	@Override
	public void alearga() {
		System.out.println("alearga");		
	}

	@Override
	public void sare() {
		System.out.println("alearga");			
		
	}
	
	
}
