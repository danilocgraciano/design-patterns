package c.factorymethod;

public class VehicleFactory extends AbstractVehicleFactory {

	@Override
	public Vehicle getVehicle(String vehicle) {
		switch (vehicle) {
		case "scooter":
			return new Scooter();
		case "bike":
			return new Bike();
		default:
			throw new IllegalArgumentException(String.format("Vehicle %s cannot be created", vehicle));
		}
	}

}
