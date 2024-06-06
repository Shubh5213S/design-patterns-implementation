package commandPattern;

public class Light {
	private String lightName;
	
	Light(String name){
		this.lightName= name;
	}
	public void on() {
		System.out.println(lightName + " light is turned ON!");
	}
	
	public void off() {
		System.out.println(lightName + " light is turned OFF!");
	}
}
