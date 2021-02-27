import java.rmi.*;


public class StateMachineTestDrive {
	
	public static void main(String[] args) throws RemoteException {
		StateMachineRemote stateMachine = null;

		try {

			stateMachine = 
				new StateMachine(Boolean.parseBoolean(args[1]), Boolean.parseBoolean(args[2]), Boolean.parseBoolean(args[3]));
			Naming.rebind("//" + args[0] + "/statemachine", stateMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
