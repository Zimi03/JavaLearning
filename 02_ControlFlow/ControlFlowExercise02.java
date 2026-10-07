public class ControlFlowExercise02 {
    public static void main(String[] args){
        int score = 50;
        char grade = 'N';
        if(score < 60){
            grade = 'F';
        }else if (score < 70){
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';            
        } else if (score < 90) {
            grade = 'B';
        } else if (score <= 100) {
            grade = 'A';
        }
        System.out.println("Score: " + score + "Grade: " + grade);

        score = 60;
        if(score < 60){
            grade = 'F';
        }else if (score < 70){
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else if (score <= 100) {
            grade = 'A';
        }
        System.out.println("Score: " + score + "Grade: " + grade);
        score = 75;
        if(score < 60){
            grade = 'F';
        }else if (score < 70){
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else if (score <= 100) {
            grade = 'A';
        }
        System.out.println("Score: " + score + "Grade: " + grade);
        score = 85;
        if(score < 60){
            grade = 'F';
        }else if (score < 70){
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else if (score <= 100) {
            grade = 'A';
        }
        System.out.println("Score: " + score + "Grade: " + grade);
        score = 95;
        if(score < 60){
            grade = 'F';
        }else if (score < 70){
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else if (score <= 100) {
            grade = 'A';
        }
        System.out.println("Score: " + score + "Grade: " + grade);
    }
}