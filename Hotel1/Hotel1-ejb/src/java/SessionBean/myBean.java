/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SessionBean;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ADMIN
 */
@Stateless
@LocalBean
public class myBean {

    public String Login(String name, String pass) {
      if(name.equals("hema") && pass.equals("hema1234"))
       {
        return "login successful";
        
       }
       else
       {
         return "login unsuccessful";
    }
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 
}
