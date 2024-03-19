package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        char[] charArrayNumber = String.valueOf(number).toCharArray();
        int half = charArrayNumber.length % 2 == 0 ? charArrayNumber.length / 2 : (charArrayNumber.length -1)/2;
        int j = charArrayNumber.length - 1;
        for(int i = 0; i < half; i++){
            if(charArrayNumber[i] != charArrayNumber[j]) return false;
            j--;
        }
        return true;
    }
    public static boolean isPerfectNumber(int number){
        if(number < 0) return false;
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0) sum += i;
        }
        return sum == number;
    }
    public static String numberToWords(int number){
        if(number < 0) return "Invalid Value";
        String[] numbersAsWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String returningStr = "";
        char[] numberArray = String.valueOf(number).toCharArray();
        for(char num: numberArray){
            returningStr += numbersAsWords[Integer.parseInt(String.valueOf(num))];
            returningStr += " ";
        }
        return returningStr.trim();
    }
}
