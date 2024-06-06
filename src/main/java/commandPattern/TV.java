package commandPattern;

public class TV {
	private int channel;
	private int volume;
	
	public void on() {
		System.out.println("TV is turned ON!!");
	}
	public void off() {
		System.out.println("TV is turned OFF!!");
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
	public void decreaseVolume() {
		volume-=1;
		System.out.println("Volume is decreased!!");
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("Channel " + channel+ " is set!!");
	}
}
