package commandPattern;

public class Stereo {
	private String CD;
	private int volume;
	
	public void on() {
		System.out.println("Stereo is turned ON!!");
	}
	public void off() {
		System.out.println("Stereo is turned OFF!!");
	}
	
	public void setCD(String cd) {
		this.CD=cd;
	}
	
	public String getCD() {
		return CD;
	}
	
	public void setVoulme(int v) {
		this.volume=v;
	}
	
	public int getVolume() {
		return volume;
	}
	public void increaseVolume() {
		volume+=1;
		System.out.println("Volume is increased!!");
	}
}
