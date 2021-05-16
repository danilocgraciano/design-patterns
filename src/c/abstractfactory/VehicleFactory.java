package c.abstractfactory;

public interface VehicleFactory {
	
	Bike getBike(String bike);
	
	Scooter getScooter(String scooter);
	
	Car getCar(String car);

}
