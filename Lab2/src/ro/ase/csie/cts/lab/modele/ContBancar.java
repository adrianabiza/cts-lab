package ro.ase.csie.cts.lab.modele;

public abstract class ContBancar extends Cont {

	protected double balanta;
	protected String iban;

	public ContBancar(double balata, String iban) {
		this.balanta = balata;
		this.iban = iban;
	}

	@Override
	public double getBalanta() {
		return this.balanta;
	}

}
