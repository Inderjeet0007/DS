package SessionBean;

import java.rmi.*;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
public class Server
{
public static void main(String[]arg) throws RemoteException
{
    Registry r=LocateRegistry.createRegistry(1099);
RmiImpl Obj=new RmiImpl() {


            public String Book(String name, String nor) throws RemoteException {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
try
{

r.rebind("Book",Obj);
}
catch(Exception e){}
System.out.println("Server Started...");
}
}
