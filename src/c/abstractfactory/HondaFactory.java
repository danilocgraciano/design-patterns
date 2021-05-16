package c.abstractfactory;

public class HondaFactory implements VehicleFactory {

	@Override
	public Bike getBike(String bike) {
		switch (bike) {
		case "sports":
			return new SportsBike();
		case "regular":
			return new RegularBike();
		default:
			throw new IllegalArgumentException(String.format("Bike %s cannot be created", bike));
		}
	}

	@Override
	public Scooter getScooter(String scooter) {
		switch (scooter) {
		case "sports":
			return new Scooty();
		case "regular":
			return new RegularScooter();
		default:
			throw new IllegalArgumentException(String.format("Scooter %s cannot be created", scooter));
		}
	}

	@Override
	public Car getCar(String car) {
		switch (car) {
		case "sports":
			return new SportsCar();
		case "regular":
			return new RegularCar();
		default:
			throw new IllegalArgumentException(String.format("Car %s cannot be created", car));
		}
	}

}
