public class ControlFlowExercise01 {
    public static void main(String[] args){
        int number=1;
        if (number > 0){
            System.out.println("Positive");
        }else if (number < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
        number = 0;
        if (number > 0){
            System.out.println("Positive");
        }else if (number < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
        number = -1;
        if (number > 0){
            System.out.println("Positive");
        }else if (number < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

    }
}