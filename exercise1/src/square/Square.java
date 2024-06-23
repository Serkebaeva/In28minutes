package square;

public class Square {

	private int side;

	public Square(int side) {
		// TODO: Initialize side with the passed value
		this.side = side;
	}

	public int calculateArea() {
		// TODO: Calculate and return the area of the square
		if (side <= 0) {
			return -1;
		}

		int area = this.side * this.side;
		return area;
	}

	public int calculatePerimeter() {
		// TODO: Calculate and return the perimeter of the square
		if (side <= 0) {
			return -1;
		}
		int perimeter = 4 * this.side;
		return perimeter;
	}

	public static void main(String[] args) {
		Square test = new Square(5);
		System.out.println(test.calculateArea());
		System.out.println(test.calculatePerimeter());
	}

}