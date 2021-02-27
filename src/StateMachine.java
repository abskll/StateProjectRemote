import java.rmi.*;
import java.rmi.server.*;

public class StateMachine extends UnicastRemoteObject implements StateMachineRemote {
	State floridaState;
	State texasState;
	
	State state;
	boolean isHot;
	boolean isBig;
	boolean hasTraffic;
	
	public StateMachine(boolean isHot, boolean isBig, boolean hasTraffic) throws RemoteException {
		floridaState = new FloridaState(this);
		texasState = new TexasState(this);
		this.isHot = isHot;
		this.isBig = isBig;
		this.hasTraffic = hasTraffic;
		reevaluateState();
	}
	
	public void increasetemperature() {
		state.increasetemperature();
	}
 
	public void increaselandsize() {
		state.increaselandsize();
	}

	public void inserttraffic() {
		// TODO Auto-generated method stub
		state.inserttraffic();
	}

	public void decreasetemperature() {
		// TODO Auto-generated method stub
		state.decreasetemperature();
	}

	public void decreaselandsize() {
		// TODO Auto-generated method stub
		state.decreaselandsize();
	}

	public void decreasetraffic() {
		// TODO Auto-generated method stub
		state.decreasetraffic();
	}
	

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getFloridaState() {
        return floridaState;
    }

    public State getTexasState() {
        return texasState;
    }
    public void setisHot(boolean ishot) {
    	this.isHot = ishot;
    }
    public void setisBig(boolean isbig) {
    	this.isBig = isbig;
    }
    public void sethasTraffic(boolean hastraffic) {
    	this.hasTraffic = hastraffic;
    }
    public void reevaluateState() {
    	if(isHot && !isBig && hasTraffic) {
    		this.state = floridaState;
    		System.out.println("We must be in Florida now...");
    	} else if(!isHot && isBig && !hasTraffic) {
    		this.state = texasState;
    		System.out.println("We must be in Texas now...");
    	}
    }
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty United States of America, Inc.");
		result.append("\n");
		result.append(state + "\n");
		return result.toString();
	}

	@Override
	public boolean isHot() throws RemoteException {
		// TODO Auto-generated method stub
		return isHot;
	}

	@Override
	public boolean isBig() throws RemoteException {
		// TODO Auto-generated method stub
		return isBig;
	}

	@Override
	public boolean hasTraffic() throws RemoteException {
		// TODO Auto-generated method stub
		return hasTraffic;
	}
}
