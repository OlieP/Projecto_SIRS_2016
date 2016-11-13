package domain;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import domain.MedDBServerInterface;
import services.HelloService;

public class MedDBImpl extends UnicastRemoteObject implements MedDBServerInterface
{
	private static final long serialVersionUID = 6454771867485905364L;

	protected MedDBImpl() throws RemoteException 
	{
		super();
	}

	@Override
	public void sendMessageToServer(String message) 
	{
		HelloService hello = new HelloService();
		hello.execute(message);	
	}

}
