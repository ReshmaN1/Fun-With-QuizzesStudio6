package main;

import javax.swing.*;

public class OuizRunner {
    public static <MultipleChoiceQuestion> void main(String[] args){
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion mymultiplechoicequestion = new MultipleChoiceQuestion("what sound does a dog make?\nA:Bark\nB:Quack\nplease just type a single letter as an answer","A");
                myQuiz.addQuestion(mymultiplechoicequestion);

        CheckBoxQuestion mycheckBoxQuestion = new CheckBoxQuestion("select all that apply, which animals can fly\nA:penguins ,\nB: Dove");
        myQuiz.addQuestion(mycheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion(  "Dogs are omnivores? \n True or False?" , "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }

}
