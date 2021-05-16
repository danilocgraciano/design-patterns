package c.abstractfactory;

public class Main {

	public static void main(String[] args) {
		VehicleFactory honda = new HondaFactory();

		VehicleClient hondaClient = new VehicleClient(honda, "sports");
		System.out.println("*** Honda Sports ***");
		System.out.println(hondaClient.getBike().getName());
		System.out.println(hondaClient.getScooter().getName());
		System.out.println(hondaClient.getCar().getName());
		
		hondaClient = new VehicleClient(honda, "regular");
		System.out.println("*** Honda Regular ***");
		System.out.println(hondaClient.getBike().getName());
		System.out.println(hondaClient.getScooter().getName());
		System.out.println(hondaClient.getCar().getName());
	}

}
