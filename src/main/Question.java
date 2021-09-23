package main;

public abstract class Question {

    // class variables
    private final String theQuestion;
    private final String theAnswer;

    //constructors
    public  Question(String Question , String answer){
        this.theQuestion = Question;
        this.theAnswer = answer;
    }

    //Methods
    //Getters

    public String getTheQuestion() { return this.theQuestion; }

    public String getTheAnswer() { return this.theAnswer; }


    //other Methods
    public abstract boolean checkAnswer(String answer);



}
