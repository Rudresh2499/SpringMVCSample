/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceclasses;

import modelclasses.*;
/**
 *
 * @author RUDRESH PATEL
 */
public class LoginService {
    public boolean loginCheck(LoginDetails userDetails)
    {
        if(userDetails.getUsername().equals("rudresh")&&userDetails.getPassword().equals("1234"))
        {
            return true;
        }
        return false;
    }
}
