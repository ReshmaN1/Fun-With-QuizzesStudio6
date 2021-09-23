package main;

import java.util.ArrayList;
import java.util.Scanner;

// Requirments;
//Add Questions to quiz
//Run the Quiz
// Grade the Quiz
public class Quiz {

    // class variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    // constructor
    public Quiz)(){

    }

    // Methods
    public void addQuestion(Question question){
     this.questions.add(question);

    }

    public void runQuiz(){
       //loop through each question
        for (Question question :questions ){
        //Ask the user the question
         System.out.println(question.getquestion());
        //Get the users answer
            String userAnswer = this.getUserAnswer();
        //check the answer
         boolean usergetquestionCorrect = question.checkAnswer(userAnswer);
         // increment numberofQuestionsCorrect if answered correctly
            if (usergetquestionCorrect){
                this.numberOfQuestionCorrect++;
            }
    }
        //Grade the quiz
        double percentageCorrect =(  (double) this.numberOfQuestionCorrectn/ (double) this.questions.size()) *  100;
        system.out.printIn("User Grade:" + percentageCorrect + "%");
}
    private String getUserAnswer(){
    String userAnswer = scanner.nextLine();
    return userAnswer;
    }
}