
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Palindrom Sayıyı Bulma
        System.out.println("result 1: " + isPalindrome(-1221));
        System.out.println("result 2: " + isPalindrome(707));
        System.out.println("result 3: " + isPalindrome(11212));
         */
        /* Mükemmel sayıları  bulma
        System.out.println("result 1: " + isPerfectNumber(6));
        System.out.println("result 2: " + isPerfectNumber(28));
        System.out.println("result 3: " + isPerfectNumber(5));
        System.out.println("result 4: " + isPerfectNumber(-1));
         */

        /* Sayıları Kelimelere Dök
        System.out.println("result 1: " + numberToWords(123));
        System.out.println("result 2: " + numberToWords(1010));
        System.out.println("result 3: " + numberToWords(-12));
         */

    }

    public static boolean isPalindrome( int number ){
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();

        String reversed = "";
        for(int i = digits.length -1; i>=0; i--){
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(number));
    }

    public static boolean isPerfectNumber(int number){

        if(number <= 0){
            return false;
        }

        int total =0;
        for(int i = 1; i<=number/2; i++){
            if(number % i == 0)
                total += i;

        }
        return number == total;
    }

    public static String numberToWords( int number ){
        if(number < 0){
            return "Invalid Value";
        }
        char[] digits = String.valueOf(number).toCharArray();
        String numberToText = "";

        for(char digit: digits){
            switch (digit) {
                case '0':
                    numberToText += "zero ";
                    break;

                case '1':
                    numberToText += "one ";
                    break;

                case '2':
                    numberToText += "two ";
                    break;

                case '3':
                    numberToText += "three ";
                    break;

                case '4':
                    numberToText += "four ";
                    break;

                case '5':
                    numberToText += "five ";
                    break;

                case '6':
                    numberToText += "six ";
                    break;

                case '7':
                    numberToText += "seven ";
                    break;

                case '8':
                    numberToText += "eight ";
                    break;

                case '9':
                    numberToText += "nine ";
                    break;
            }
        }
        return numberToText.trim();
    }

}