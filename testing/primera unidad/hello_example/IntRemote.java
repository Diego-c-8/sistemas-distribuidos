import java.rmi.*;
import java.rmi.server.*;

public class IntRemote extends UnicastRemoteObject implements Interface {
    IntRemote() throws RemoteException{
        super();
    }
    public String greeting(String name){
        System.out.println(name+" has entered");
        return "Welcome "+name;
    }
}
