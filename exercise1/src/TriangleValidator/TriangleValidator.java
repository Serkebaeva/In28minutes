package TriangleValidator;

public class TriangleValidator {
	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			System.out.println("Only positive numbers must be!");
			return false;
		}
		return angle1 + angle2 + angle3 == 180;
	}

	public boolean isRightAngledTriangle(int side1, int side2, int side3) {
		if ((side1 * side1) + (side2 * side2) == (side3 * side3)) {
			return true;
		}
		if ((side2 * side2) + (side3 * side3) == (side1 * side1)) {
			return true;
		}
		if ((side1 * side1) + (side3 * side3) == (side2 * side2)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		TriangleValidator triangle = new TriangleValidator();
		System.out.println(triangle.isValidTriangle(60, 40, 80));
		System.out.println(triangle.isRightAngledTriangle(3, 4, 5)); // true
	}
}