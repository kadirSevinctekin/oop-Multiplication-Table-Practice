
package com.mycompany.oopproje;


public class Exam {
    private String numOfQuestions;
    private String a;
    private String b;
    
    public Exam(String numOfQuestions, String a, String b){
        this.numOfQuestions=numOfQuestions;
        this.a=a;
        this.b=b;
    }

    /**
     * @return the numOfQuestions
     */
    public String getNumOfQuestions() {
        return numOfQuestions;
    }

    /**
     * @param numOfQuestions the numOfQuestions to set
     */
    public void setNumOfQuestions(String numOfQuestions) {
        this.numOfQuestions = numOfQuestions;
    }

    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(String b) {
        this.b = b;
    }

    
    
    
}
