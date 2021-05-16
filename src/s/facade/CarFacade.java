package s.facade;

public class CarFacade {

	private CarModel model;
	private CarEngine engine;
	private CarBody body;
	private CarAcessories acessories;

	public CarFacade() {
		model = new CarModel();
		engine = new CarEngine();
		body = new CarBody();
		acessories = new CarAcessories();
	}

	public void createCompleteCar() {
		System.out.println("Creating a car...");
		model.setModel();
		engine.setEngine();
		body.setBody();
		acessories.setAcessories();
		System.out.println("Car created!!!");
	}

}
