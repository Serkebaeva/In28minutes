package fanClass;

public class Fan {

	// state of object
	private String make;
	private double radius;
	private String color;

	private Boolean isOn;
	private byte speed; // 0 to 5

	// creation
	/*
	 * (how to allow creation of the objects? or how do you decide what kind of
	 * constructors do you want to allow? The question you'd need to typically ask
	 * is what are the most important things that this object cannot live without? )
	 */

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// print the state
	/* providing a string representation of the entire object */
	public String toString() {
		return String
				.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn, speed);
	}

	// isOn
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	// setSpeed
	public void setSpeed(byte speed) {
		this.speed = speed;
	}

}
