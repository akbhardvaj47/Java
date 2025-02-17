
public class percentageCalculator {

    public static void main(String[] args) {
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100;
        System.out.println(percentage);
        //Boolean Operator returns True or false
        System.out.println("Boolean Operator.....");
        System.out.println(maxScore==userScore);

        //Comparison Operator 
        System.out.println("Comparison Operator.....");
        System.out.println(maxScore<=userScore);
        System.out.println(maxScore>=userScore);

        //Increment operator
        System.out.println("Increment Operator.....");
        // 1. Pre increment operator
        System.out.println("Pre increment Max Score "+(++maxScore));

        // 2. Post increment operator
        System.out.println("Max Score Post Increment "+(maxScore++));

        //Logical Operator or || and && ||Not !
        System.out.println("Logical Operator.....");
        if(maxScore >= 500 || userScore >500){
            System.out.println(true);
        }
        if(maxScore >= 500 && userScore >600){
            System.out.println("User Score is"+userScore);
            System.out.println(true);
        }

    }
}
