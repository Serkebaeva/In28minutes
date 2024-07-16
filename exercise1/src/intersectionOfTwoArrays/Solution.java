package intersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> resultList = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					resultList.add(nums1[i]);
					break;
				}
			}
		}

		// removing duplicates
		Set<Integer> resultSet = new HashSet<>(resultList);

		// converting to an array
		int[] result = new int[resultSet.size()];
		int index = 0;
		for (int num : resultSet) {
			result[index++] = num;
		}

		return result;
	}

	public static void main(String[] args) {
		Solution test = new Solution();
		int[] arr1 = { 9, 4, 9, 8, 4 };
		int[] arr2 = { 4, 9, 9, 5 };
		System.out.println(Arrays.toString(test.intersection(arr1, arr2)));
	}
}