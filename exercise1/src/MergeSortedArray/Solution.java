package MergeSortedArray;

import java.util.Arrays;

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1.length > m + n) {
			System.out.println("Invalid digits length - check the Array!");
			return;
		}

		if (m == 0) {
			// Copy all elements from nums2 into nums1 when nums1 is empty
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
			return;
		}

		// Start from the end of nums1 and nums2
		int i = m - 1; // Pointer for the last element of the valid part of nums1
		int j = n - 1; // Pointer for the last element of nums2
		int k = m + n - 1; // Pointer for the last position in nums1

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--]; // Place nums1[i] at the end and move i and k backwards
			} else {
				nums1[k--] = nums2[j--]; // Place nums2[j] at the end and move j and k backwards
			}
		}

	}

	public static void main(String[] args) {
		Solution test = new Solution();
		int[] nums1 = { 1, 2, 3, 7, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		test.merge(nums1, 4, nums2, 3);
		System.out.println(Arrays.toString(nums1));
	}
}