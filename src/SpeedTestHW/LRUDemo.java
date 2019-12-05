package SpeedTestHW;

public class LRUDemo {

	public static void main(String[] args) {

		LRUCache<Integer, Integer> cache = new LRUCache<Integer, Integer>();

		for (int i = 0; i < 50; i++) {
			
			cache.putSmth(i, i);
		}

		System.out.println(cache.getSmth(1));

	}
}