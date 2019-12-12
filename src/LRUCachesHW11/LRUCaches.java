package LRUCachesHW11;

import java.util.LinkedHashMap;

public class LRUCaches<K, V> {

	LinkedHashMap<K, V> map = new LinkedHashMap<K, V>();

	public void put(K key, V value) {
		
		map.put(key, value);
	}

	public V get(K key) {
		
		if (map.containsKey(key)) {
			
			return map.get(key);
		} else {
			
			return null;
		}
	}
}