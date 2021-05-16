package c.builder;

public class Main {

	public static void main(String[] args) {

		var vehicleCreator = new VehicleCreator(new FerrariBuilder());
		var vehicle = vehicleCreator.createVehicle().getVehicle();
		vehicle.showInfo();
		
		System.out.println("------------------------");
		
		vehicleCreator = new VehicleCreator(new HondaBuilder());
		vehicle = vehicleCreator.createVehicle().getVehicle();
		vehicle.showInfo();
		
	}

}
