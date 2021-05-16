package c.factorymethod;

public class Scooter implements Vehicle {

	@Override
	public void drive(int miles) {
		System.out.println(String.format("Drive the scooter : %s miles", miles));
	}

}
