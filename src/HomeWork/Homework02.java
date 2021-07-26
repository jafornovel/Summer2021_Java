package HomeWork; //Completed

public class Homework02 {


    public static void main(String[] args) {
        /**
         * Refer -> https://www.rapidtables.com/convert/temperature/how-celsius-to-fahrenheit.html
         *
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */





        double cTemp = 21.11;
        double cToF = cTemp * 9/5 + 32;
        double cToK = cTemp + 273.15;
        System.out.println("\n\nThe temperature in Fahrenheit is : "+ cToF);
        System.out.println("The temperature in Kelvin from Celsius is : " + cToK);


        double fTemp = 34.6;
        double fToC = (fTemp -32) * (5/9);
        double fToK =(fTemp + 459.67 ) * (5/9);
        System.out.println("\n\nThe temperature in Celsius from Fahrenheit is : " + fToC);
        System.out.println("The temperature in Kelvin from Fahrenheit is : " + fToK);


        double kTemp = 300.00;
        double kToC = kTemp - 273.15;
        double kToF =(kTemp * (5/9)) -459.67;
        System.out.println("\n\nThe temperature in Celsius from Kelvin is : " + kToC);
        System.out.println("The temperature in Fahrenheit from Kelvin is : " + kToF);





    }



}
