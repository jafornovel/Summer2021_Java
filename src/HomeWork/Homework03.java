package HomeWork; //COMPLETED

public class Homework03 {

    public static void main(String[] args) {


        // QUESTION 01
        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * use: Ternary operator
         *
         */

        String sentence_1 = "hello dear, how are you?";
        int sentenceLength = sentence_1.length();
        System.out.println( "\n length of the sentence_1 is " + sentenceLength );
        int result_1 = sentenceLength >= 10 ? 100 : 15;
        System.out.println("\n\n The result of result_1 is " + result_1);


        //QUESTION 02
        /**
         * replace all 'R/r' with 'F'
         */

        String sentence_2  = "We all ARe GOod ProgrAMmer";
        String sentence_2a = sentence_2.toLowerCase();
        String replaceCharacter = sentence_2a.replace("r"  ,"F");
        System.out.println("\n New sentence after replacing R/r with F is =  " + replaceCharacter);


        //QUESTION 03

        String sentence_3 = "ABC Networks";
        String result_3 = "";
        /**
         * 1. Display/Print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *      else assign "Entertainment"
         *      Print the result_3 in console.
         */

        System.out.println("\n The length of sentence_3 is : " + sentence_3.length());

        String sentence_3a = sentence_3.toLowerCase();
        boolean sentenceStartsWith = sentence_3a.startsWith("a");
        System.out.println("\n Does sentence_3 starts with a : " + sentenceStartsWith);

        String sentence_3b = sentence_3.toUpperCase();
        boolean sentenceEndsWith = sentence_3b.endsWith("K");
        System.out.println("\n does sentence_3 ends with K : " + sentenceEndsWith );

        result_3 = sentence_3.toLowerCase().startsWith("a") ? " Media " : "Entertainment" ;

        System.out.println("\n The sentence starts with a (OUTPUT) : " + result_3);

















    }
}
