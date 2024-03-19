package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int originalNumber = number;
        int reverse = 0;

        while (number > 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return originalNumber == reverse;
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 0) {
            return false;
        }

        int total = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                total += i;
            }
        }

        return num == total;
    }


    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";

        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder numberToText = new StringBuilder();

        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numberToText.append("Zero");
                    break;
                case '1':
                    numberToText.append("One");
                    break;
                case '2':
                    numberToText.append("Two");
                    break;
                case '3':
                    numberToText.append("Three");
                    break;
                case '4':
                    numberToText.append("Four");
                    break;
                case '5':
                    numberToText.append("Five");
                    break;
                case '6':
                    numberToText.append("Six");
                    break;
                case '7':
                    numberToText.append("Seven");
                    break;
                case '8':
                    numberToText.append("Eight");
                    break;
                case '9':
                    numberToText.append("Nine");
                    break;
            }
        }
        return numberToText.toString();
    }



}
