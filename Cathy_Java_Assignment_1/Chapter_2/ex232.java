/*
2.32 (Negative, Positive and Zero Values) Write a program that inputs
five numbers and determines and prints the number of negative numbers
input, the number of positive numbers input and the number of zeros input
 */

import java.util.Scanner;

public class ex232 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first number");
        int firstNumber = input.nextInt();
        System.out.println("input second number");
        int secondNumber = input.nextInt();
        System.out.println("input third number");
        int thirdNumber = input.nextInt();
        System.out.println("input fourth number");
        int fourthNumber = input.nextInt();
        System.out.println("input fifth number");
        int fifthNumber = input.nextInt();
        
        int negativeCounter = 0;
        int positiveCounter = 0;
        int zeroCounter = 0;

        if(firstNumber < 0) negativeCounter += 1;
        if(secondNumber < 0) negativeCounter += 1;
        if(thirdNumber < 0) negativeCounter += 1;
        if(fourthNumber < 0) negativeCounter += 1;
        if(fifthNumber < 0) negativeCounter += 1;

        if(firstNumber == 0) zeroCounter += 1;
        if(secondNumber == 0) zeroCounter += 1;
        if(thirdNumber == 0) zeroCounter += 1;
        if(fourthNumber == 0) zeroCounter += 1;
        if(fifthNumber == 0) zeroCounter += 1;

        if(firstNumber > 0) zeroCounter += 1;
        if(secondNumber > 0) zeroCounter += 1;
        if(thirdNumber > 0) zeroCounter += 1;
        if(fourthNumber > 0) zeroCounter += 1;
        if(fifthNumber > 0) zeroCounter += 1;

        System.out.println("The number of negative numbers input are " + negativeCounter);
        System.out.println("The number of zeros input are " + zeroCounter);
        System.out.println("The number of positive numbers input are " + positiveCounter);

        input.close();
    }
}