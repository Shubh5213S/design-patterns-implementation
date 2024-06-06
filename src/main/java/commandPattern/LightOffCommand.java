package commandPattern;

public class LightOffCommand implements Command{
	private Light l= null;
	
	public LightOffCommand(Light l) {
		// TODO Auto-generated constructor stub
		this.l = l;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		l.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		l.on();
	}

}
