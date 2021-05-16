package c.abstractfactory;

public class VehicleClient {

	private Bike bike;

	private Scooter scooter;

	private Car car;

	public VehicleClient(VehicleFactory factory, String type) {
		bike = factory.getBike(type);
		scooter = factory.getScooter(type);
		car = factory.getCar(type);
	}

	public Bike getBike() {
		return bike;
	}

	public Scooter getScooter() {
		return scooter;
	}

	public Car getCar() {
		return car;
	}

}
