/*
2.24 (Largest and Smallest Integers) Write an application that reads five
integers and determines and prints the largest and smallest integers in 
the group. Use only the programming techniques you learned in this chapter.
 */

import java.util.Scanner;

public class ex224 {
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
        int largest;
        int smallest;

        largest = firstNumber;
        if(secondNumber > firstNumber) largest = secondNumber;
        if(thirdNumber > largest) largest = thirdNumber;
        if(fourthNumber > largest) largest = fourthNumber;
        if(fifthNumber > largest) largest = fifthNumber;

        smallest = firstNumber;
        if(secondNumber < firstNumber) smallest = secondNumber;
        if(thirdNumber < smallest) smallest = thirdNumber;
        if(fourthNumber < smallest) smallest = fourthNumber;
        if(fifthNumber < smallest) smallest = fifthNumber;

        System.out.println("largest number is " + largest);
        System.out.println("smallest number is " + smallest);

        input.close();
    }
}