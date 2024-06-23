package dimensions;

public class Dimensions {

	private int feet;
	private int inches;

	public Dimensions(int inches) {
		if (inches < 0) {
			this.feet = -1;
			this.inches = -1;
		} else {
			this.feet = inches / 12;
			this.inches = inches % 12;
		}
	}

	public int getFeet() {
		return this.feet;
	}

	public int getInches() {
		return this.inches;
	}

	public static void main(String[] args) {
		Dimensions dim1 = new Dimensions(25);
		System.out.println(dim1.getFeet()); // Output: 2
		System.out.println(dim1.getInches()); // Output: 1

		Dimensions dim2 = new Dimensions(-1);
		System.out.println(dim2.getFeet()); // Output: -1
		System.out.println(dim2.getInches()); // Output: -1

		Dimensions dim3 = new Dimensions(0);
		System.out.println(dim3.getFeet()); // Output: 0
		System.out.println(dim3.getInches()); // Output: 0
	}
}
