package commandPattern;

public class CeilingFan {
	private int speed;
	
	public void on(){
		System.out.println("Ceiling Fan is ON!!");
	}
	
	public void off(){
		System.out.println("Ceiling Fan is OFF!!");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void increaseSpeed() {
		speed+=1;
		System.out.println("Fan speed is Increased!!");
	}
	
	public void decreaseSpeed() {
		speed-=1;
		System.out.println("Fan speed is Decreased!!");
	}
	
}
