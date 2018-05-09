package com.test.custom.collection.vector;

import java.util.Arrays;

public class VectorCustom<E> {

	private static final int INIT_SIZE = 10;
	private static int size = 0;
	private Object elements[] = {};

	public VectorCustom() {
		elements = new Object[INIT_SIZE];
	}
	public synchronized void add(E e) {
		if (size == elements.length) {
			ensureCapacity();
		}
		
		elements[size ++ ] = e;
	}

	private void ensureCapacity() {
		int newsize = elements.length * 2;
		elements = Arrays.copyOf(elements, newsize);
	}

	@SuppressWarnings("unchecked")
	public synchronized E get(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		} else {
			return (E) elements[index];
		}
	}

	@SuppressWarnings("unchecked")
	public synchronized E remove(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		E e = (E) elements[index];
		
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return e;
	}
	
	 public void display() {
	      System.out.print("Displaying list : ");
	      for(int i=0;i<size;i++){
	             System.out.print(elements[i]+" ");
	      }
	  }
}
