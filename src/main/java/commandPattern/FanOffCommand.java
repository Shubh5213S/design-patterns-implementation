package commandPattern;

public class FanOffCommand implements Command{
	private CeilingFan f= null;
	
	public FanOffCommand(CeilingFan f) {
		// TODO Auto-generated constructor stub
		this.f= f;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		f.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		f.on();
	}
}
