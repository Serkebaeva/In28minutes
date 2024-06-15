package arrayIsSorted;

public class IsSorted {
	public static boolean isSorted(int[] array) {

		if (array.length == 0 || array.length == 1) {
			return true;
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(IsSorted.isSorted(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(IsSorted.isSorted(new int[] { 5, 4, 3, 2, 1 }));
	}

}
