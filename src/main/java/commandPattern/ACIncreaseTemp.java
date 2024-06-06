package commandPattern;

public class ACIncreaseTemp implements Command{
	private AC ac;
	public ACIncreaseTemp(AC ac) {
		// TODO Auto-generated constructor stub
		this.ac= ac;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.increaseTemp();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.decreaseTemp();
	}

}
