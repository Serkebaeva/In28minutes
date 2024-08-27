package majorityElement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class Solution {
	public int majorityElement(int[] nums) {
		int n = nums.length;
		int times = n / 2;

		ConcurrentMap<Integer, LongAdder> occurrences = new ConcurrentHashMap<>();
		for (int integer : nums) {
			occurrences.computeIfAbsent(integer, num -> new LongAdder()).increment();
		}

		for (Integer key : occurrences.keySet()) {
			if (occurrences.get(key).intValue() > times) {
				return key;
			}
		}

		throw new IllegalArgumentException("No majority element found");
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 2, 3, 3 };
		int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(solution.majorityElement(nums));
		System.out.println(solution.majorityElement(nums2));

	}
}