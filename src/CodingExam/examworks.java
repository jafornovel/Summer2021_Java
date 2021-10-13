package CodingExam;

import javax.sound.midi.Soundbank;

public class examworks {



    public static void main(String[] args) {


        // QUESTION NUMBER 01

      /**
       *
       * Please find the string - "Showing rows 1 to 20 of 8987 (450 Pages)".
       * The assignment is to print 450 from above String as int in the console exactly as below --
       * Total Number of Pages: 450.
       * Hints: Store the String in a String variable, take off all the words/simbols both before and after 450.
       * Convert 450 into int variable and print it in the console exactly as below --
       *
       */

      String pages = "Showing rows 1 to 20 of 8987 (450 Pages)";
      String [] words = pages.split(" ");

      String pageNumber = words[7].replace("(", "");

        System.out.println("\nANSWER TO THE QUESTION NUMBER 01");
        System.out.println("Total Number of Pages : " + pageNumber);







      // QUESTION NUMBER 02

       /**
        *
        * Declare any String and check whether the string is a Palindrome or not.
        * If Palindrome, print "The given string is Palindrome" in the console.
        * If not Palindrome, print "The given string is not a Palindrome".
        *
        **/

       String original = "Jafor";
        System.out.println("\n\nANSWER TO THE QUESTION NUMBER 02");

       String reverse = "";
       for (int i = original.length() - 1; i >= 0; i--){
           reverse += original.charAt(i);
       }

       boolean palindrome = true;
       for( int i = 0; i < original.length();i++) {
           if(original.charAt(i) != reverse.charAt(i)) {
               palindrome = false;

           }
       }

       if (palindrome) {
           System.out.println( "The given string is Palindrome");

       }else {
           System.out.println( "The given string is not a Palindrome");
       }



       //QUESTION NUMBER 03

        /**
         * Please find the 2 sentences as below:
         *     a. My Name is Jafor.
         *     b. I am a QA Engineer.
         *
         * Please use Java methods and print the below requirements in the console:
         *     a. Add the both sentences and print in a single line.
         *     b. Convert all letters of the new line into lower case and print in the console.
         *     c. Convert all the letter of the new line into Upper case and print in the console.
         */

        String name01 = " My name is Jafor";
        String job01 = " I am a QA Engineer";

        String full = name01 + "." + job01 ;
        System.out.println("\n\nANSWER TO THE QUESTION NUMBER 03");
        System.out.println("Combined Sentences : " + full);
        System.out.println("To Lower case : " + full.toLowerCase());
        System.out.println("To Upper case : " + full.toUpperCase());


        //Question Number 04

        /**
         *
         * Please use java methods to print the below requirements in the console:
         *     a. Print all the odd numbers which belongs from 0 to 20.
         *     b. Print all the even numbers which belongs from 20 to 0.
         *
         */
        System.out.println("\n\nANSWER TO THE QUESTION NUMBER 04A");
        System.out.println("The odd numbers are :");
        for (int i=1; i <= 20 ; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("\nANSWER TO THE QUESTION NUMBER 04B");


        System.out.println( "The even numbers are :");
        for ( int i = 20 ; i >= 0;  i--){
            if (i % 2 == 0) {
                System.out.println( i + " ");
            }
        }






























    }



}
