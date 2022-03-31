import java.rmi.*;

public interface Interface extends Remote{
    public String greeting(String name) throws RemoteException;    
}
