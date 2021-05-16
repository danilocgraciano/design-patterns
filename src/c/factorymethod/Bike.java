package c.factorymethod;

public class Bike implements Vehicle {

	@Override
	public void drive(int miles) {
		System.out.println(String.format("Drive the bike : %s miles", miles));
	}

}
