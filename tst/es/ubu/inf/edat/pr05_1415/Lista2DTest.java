package es.ubu.inf.edat.pr05_1415;

import java.util.Iterator;
import java.util.Random;

import junit.framework.TestCase;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;

import es.ubu.inf.edat.pr05_1415.Lista2D;

public class Lista2DTest extends TestCase{

	Lista2D<Integer> lista2d;

//	@Before
	public void setUp(){
		this.lista2d = new Lista2D<Integer>(3,4);
	}

//	@After
	public void tearDown(){
		lista2d.clear();
	}

	/**
	 * Se inserta empleando indices en 2D.
	 * Se recuperan empleando indices en 2D.
	 * 
	 */
//	@Test
	public void testInsertar2DRecuperar2D() {

		assertTrue(lista2d.isEmpty());
		assertEquals(0,lista2d.size());

		int k = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){

				lista2d.add(i, j, new Integer(k++));

				assertEquals(k,lista2d.size());
			}
		}

		assertFalse(lista2d.isEmpty());
		assertEquals(12,lista2d.size());

		System.out.println(lista2d);

		assertEquals((Integer) 5, lista2d.get(1,1));
		assertEquals((Integer) 11, lista2d.get(2,3));
		assertEquals((Integer) 2, lista2d.get(0,2));
		assertEquals((Integer) 8, lista2d.get(2,0));
	}

	/**
	 * Se insertan elementos empleando indices en 1D.
	 * Se recuperan elementos empleando indices en 1D.
	 */
//	@Test
	public void testInsertar1Drecuperar1D() {

		assertTrue(lista2d.isEmpty());
		assertEquals(0,lista2d.size());

		for(int i=0; i<12; i++){
			lista2d.add(i, new Integer(i));
			assertEquals(i+1,lista2d.size());
		}

		assertFalse(lista2d.isEmpty());
		assertEquals(12,lista2d.size());

		assertEquals((Integer) 5, lista2d.get(5));
		assertEquals((Integer) 11, lista2d.get(11));
		assertEquals((Integer) 2, lista2d.get(2));
		assertEquals((Integer) 8, lista2d.get(8));
	}

//	@Test
	public void testEstablecer2DRecuperar2D(){

		assertTrue(lista2d.isEmpty());
		assertEquals(0,lista2d.size());

		testInsertar2DRecuperar2D();

		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){

				int recup = lista2d.get(i,j);
				lista2d.set(i, j, recup*3);
				assertEquals(12,lista2d.size());

			}
		}

		assertFalse(lista2d.isEmpty());
		assertEquals(12,lista2d.size());

		assertEquals((Integer) 15, lista2d.get(1,1));
		assertEquals((Integer) 33, lista2d.get(2,3));
		assertEquals((Integer) 6, lista2d.get(0,2));
		assertEquals((Integer) 24, lista2d.get(2,0));

	}

//	@Test
	public void testEstablecer1DRecuperar1D(){

		assertTrue(lista2d.isEmpty());
		assertEquals(0,lista2d.size());

		testInsertar2DRecuperar2D();

		for(int i=0; i<lista2d.size(); i++){

			int recup = lista2d.get(i);
			lista2d.set(i, recup*3);
			assertEquals(12,lista2d.size());

		}

		assertFalse(lista2d.isEmpty());
		assertEquals(12,lista2d.size());

		System.out.println(lista2d);
		
		assertEquals((Integer) 15, lista2d.get(5));
		assertEquals((Integer) 33, lista2d.get(11));
		assertEquals((Integer) 6, lista2d.get(2));
		assertEquals((Integer) 24, lista2d.get(8));

	}

//	@Test
	public void testInsertar2DEliminar2D(){

		testInsertar2DRecuperar2D();

		System.out.println(lista2d);

		int k = 11; int devuelto = 0;

		for(int i=2; i>=0; i--){
			for(int j=3; j>=0; j--){

				devuelto = lista2d.remove(i,j);
				assertEquals(k, devuelto);
				assertEquals(k, lista2d.size());

				k--;
			}
		}

		assertTrue(lista2d.isEmpty());
		assertEquals(0,lista2d.size());

	}

