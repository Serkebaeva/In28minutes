package intersectionOfTwoArrays;

import java.util.ArrayList;
//without using Set, only arrays..

public class Solution3 {

	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> resultList = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					// Avoid adding duplicates
					if (!resultList.contains(nums1[i])) {
						resultList.add(nums1[i]);
					}
					break; // No need to check further for this element
				}
			}
		}

		// Convert the result list to an array
		int[] result = new int[resultList.size()];
		for (int k = 0; k < result.length; k++) {
			result[k] = resultList.get(k);
		}

		return result;
	}
}
