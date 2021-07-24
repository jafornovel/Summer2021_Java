package HomeWork;

public class Homework05 {
    public static void main(String[] args) {


        // Due: July 21

        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */
        // calculate percentage --> 80*100/150
        // print result like:
        // Your percentage: XX.yy and your Grade is: Z


        int studentScore = 150;
        int maxScore = 150;
        int gradePercentage = (studentScore * 100) / maxScore;

        if (gradePercentage >= 91 && gradePercentage <= 100) {
            System.out.println("The Student grade is A with a percentage of " + gradePercentage + " marks");


        } else if (gradePercentage >= 81 && gradePercentage <= 90.99) {
            System.out.println("The Student grade is B with a percentage of " + gradePercentage + " marks");


        } else if (gradePercentage >= 71 && gradePercentage <= 80.99) {
            System.out.println("The Student grade is C with a percentage of " + gradePercentage + " marks");


        } else if (gradePercentage >= 61 && gradePercentage <= 70.99) {
            System.out.println("The Student grade is D with a percentage of " + gradePercentage + " marks");


        } else if (gradePercentage >= 51 && gradePercentage <= 60.99) {
            System.out.println("The Student grade is E with a percentage of " + gradePercentage + " marks");

        } else if (gradePercentage >= 50.99) {
            System.out.println("The Student grade is F with a percentage of " + gradePercentage + " marks");

        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */


        int number = 3;

        if (number % 3 == 0) {
            System.out.println("divisible by 3");

        } else if (number % 5 == 0) {
            System.out.println("divisible by 5");

        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("divisible by both 3 and 5");

        } else  {
            System.out.println(number + " is not divisible by 5 or 3");


        }


    }

}




