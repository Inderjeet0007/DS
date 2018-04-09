package SessionBean;

import java.rmi.*;
import java.rmi.server.*;
public class RmiImpl extends UnicastRemoteObject implements RmiExample
{
public RmiImpl() throws RemoteException{}
public String Book(String name,int nor) throws RemoteException
{
if(nor>=5)
{
 return "UnSuccessfull";
 }
 else
 {
  return "Successfull";
  }
}
}