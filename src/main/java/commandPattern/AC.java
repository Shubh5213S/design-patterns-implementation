package commandPattern;

public class AC {
	private int temp;
	
	public void on(){
		System.out.println("AC is turned ON!!");
	}
	public void off(){
		System.out.println("AC is turned OFF!!");
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
		System.out.println("Temperature " + temp+ " is set!!");
	}
	public void increaseTemp() {
		temp+=1;
		System.out.println("Temperature is increased!!");
	}
	public void decreaseTemp() {
		temp-=1;
		System.out.println("Temperature is decreased!!");
	}
}
