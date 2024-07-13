package containsDuplicateIntegers;

import java.util.Arrays;

class Solution {
	public boolean containsDuplicate(int[] nums) {
		// Sort the array
		Arrays.sort(nums);

		// Check for duplicates in the sorted array
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Solution test = new Solution();
		int[] array1 = { 5, 4, 3, 4, 5, 1 };
		System.out.println("array1 " + test.containsDuplicate(array1));
		int[] array2 = { 1, 2, 3, 1 };
		System.out.println("array2 " + test.containsDuplicate(array2));
		int[] array3 = { 1, 2, 3, 4 };
		System.out.println("array3 " + test.containsDuplicate(array3));
		int[] array4 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println("array4 " + test.containsDuplicate(array4));
	}
}