package singletonPattern;

public class Singleton {
	public static Singleton instance;
	private Singleton() {
		System.out.println("Instance is created!");
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			return instance = new Singleton();
		}else {
			System.out.println("already created");
			return instance;
		}
	}
	
	public void run() {
		System.out.println("don't know what to do!");
	}
}
