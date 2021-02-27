import java.io.*;

public interface State extends Serializable{

	public void increasetemperature();
	public void increaselandsize();
	public void inserttraffic();
	public void decreasetemperature();
	public void decreaselandsize();
	public void decreasetraffic();
}
