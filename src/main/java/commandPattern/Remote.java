package commandPattern;

import java.util.Stack;

public class Remote {
	private Stack<Command> stack = new Stack<Command>();
	private Command[] onCommands;
	private Command[] offCommands;
	
	public Remote() {
		// TODO Auto-generated constructor stub
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		
		for(int i=0;i<7;i++) {
			onCommands[i]= noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot]= offCommand;
	}
	
	public void remoteOnButtonPush(int slot) {
		onCommands[slot].execute();
		stack.push(onCommands[slot]);
	}
	
	public void remoteOffButtonPush(int slot) {
		offCommands[slot].execute();
		stack.push(offCommands[slot]);
	}
	
	public void undoButtonPush() {
		if(stack.empty()) {
			System.err.println("Empty Stack!!");
		}else {
			Command recent = stack.pop();
			recent.undo();
		}
	}
	
}
