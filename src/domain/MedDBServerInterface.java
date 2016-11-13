package domain;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MedDBServerInterface extends Remote
{
	public void sendMessageToServer	(String message) throws RemoteException;
	
}
