package c.factorymethod;

public class Main {

	public static void main(String[] args) {
		AbstractVehicleFactory factory = new VehicleFactory();

		Vehicle scooter = factory.getVehicle("scooter");
		scooter.drive(10);

		Vehicle bike = factory.getVehicle("bike");
		bike.drive(20);
	}

}
