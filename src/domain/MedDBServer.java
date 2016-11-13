package domain;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class MedDBServer 
{
	public MedDBServer() throws RemoteException 
	{}
	
	public static void main(String args[]) throws RemoteException
	{
		try {
			  int registryPort = 65000;
			
			MedDBImpl medDBimpl = new MedDBImpl();
			
			Registry reg = LocateRegistry.createRegistry(registryPort);
			reg.rebind("MedDBServer", medDBimpl);    
			
			System.out.println("RMI Registry running on port: " + registryPort); 
			System.out.println("MedDBServer is running");
			
		} catch (Exception e) {
			System.out.println("[System] Server failed: " + e);
		}
      
	}
}
