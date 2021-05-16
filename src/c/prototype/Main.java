package c.prototype;

public class Main {

	public static void main(String[] args) {
		var dev = new Developer();
		dev.setName("Danilo C. Graciano");
		dev.setRole("Software Engineer");
		dev.setPreferredLanguage("Java");

		Developer copyDev = (Developer) dev.clone();
		copyDev.setName("Other Name");
		
		System.out.println(dev.getDetails());
		System.out.println(copyDev.getDetails());
		
		var manager = new Manager();
		manager.setName("Danilo C. Graciano");
		manager.setRole("Software Engineer");
		manager.setWordsPerMinute(120);
		
		Manager copyManager = (Manager) manager.clone();
		copyManager.setWordsPerMinute(110);
		
		System.out.println(manager.getDetails());
		System.out.println(copyManager.getDetails());
	}

}
