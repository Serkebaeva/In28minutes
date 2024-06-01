package TriangleValidator;

public class TriangleValidator {
	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		if (angle1 < 0 || angle2 < 0 || angle3 < 0) {
			System.out.println("Only positive numbers must be!");
			return false;
		}
		return angle1 + angle2 + angle3 == 180;
	}

	public static void main(String[] args) {
		TriangleValidator triangle = new TriangleValidator();
		System.out.println(triangle.isValidTriangle(60, 40, 80));
	}
}