package c.builder;

public class VehicleCreator {

	private final VehicleBuilder builder;

	public VehicleCreator(VehicleBuilder builder) {
		this.builder = builder;
	}

	public VehicleCreator createVehicle() {
		builder.setModel();
		builder.setEngine();
		builder.setBody();
		builder.setTransmission();
		builder.setAcessories();
		return this;
	}

	public Vehicle getVehicle() {
		return builder.getVehicle();
	}

}
