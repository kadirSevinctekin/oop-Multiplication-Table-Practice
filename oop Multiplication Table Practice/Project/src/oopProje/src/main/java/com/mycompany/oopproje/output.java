
package com.mycompany.oopproje;

public class output {
    private String name;
    private String question;
    private int answer;
    private int userAnswer;
    private String result;
    private double time;
    
    public output(String name, String question, int answer, int userAnswer, String result, double time){
        this.name=name;
        this.question=question;
        this.answer=answer;
        this.userAnswer=userAnswer;
        this.result=result;
        this.time=time;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the answer
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    /**
     * @return the userAnswer
     */
    public int getUserAnswer() {
        return userAnswer;
    }

    /**
     * @param userAnswer the userAnswer to set
     */
    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(double time) {
        this.time = time;
    }
    
    
    
}
