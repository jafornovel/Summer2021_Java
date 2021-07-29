package HomeWork;

public class Homework04 {

    public static void main(String[] args) {
        // Due: July 18

        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */

      //  System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"
        // code
      //  System.out.println("After code : " + threeWordSentence_1);      // "Happy New Year"

        // Answer - 01

        String threeWordSentence_1 = "hApPy nEW yeAr";

        String [] words = threeWordSentence_1.split(" ");

        String firstWord = words[0].substring(0,1).toUpperCase() + words[0].substring(1).toLowerCase();
        String secondWord = words[1].substring(0,1).toUpperCase() + words [1].substring(1).toLowerCase();
        String thirdWord = words[2].substring(0,1).toUpperCase() + words [2].substring(1).toLowerCase();

        System.out.println( firstWord + " " + secondWord + " " + thirdWord );

        // Question - 2:

        /**
         * create the abbreviation  // HNY
         */


        String firstWord1 = words[0].substring(0,1).toUpperCase();
        String secondWord1 = words[1].substring(0,1).toUpperCase();
        String thirdWord1 = words[2].substring(0,1).toUpperCase();

        System.out.println( firstWord1 + secondWord1 + thirdWord1 );


        // String threeWordSentence_2 = "very gOOD MorNING";
      //  String abbr = "";

        // code

      //  System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING' is : VGM


        String threeWordSentence_2 = "very gOOD MorNING";
        String threeWordSentence_2a = threeWordSentence_2.toUpperCase();
        String [] words3 = threeWordSentence_2a.split(" ");
        String firstWord2 = words3 [0].substring(0,1).toUpperCase();
        String secondWord2 = words3 [1].substring(0,1).toUpperCase();
        String thirdWord2 = words3 [2].substring(0,1).toUpperCase();



        System.out.println(firstWord2 + secondWord2 + thirdWord2);


        // Question - 3:

        /**
         * print the number of words in the sentence.
         */

        String sentence_3 = "We all are here to learn programming and testing";

        String [] sentenceSplit = sentence_3.split( " ");

        System.out.println(sentenceSplit.length);









    }






}




