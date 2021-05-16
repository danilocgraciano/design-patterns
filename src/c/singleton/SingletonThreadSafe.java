package c.singleton;

public class SingletonThreadSafe {

	private static SingletonThreadSafe singleton;

	public synchronized static SingletonThreadSafe getInstance() {
		if (singleton == null) {
			singleton = new SingletonThreadSafe();
		}
		return singleton;
	}

}
