package ro.ase.csie.cts.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.testare.modele.Student;
import ro.ase.csie.cts.testare.teste.categorii.TestImportant;

public class TestStudentAlteTeste {
	
	//test fixture
	static Student student;
	static ArrayList<Integer> noteInitiale=new ArrayList<>();
	static String numeInitial;
	static int varsta;
	static int nrNoteInitiale;
	static ArrayList<Integer> noteRandom=new ArrayList<>();
	
	@BeforeClass
	//se executa o singura data
	public static void setUpBeforeClass() throws Exception {
		numeInitial="gigel";
		varsta=Student.MIN_VARSTA +1;
		nrNoteInitiale=3;
	   for(int i=0;i<nrNoteInitiale;i++) {
		   noteInitiale.add(Student.MAX_NOTA-i);
	   }
	   
	   noteRandom=new ArrayList<>();
		int nrNote=(int) 1e6;
		Random random=new Random();
		for(int i =0;i<nrNote;i++) {
			noteRandom.add(random.nextInt(Student.MAX_NOTA)+1);
			
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	//inainte de fiecare test
	public void setUp() throws Exception {
		student=new Student(numeInitial,varsta,noteInitiale);
	}

	@After
	public void tearDown() throws Exception {
		student=null;
	}

	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMinValue() throws ExceptieVarsta{
		int varstaNoua = Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	@Test(expected = ExceptieVarsta.class)
	public void testeSetVarstaRangeValoarePozitivaMare()  throws ExceptieVarsta{
		int varstaNoua = 200;
		student.setVarsta(varstaNoua);
	}

	//boundary il limitam la partea de limite right
	//testam ultimele valori corecte 
	@Test
	public void testSetVarstaBoundaryLimitaInferioara()throws ExceptieVarsta {
		int varstaNoua=Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("test pt varsta minima",varstaNoua,varstaStudent);
	}
	@Test
	public void testSetVarstaBoundaryLimitaSuperioara()throws ExceptieVarsta {
		int varstaNoua=Student.MAX_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("test pt varsta maxima",varstaNoua,varstaStudent);
	}
	
	@Test
	public void testeSetNoteReferenceShallowCopy() throws ExceptieNota{
		int noteStudent[]=new int[] {9,9,10};
		ArrayList<Integer> refNote = new ArrayList<>(Arrays.asList(9, 9, 10)) ;
		student.setNote(refNote);
		
		refNote.set(0, 5);
		int noteExistente[] =new int[student.getNrNote()];
		for(int i=0;i<student.getNrNote();i++) {
			noteExistente[i]=student.getNota(i);
		}
		assertArrayEquals("test shallow copy pe setNote", noteStudent, noteExistente);
	}
	//Junit3
//	@Test
//	public void testGetMediePerformance() throws ExceptieNota{
//		ArrayList<Integer> note=new ArrayList<>();
//		int nrNote=(int) 1e6;
//		Random random=new Random();
//		for(int i =0;i<nrNote;i++) {
//			note.add(random.nextInt(Student.MAX_NOTA)+1);
//			
//		}
//		student.setNote(note);
//		
//		long tStart=System.currentTimeMillis();
//		student.getMedie();
//		long tFinal= System.currentTimeMillis();
//		
//		long durata=tFinal-tStart;
//		if(durata <= 10) {
//			assertTrue(true);
//		}
//		else {
//			fail("calculul mediei dureaza mai mult de 10 milisecunde");
//		}
//	}
	
	@Test(timeout = 30)
	@Category(TestImportant.class)
	public void testGetMediePerformance2() throws ExceptieNota{
		
		student.setNote(noteRandom);
		student.getMedie();
	}
	
	@Test
	//varsta nu mai este cea initiala -- verificare setar
	public void testSetVarstaInverse() throws ExceptieVarsta {
		int varstaNoua=varsta +1;
		student.setVarsta(varstaNoua);
		assertNotEquals("set nu modifica valoarea atributului",varsta, student.getVarsta());
	}
	
	@Test
	public void testGetNotaMinimaInverse() throws ExceptieNota {
		ArrayList<Integer> note=new ArrayList<>();
		Random random=new Random();
		
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		
		student.setNote(note);

		int notaMinima=student.getNotaMinima();
		for(int i=0;i<student.getNrNote();i++) {
			if(notaMinima> student.getNota(i)) {
				fail("minimul nu este calculat corect");
			}
		}
		assertTrue(true);
	}
	
	@Test
	public void testGetNotaMinimaCross() throws ExceptieNota  {
		
		ArrayList<Integer> note=new ArrayList<>();
		Random random=new Random();
		
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		
		student.setNote(note);
		int notaMinima=Collections.min(note);
		int notaMinCalculata=student.getNotaMinima();
		assertEquals("nota minima nu este aceasta", notaMinima,notaMinCalculata);
 	}
}
