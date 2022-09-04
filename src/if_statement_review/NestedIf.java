package if_statement_review;

public class NestedIf {
    public static void main(String[] args){

        int score = 25;

        if(score >= 0 && score <= 100) { // pre-condition: if the score is valid


            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else { // if the score is NOT valid
            System.out.println("Not a valid score");
        }

    }
}
