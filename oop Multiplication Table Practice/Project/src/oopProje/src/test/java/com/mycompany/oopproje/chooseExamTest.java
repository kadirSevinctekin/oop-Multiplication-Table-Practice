
package com.mycompany.oopproje;

import java.util.LinkedList;
import javax.swing.JButton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class chooseExamTest {
    LinkedList<Exam> linkedList=new LinkedList<>();
    private Exam exam;
    private User user;
    private chooseExam chooseE;
    
    @Before
    public void setUp(){
        user=new User("Deneme", "0000", "child");
        exam=new Exam("3", "6", "9");
        linkedList.add(exam);
        chooseE=new chooseExam(linkedList, user);
        chooseE.setJext("1");
    }
    
    @Test
    public void testChooseExam(){
        JButton button=chooseE.getButton();
        button.doClick();
        chooseE.setGameSfalse();
        Assert.assertEquals(true, chooseE.isFlag());
    }
    
}
