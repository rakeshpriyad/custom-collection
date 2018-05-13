package com.test.collection.custom.impl.hashset;

import com.test.collection.custom.impl.hashmap.CustomHashMap;

/* This class provides custom implementation of HashSet(without using java api's- we will be using HashMapCustom)- which allows does not allow you to store duplicate values.
* Note- implementation does not allow you to store null values.
* does not maintain insertion order.
* @param <K>
* @param <V>
*/
public class CustomHashSet<E> {

	private CustomHashMap<E, Object> customeHashMap;

	public CustomHashSet() {
		customeHashMap = new CustomHashMap<E, Object>();
	}

	/**
	 * add objects in SetCustom.
	 */
	public void add(E value) {
		customeHashMap.put(value, null);
	}

	/**
	 * Method returns true if set contains the object.
	 * 
	 * @param key
	 */
	public boolean contains(E obj) {
		return customeHashMap.contains(obj) != null ? true : false;
	}

	/**
	 * Method displays all objects in setCustom. insertion order is not
	 * guaranteed, for maintaining insertion order refer LinkedHashSet.
	 */
	public void display() {
		customeHashMap.displaySet();
	}

	/**
	 * Method removes object from setCustom.
	 * 
	 * @param obj
	 */
	public boolean remove(E obj) {
		return customeHashMap.remove(obj);
	}

}
