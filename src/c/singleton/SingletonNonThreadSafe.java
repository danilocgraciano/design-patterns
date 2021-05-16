package c.singleton;

public class SingletonNonThreadSafe {

	private static SingletonNonThreadSafe singleton;

	public static SingletonNonThreadSafe getInstance() {
		if (singleton == null) {
			singleton = new SingletonNonThreadSafe();
		}
		return singleton;
	}

}
