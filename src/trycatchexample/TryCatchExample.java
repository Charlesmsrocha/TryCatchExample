/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchexample;

import Utilities.InputUtilities;

/**
 *
 * @author
 */
public class TryCatchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number1, number2;
        double ans;
        int option;

        InputUtilities input = new InputUtilities();
        Calculator myCalc = new Calculator();

        do {

            printMenu();

            option = input.getUserInt("Please coose a menu option", 1, 5);

            // only process menu option if it was not "exit" (5)
            if (option != 5) {

                number1 = input.getUserInt("Please enter a number", 0);
                number2 = input.getUserInt("Please enter another number", 0);

                switch (option) {

                    case 1:

                        ans = myCalc.add(number1, number2);
                        System.out.println("The answer is: " + ans);
                        break;

                    case 2:

                        ans = myCalc.subtract(number1, number2);
                        System.out.println("The answer is: " + ans);
                        break;

                    case 3:

                        ans = myCalc.mult(number1, number2);
                        System.out.println("The answer is: " + ans);
                        break;

                    default:
                        // must be option 4

                        try {
                            ans = myCalc.div(number1, number2);
                            System.out.println("The answer is: " + ans);
                        } catch (ArithmeticException Ae) {

                            System.out.println(Ae.getMessage());
                        }
                        break;

                }
            }

        } while (option != 5);

        System.out.println("Bye Bye! Thank you for using my calculator");
    }

    public static void printMenu() {

        System.out.println("**** CALCULATOR OPTIONS *******\n\n");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Exit Calculator");

    }

}
