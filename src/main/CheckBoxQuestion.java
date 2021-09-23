package main;

public abstract class CheckBoxQuestion extends Question {

    // class variables

    // constructors
    public CheckBoxQuestion(String question, String answer){
        super(question, answer);
    }

    //Method
    @Override
    public boolean checkAnswer(String answer){
        // answer = 'A' ,'B',c'
        //answer = 'a','b','c'
        String actualAnswer = this.getTheAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        }
        return false;
    }
}
