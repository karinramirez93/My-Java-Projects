import java.util.Scanner;

// the next project is about build a simple calculator


public class Calculator{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println(" how can i help you today.\n1. addition\n2. subtraction\n3. multiplication\n4. division");

        //choice asks the user to select one method to work on it.
        int choice = scan.nextInt();
        System.out.println("Provide the first digit");
        double num1 = scan.nextDouble();//ask the user for the first digit and store it in num1
        System.out.println("Provide the next digit");
        double num2 = scan.nextDouble();//ask the user for the second digit and store it in num2
        double result;// this result store the result from each case depending on user election previously
        switch (choice){
            case 1:
                   result = addition(num1, num2);
                   System.out.println("Result: " + num1 + " + "+ num2 + " = " + result);
                    break;
            case 2:
                    result = subtraction(num1, num2);
                   System.out.println("Result: " + num1 + " - "+ num2 + " = " + result);

                    break;
            case 3: 
                    result = multiplication(num1, num2);
                   System.out.println("Result: " + num1 + " * "+ num2 + " = " + result);

                    break;
            case 4:
                    if(num2 != 0){
                       result = division(num1, num2);
                       System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    else{
                        System.out.println("Invalid choice. division by zero");
                        }

                    break;
                    default: 
                            System.out.println("Invalid choice. please select an option from 1 to 4");
                            break;
            
        }

        }//end main

        /*
        @param num1 is first digit requested to the user
        @param num2 is second digit requested to the user
        */
    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){

        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        if(num2 == 0.0){
            throw new ArithmeticException("Cannot divide by zero!");
            }
        return num1 / num2;
    }



    }//end class
