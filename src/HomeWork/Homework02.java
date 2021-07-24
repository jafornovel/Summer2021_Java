package HomeWork;

public class Homework02 {


    public static void main(String[] args) {

        /**
         *
         * Due: July 8
         *
         * Convert deg-Cel into Fahrenheit
         *
         * fT = cT × 9/5 + 32
         */
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




        // Celsius to Kelvin
        double cTemp = 21.11;
        double fTemp = cTemp * 9/5 + 32; // C -> F
        double kTemp = cTemp + 273.15;   // C -> K
        double fCelsius = (fTemp -32) * (5/9);// F -> C


        System.out.println(cTemp + "°C = " + fTemp + "°F");




    }



}
