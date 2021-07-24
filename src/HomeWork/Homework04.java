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

        String  threeWordSentence_1a = threeWordSentence_1.toLowerCase();
        System.out.println(threeWordSentence_1a);

        String [] words = threeWordSentence_1a.split(" ");

        // words [0] = "happy"
        // words [1] = "new"
        // words [2] = "year"

        words [0].replace('h', 'H');
        words [1].replace('n', 'N');
        words [2].replace('y', 'Y');







        System.out.println(words [0]);












        // Question - 2:

        /**
         * create the abbreviation  // HNY
         */

       // String threeWordSentence_2 = "very gOOD MorNING";
      //  String abbr = "";

        // code

      //  System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING' is : VGM


        String threeWordSentence_2 = "very gOOD MorNING";
        String threeWordSentence_2a = threeWordSentence_2.toUpperCase();
        String [] words3 = threeWordSentence_2a.split(" ");

        char word001 = words3 [0].charAt(0);




        System.out.println(word001);


        // Question - 3:

        /**
         * print the number of words in the sentence.
         */

        String sentence_3 = "We all are here to learn programming and testing";

        String [] sentenceSplit = sentence_3.split( " ");

        System.out.println(sentenceSplit.length);









    }






}




