import java.rmi.*;

public interface StateMachineRemote extends Remote {
	public State getState() throws RemoteException;
	public boolean isHot() throws RemoteException;
	public boolean isBig() throws RemoteException;
	public boolean hasTraffic() throws RemoteException;
}
