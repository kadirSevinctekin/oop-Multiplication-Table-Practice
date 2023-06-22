
package com.mycompany.oopproje;

import javax.swing.JButton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class loginTest {
    private login login;
    
    @Before
    public void setUp(){
        login=new login();
        login.setJtex_kad("Admin");
        login.setJpass("112233");
    }
    
    @Test
    public void testLogin(){
        JButton button=login.getButton();
        button.doClick();
        login.setAfFalse();
        Assert.assertEquals(true, login.isTestFlag());
    }
    
}