//	@Test
	public void testInsertar1DEliminar1D(){

		testInsertar1Drecuperar1D();

		System.out.println(lista2d);

		int devuelto = 0;

		for(int i=11; i>=0; i--){

			devuelto = lista2d.remove(i);
			assertEquals(i, devuelto);
			assertEquals(i, lista2d.size());

		}

		assertTrue(lista2d.isEmpty());
		assertEquals(0,lista2d.size());

	}

//	@Test 
	public void testIteradorLineal(){

		for(int i=0; i<12; i++){
			lista2d.add(i, new Integer(i));
		}

		Integer[] control = {0,1,2,3,4,5,6,7,8,9,10,11}; 

		Iterator<Integer> it = lista2d.iterator();
		int ind = 0;

		while(it.hasNext()){
			assertEquals(control[ind],it.next());
			ind++;
		}

	}

//	@Test 
	public void testIteradorColumnas(){

		for(int i=0; i<12; i++){
			lista2d.add(i, new Integer(i));
		}

		Integer[] control = {0,4,8,1,5,9,2,6,10,3,7,11}; 

		Iterator<Integer> it = lista2d.iteradorColumnas();
		int ind = 0;

		while(it.hasNext()){
			assertEquals(control[ind],it.next());
			ind++;
		}

	}

//	@Test
	public void testInsertar2DRecuperar2D_char() {

		char[] control = new char[12];
		for (int i=0; i<12; i++){
			Random r = new Random();
			control[i] = (char)(r.nextInt(26) + 'a');
		}
		
		System.out.println(control);
		
		Lista2D<Character> lista_C = new Lista2D<Character>(3,4);
		
		assertTrue(lista_C.isEmpty());
		assertEquals(0,lista_C.size());

		int k = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){

				lista_C.add(i, j, control[k++]);
				assertEquals(k,lista_C.size());
				
			}
		}

		assertFalse(lista_C.isEmpty());
		assertEquals(12,lista_C.size());

		System.out.println(lista_C);

		assertEquals((Character) control[5], lista_C.get(1,1));
		assertEquals((Character) control[11], lista_C.get(2,3));
		assertEquals((Character) control[2], lista_C.get(0,2));
		assertEquals((Character) control[8], lista_C.get(2,0));
	}
	
//	@Test
//	public void eficienciaCompItColumnas(){
//		
//		int tamanoMax = 100000;
//		int numPruebas = 10;
//		
//		int incremento = Math.round(tamanoMax/numPruebas);
//		int tamano = incremento;
//
//		double tIni, tFin;
//		
//		for(int i=0; i<10; i++){
//			
//			int filas = (int) Math.floor(Math.sqrt(tamano));
//			int columnas = (int) Math.floor(Math.sqrt(tamano));
//			
//			Lista2D<Integer> lista2d = new Lista2D<Integer>(filas,columnas);
//			
//			List<Integer> aleatoria = GeneradorEnteros.listaAleatoria(filas*columnas);
//			lista2d.addAll(aleatoria);
//			
//			tIni = System.currentTimeMillis();
//			recorreColumnas(lista2d);
//			tFin = System.currentTimeMillis();
//			
//			System.out.println("Recorrido columnas,Tamano,"+filas*columnas+",tiempo(ms),"+(tFin-tIni));
//			
//			tamano = tamano + incremento;
//		}
//
//		
//	}
//	
//
//	private void recorreColumnas(Lista2D<Integer> paraRecorrer){
//		
//		Iterator<Integer> it = paraRecorrer.iteradorColumnas();
//		
//		while(it.hasNext()){
//			Integer num = it.next();
////			System.out.print(num+", ");
//		}
//		
//	}
	
}
