import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name =  scan.nextLine();
            Interface stub = (Interface)Naming.lookup("rmi://localhost:3000/test");  
            System.out.println(stub.greeting(name));  
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
