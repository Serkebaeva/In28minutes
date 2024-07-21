package intersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution2 {
	public int[] intersection(int[] nums1, int[] nums2) {
		// Use a set to store the unique elements of nums1
		Set<Integer> set1 = new HashSet<>();
		for (int num : nums1) {
			set1.add(num);
		}

		// Use another set to store the intersection elements
		Set<Integer> intersectionSet = new HashSet<>();
		for (int num : nums2) {
			if (set1.contains(num)) {
				intersectionSet.add(num);
			}
		}

		// Convert the intersection set to an array
		int[] result = new int[intersectionSet.size()];
		int index = 0;
		for (int num : intersectionSet) {
			result[index++] = num;
		}

		return result;
	}

	public static void main(String[] args) {
		Solution test = new Solution();
		int[] arr1 = { 1, 2, 2, 1, 4, 6, 6 };
		int[] arr2 = { 2, 2, 3, 6 };
		System.out.println(Arrays.toString(test.intersection(arr1, arr2)));
	}
}

