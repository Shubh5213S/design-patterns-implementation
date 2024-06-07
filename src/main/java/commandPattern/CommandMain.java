package commandPattern;

public class CommandMain {

	public static void main(String[] args) throws InterruptedException {
		
		// Remote
		Remote remote = new Remote();
		
		
		// Appliances
		Light hallLight = new Light("Hall Room");
		Light kitchenLight = new Light("Kitchen Room");
		CeilingFan fanUsha = new CeilingFan();
		AC blueStar= new AC();
		TV xiaomi = new TV();
		
		// Lights Commands
		LightOnCommand hallLightOn = new LightOnCommand(hallLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand hallLightOff = new LightOffCommand(hallLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		
		// Fans Commands
		FanOnCommand fanOn = new FanOnCommand(fanUsha);
		FanOffCommand fanOff = new FanOffCommand(fanUsha);
		
		// AC commands
		ACOnCommand acOn= new ACOnCommand(blueStar);
		ACOffCommand acOff= new ACOffCommand(blueStar);
		
		// AC Temp Commands
		ACIncreaseTemp acIncreaseTemp = new ACIncreaseTemp(blueStar);
		ACDecreaseTemp acDecreaseTemp = new ACDecreaseTemp(blueStar);
		
		
		//TV commands
		TVOnCommand tvOn = new TVOnCommand(xiaomi);
		TVOffCommand tvOff = new TVOffCommand(xiaomi);
		
		// TV Voulme Commands
		TVIncreaseVolume tvIncreaseVolume = new TVIncreaseVolume(xiaomi);
		TVDecreaseVolume tvDecreaseVolume = new TVDecreaseVolume(xiaomi);
		
		//Assign the commands the Remote Buttons
		
		remote.setCommand(0, hallLightOn, hallLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, fanOn, fanOff);
		remote.setCommand(3, acOn, acOff);
		remote.setCommand(4, acIncreaseTemp, acDecreaseTemp);
		remote.setCommand(5, tvOn, tvOff);
		remote.setCommand(5, tvIncreaseVolume, tvDecreaseVolume);
		
		
		for(int i=0;i<7;i++) {
			remote.remoteOnButtonPush(i);
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<7;i++) {
			remote.remoteOffButtonPush(i);
			Thread.sleep(1000);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<20;i++) {
			remote.undoButtonPush();
			Thread.sleep(1000);
		}
		
	}

}
