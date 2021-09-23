package main;

import java.util.Locale;

public class MultipleChoiceQuestions  extends Question {

    //class variables

  //constructor
    public MultipleChoiceQuestions(String Question, String answer) {
        super(Question, answer);
    }

    //Methodes
    @Override
    public boolean checkAnswer(String answer) {
        // answer = 'A' or 'B'
        // answer = 'a' or 'b'

        String actualAnswer = this.getTheAnswer();
        // case insensitive
         if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
             return true;
         }else{
             return false;
         }

    }
}
