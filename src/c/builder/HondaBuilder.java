package c.builder;

public class HondaBuilder implements VehicleBuilder {

	private Vehicle vehicle = new Vehicle();

	@Override
	public void setModel() {
		vehicle.setModel("honda");
	}

	@Override
	public void setEngine() {
		vehicle.setEngine("4 stroke");
	}

	@Override
	public void setTransmission() {
		vehicle.setTransmission("125 Km/hr");
	}

	@Override
	public void setBody() {
		vehicle.setBody("plastic");
	}

	@Override
	public void setAcessories() {
		vehicle.getAcessories().add("Seat Cover");
		vehicle.getAcessories().add("Rear Mirror");
		vehicle.getAcessories().add("Helmet");
	}

	@Override
	public Vehicle getVehicle() {
		return vehicle;
	}

}
