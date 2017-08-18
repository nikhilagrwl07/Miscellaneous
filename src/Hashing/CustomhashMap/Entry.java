/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing.CustomhashMap;


class Entry<K, V> {
	K key;
	V value;
	Entry<K, V> next;

	public Entry(K key, V value, Entry<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
}
