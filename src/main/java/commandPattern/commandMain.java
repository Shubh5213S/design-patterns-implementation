package commandPattern;

import java.util.LinkedList;
import java.util.Queue;

public class commandMain {

	public static void main(String[] args) {
		Queue<Command> q= new LinkedList<>();	
		// TODO Auto-generated method stub
		Light hallLight = new Light("Hall Room");
		Light kitchenLight = new Light("Kitchen Room");
		CeilingFan fanUsha = new CeilingFan();
		AC blueStar= new AC();
		TV xiaomi = new TV();
		
		LightOnCommand hallLightOn = new LightOnCommand(hallLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		FanOnCommand fanOn = new FanOnCommand(fanUsha);
		ACOnCommand acOn= new ACOnCommand(blueStar);
		ACDecreaseTemp acDecreaseTemp = new ACDecreaseTemp(blueStar);
		TVOnCommand tvOn = new TVOnCommand(xiaomi);
		
		hallLightOn.execute(); q.add(hallLightOn);
		kitchenLightOn.execute();
		fanOn.execute();
		acOn.execute();
		tvOn.execute();
		acDecreaseTemp.execute();
		hallLightOn.undo();
		
	}

}
