package SpeedTestHW;

import java.util.LinkedHashMap;

public class LRUCache<K, V> {

	LinkedHashMap<K, V> map = new LinkedHashMap<K, V>();

	public void putSmth(K key, V value) {
		map.put(key, value);
	}

	public V getSmth(K key) {
		if (map.containsKey(key)) {
			return map.get(key);
		} else {
			return null;
		}
	}
}