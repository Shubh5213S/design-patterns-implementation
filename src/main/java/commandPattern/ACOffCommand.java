package commandPattern;

public class ACOffCommand implements Command{
	private AC ac;
	
	public ACOffCommand(AC ac) {
		// TODO Auto-generated constructor stub
		this.ac = ac;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.on();
	}
	
}