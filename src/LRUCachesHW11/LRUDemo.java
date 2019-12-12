package LRUCachesHW11;

public class LRUDemo {

	public static void main(String[] args) {

		LRUCaches<Integer, String> cache = new LRUCaches<Integer, String>();

		cache.put(0, "Каждый");
		cache.put(1, " Охотник");
		cache.put(2, " Желает");
		cache.put(3, " Знать");
		cache.put(4, " Где");
		cache.put(5, " Сидят");
		cache.put(6, " Фазан.");
		cache.put(5, " Сидит");

		System.out.println(
				cache.get(0) + cache.get(1) + cache.get(2) + cache.get(3) + cache.get(4) + cache.get(5) + cache.get(6));

	}

}
