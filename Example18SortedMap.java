package slideDeckChallenges;

import java.util.Map;
import java.util.TreeMap;

public class Example18SortedMap {

	public static void main(String[] args) {

		Map<Integer, String> mySortedMap = new TreeMap<Integer, String>();
		
		mySortedMap.put(4, "four");
		mySortedMap.put(1, "one");
		mySortedMap.put(3, "three");
		mySortedMap.put(2, "two");
		
		for (Integer key : mySortedMap.keySet()) {
			System.out.printf("%10d%10s \n", key, mySortedMap.get(key));
		}
		
		
	}

}
