package SessionBean;


import java.rmi.*;
public interface RmiExample extends Remote
{
public String Book(String name,int nor) throws RemoteException;
}