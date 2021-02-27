
public class FloridaState implements State {
	transient StateMachine stateMachine;
	
	public FloridaState(StateMachine stateMachine) {
		// TODO Auto-generated constructor stub
		this.stateMachine = stateMachine;
	}

	@Override
	public void increasetemperature() {
		// TODO Auto-generated method stub
		System.out.println("You want florida hotter?!?!?!");
		
	}

	@Override
	public void increaselandsize() {
		// TODO Auto-generated method stub
		System.out.println("You increased the land size of Florida");
		stateMachine.setisBig(true);
		stateMachine.reevaluateState();
	}

	@Override
	public void inserttraffic() {
		// TODO Auto-generated method stub
		System.out.println("You want Miami with more traffic?!?!?!");
	}

	@Override
	public void decreasetemperature() {
		// TODO Auto-generated method stub
		System.out.println("You turned down the temp");
		stateMachine.setisHot(false);
		stateMachine.reevaluateState();
	}

	@Override
	public void decreaselandsize() {
		// TODO Auto-generated method stub
		System.out.println("You made Florida smaller...");
	}

	@Override
	public void decreasetraffic() {
		// TODO Auto-generated method stub
		System.out.println("You got rid of some traffic");
		stateMachine.sethasTraffic(false);
		stateMachine.reevaluateState();
	}
	public String toString() {
		return "Guess we are in Florida Now...";
	}
}
