package commandPattern;

public class LightOnCommand implements Command{
	private Light l= null;
	
	public LightOnCommand(Light l) {
		// TODO Auto-generated constructor stub
		this.l= l;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		l.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		l.off();
	}
}
