package ro.ase.csie.cts.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D {
	String fisierModel3D;
	String culoare;
	int inaltime;
	ArrayList<Integer> puncteGrafic = null;
	
	private Caracter3D() {
		// TODO Auto-generated constructor stub
	}
	public Caracter3D(String fisierModel3DString) {
		System.out.println("Se incarca modelul 3D din"+fisierModel3DString);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.fisierModel3D= fisierModel3D;
		
		Random random = new Random();
		puncteGrafic = new ArrayList<>();
		for(int i=0;i<10;i++) {
			puncteGrafic.add(random.nextInt(1000));
		}
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Puncte caracter 3D: ");
		for(int punct: this.puncteGrafic) {
			sb.append(punct + "|");
		}
		return sb.toString();
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		//NU ASA
		//Caracter3D copie = new Caracter3D(this.fisierModel3D) 
		
		Caracter3D copie = new Caracter3D();
		copie.culoare = this.culoare;
		copie.fisierModel3D = fisierModel3D;
		copie.inaltime = inaltime;
		copie.puncteGrafic = (ArrayList<Integer>)this.puncteGrafic.clone();
		
		return copie;
		
	}
	
	
	
}
