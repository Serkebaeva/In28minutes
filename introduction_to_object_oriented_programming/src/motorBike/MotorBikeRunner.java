package motorBike;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		// changing the state of the object of a class;
		// !speed = 50; ---> Напрямую поменять состояние переменной не получится!
		// Менять можно только состояние скорости каждого объекта....

		ducati.speed = 100;
		ducati.speed = 80;

	}

}
