
package com.mycompany.oopproje;

import javax.swing.JButton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AdminFrameTest {
    private AdminFrame adminFrame;
    
    @Before
    public void setUp(){
        adminFrame=new AdminFrame();
        
    }
    
    @Test
    public void testLogin(){
        JButton button=adminFrame.getButton();
        button.doClick();
        adminFrame.sethgFasle();
        Assert.assertEquals(true, adminFrame.isTestFlag());
    }
    
    
}
