import java.rmi.*;

public class StateMonitorTestDrive {
	public static void main(String[] args) {

		String location;
		location = "rmi://" + args[0] + "/statemachine";
		
		StateMachineRemote machine;
		StateMonitor monitor = null;
		try {
			machine = (StateMachineRemote) Naming.lookup(location);
			monitor = new StateMonitor(machine);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		monitor.report();
		
	}
}
