import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String args[]) {
        try{
            Interface stub = new IntRemote();
            Naming.rebind("rmi://localhost:3000/test", stub);
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
}
