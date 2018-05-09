package com.test.custom.collection.hashmap;

public class HashMapCustom<K, V> {

	static class HashEntry<K, V> {
		K key;
		V value;
		HashEntry<K, V> next;

		HashEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private HashEntry<K, V> tables[] = null;
	private static final int capacity = 4;

	@SuppressWarnings("unchecked")
	public HashMapCustom() {
		tables = new HashEntry[capacity];
	}

	public void put(K key, V value) {
		int hIndex = hash(key);
		// create new entry
		HashEntry<K, V> newEntry = new HashEntry<K, V>(key, value);
		// if the value at index is null means the hascode postion entry is blank, so
		// directly put the new entry
		if (tables[hIndex] == null) {
			tables[hIndex] = newEntry;
		} else {
			HashEntry<K, V> current = tables[hIndex];
			HashEntry<K, V> previous = null;
			// loop through out the linked list of entry
			while (current != null) {
				// if the key and the existing enty matches
				if (current.key.equals(key)) {
					// check if the previous is null means new entry should be inserted at first
					// position of linked list

					if (previous == null) {
						newEntry.next = current.next;
						tables[hIndex] = newEntry;
						return;
					} else {
						// else new entry should be inserted just after previous and the link should be
						// created between new entry and current
						newEntry.next = current.next;
						previous.next = newEntry;
						return;
					}
				}
				// navigate the linked list and maintain previous link
				previous = current;
				current = current.next;
			}

			// if the key does not matches, just put the new entry at the end, as the
			// current will be null after while loop end, so previous will be pointing to
			// last enty of linked list
			previous.next = newEntry;

		}

	}

	public HashEntry<K, V> get(K key) {
		int hIndex = hash(key);
		if (tables[hIndex] == null) {
			return null;
		}

		HashEntry<K, V> current = tables[hIndex];
		while (current != null) {
			if (current.key.equals(key)) {
				return current;
			}
			current = current.next;
		}

		return null;
	}

	/**
	 * Method removes key-value pair from HashMapCustom.
	 * 
	 * @param key
	 */
	public boolean remove(K deleteKey) {

		int hash = hash(deleteKey);

		if (tables[hash] == null) {
			return false;
		} else {
			HashEntry<K, V> previous = null;
			HashEntry<K, V> current = tables[hash];

			while (current != null) { // we have reached last entry node of bucket.
				if (current.key.equals(deleteKey)) {
					if (previous == null) { // delete first entry node.
						tables[hash] = tables[hash].next;
						return true;
					} else {
						previous.next = current.next;
						return true;
					}
				}
				previous = current;
				current = current.next;
			}
			return false;
		}

	}

	public int hash(K key) {
		if (key == null) {
			return 0;
		}
		// find the reminder with capacity so that the index returned should be within
		// range of capacity
		return Math.abs(key.hashCode()) % capacity;
	}

	/**
	 * Method displays all key-value pairs present in HashMapCustom., insertion
	 * order is not guaranteed, for maintaining insertion order refer
	 * LinkedHashMapCustom.
	 * 
	 * @param key
	 */
	public void display() {

		for (int i = 0; i < capacity; i++) {
			if (tables[i] != null) {
				HashEntry<K, V> entry = tables[i];
				while (entry != null) {
					System.out.print("{" + entry.key + "=" + entry.value + "}" + "   ");
					entry = entry.next;
				}
			}
		}

	}
}
