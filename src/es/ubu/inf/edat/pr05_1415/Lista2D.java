package es.ubu.inf.edat.pr05_1415;

import java.util.AbstractList;
import java.util.Iterator;

public class Lista2D<E> extends AbstractList<E> {
	
	/**
	 * Constructor de la clase
	 * @param i
	 * @param j
	 */
	public Lista2D(int i, int j) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**
	 * Añade un metodo por el indice
	 * @param index
	 * @param element
	 */
	public void add (int index, E element) {
		
	}
	
	/**
	 * Añade un metodo por su fila y columna
	 * @param row
	 * @param column
	 * @param element
	 */
	public void add(int row, int column, E element) {
		
	}
	
	/**
	 * Obtiene un elemento mediante su fila y columna
	 * @param row
	 * @param column
	 * @return
	 */
	public E get(int row, int column) {
		return null;
		
	}
	
	/**
	 * Estable el valor de un elemento
	 * @param index
	 * @param element
	 * @return 
	 */
	public E set(int index, E element) {
		return element;
		
	}
	
	/**
	 * Establece el valor de un elemento que esta en la fila y columna
	 * @param row
	 * @param column
	 * @param element
	 * @return
	 */
	public E set(int row, int column, E element) {
		return element;
		
	}
	/**
	 * Elimina el elemento que esta en el indice
	 * @param index
	 */
	public E remove(int index) {
		return null;
		
	}
	
	/**
	 * Elimina el elemento que esta en esa fila o columna
	 * @param row
	 * @param column
	 * @return
	 */
	public E remove(int row, int column) {
		return null;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public Iterator<E> iteradorColumnas() {
		// TODO Auto-generated method stub
		return null;
	}


}
