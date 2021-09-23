package main;

public class TrueFalseQuestion extends Question {

    // class variables

    // constructors
    public TrueFalseQuestion(String question, String answer){
        super(question, answer);
    }

    //Method
    @Override
    public boolean checkAnswer)(String answer){
        // answer = "True" "False"
        //answer = "True" "False"
         if(answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())){
             return true;
         }else{
             return false;
         }
}



}
