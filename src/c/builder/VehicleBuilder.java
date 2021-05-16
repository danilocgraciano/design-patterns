package c.builder;

public interface VehicleBuilder {

	void setModel();

	void setEngine();

	void setTransmission();

	void setBody();

	void setAcessories();

	Vehicle getVehicle();

}
