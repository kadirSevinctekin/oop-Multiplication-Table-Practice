
package com.mycompany.oopproje;

import javax.swing.JButton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author spide
 */
public class takeInputsTest {
    
    private takeInputs exam;
    
    @Before
    public void setUp(){
        exam=new takeInputs();
        exam.setJText2("3");
        exam.setJText3("6");
        exam.setJText4("9");
    }
    
    @Test
    public void testExamAdding(){
        JButton button=exam.getButton();
        button.doClick();
        Assert.assertEquals(true, exam.isFlag());
    }

   
    
}
