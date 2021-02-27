import java.rmi.*;

public class StateMonitor {
	StateMachineRemote machine;
	public StateMonitor(StateMachineRemote machine) {
		this.machine = machine;
	}
 
	public void report() {
		try {
			System.out.println("State is hot: " + machine.isHot());
			System.out.println("State is big: " + machine.isBig());
			System.out.println("State has traffic: " + machine.hasTraffic());
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
