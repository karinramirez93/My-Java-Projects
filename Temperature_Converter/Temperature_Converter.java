import java.util.Scanner;

public class Temperature_Converter{

    public static void main(String [] args ){

        Scanner scan = new Scanner(System.in);

        System.out.println("""
                                ***Welcome to the Temperature Converter*** 

                                tell me how can i help you today. 
                                choice from 1 to 3
                                1. Fahrenheit to Celsius or kelvin.
                                2. Celsius to Fahrenheit or kelvin.
                                3. kelvin to Fahrenheit or Celsius.
                           """);

        int choice = scan.nextInt();
        double temperature; // variable to store temperature input
        double convertedTemp1; // for the first convertion result;
        double convertedTemp2; // for the second convertion resulg

        switch(choice){

            case 1:// case 1 is about converting Fahrenheit to celsius and kelvin
                System.out.println("Converting Fahrenheit to Celsius and kelvin\n");
                System.out.print("Provide Temperature in Fahrenheit: ");

                //requsting Fahrenheit Temperature value from the user
                temperature = scan.nextDouble();

                //calculating Fahrenheit temperature to Celsius
                convertedTemp1 = fahrenheitToCelsius(temperature);

                //calculating Celsius from (convertedTemp1) To kelvin 
                convertedTemp2 = celsiusToKelvin(convertedTemp1);

                System.out.printf("%.2f Fahrenheit is: %.2f Celsius and %.2f Kelvin.%n", temperature, convertedTemp1, convertedTemp2);

                break;

            case 2: // case 2 is about converting Celsius to Fahrenheit and Kelvin
                System.out.println("Converting Celsius to Fahrenheit and Kelvin\n");
                System.out.print("Provide Temperature in Celsius: ");

                //requesting Celsius Temperature value from the user
                temperature = scan.nextDouble();
                
                //calculating Celsius temperature to Fahrenheit
                convertedTemp1 = celsiusToFahrenheit(temperature);

                //calculating Celsius temperature to Kelvin
                convertedTemp2 = celsiusToKelvin(temperature);

                System.out.printf("%.2f Celsius is: %.2f Fahrenheit and %.2f Kelvin.%n", temperature, convertedTemp1, convertedTemp2);
                break;

            case 3: // case 3 is about converting Kelvin to Fahrenheir and Celsius
                System.out.println("Converting Kelvin to Fahrenheit and Celsius\n");
                System.out.print("Provide Temperature in Kelvin: ");

                //requesting temperature to the user
                temperature = scan.nextDouble();

                //calculating Kelvin to Fahrenheit
                convertedTemp1 = kelvinToFahrenheit(temperature);

                //calculating Fahrenheit to Celsius from Kelvin Temperature
                convertedTemp2 = fahrenheitToCelsius(convertedTemp1);

                System.out.printf("%.2f Kelvin is: %.2f Fahrenheit and %.2f Celsius.%n", temperature, convertedTemp1, convertedTemp2);
                break;
    
            default: 
                System.out.println("Invalid choice. Please enter a number from 1 to 3");
                break;
        }//end switch


        }//end main

        public static double fahrenheitToCelsius(double fahrenheitTemp){
            //formula: (F -32) * 5/9
            double result = (fahrenheitTemp - 32) * 5 / 9;
            return result;
            }

        public static double celsiusToKelvin(double celsiusTemp){
            //formula: C + 273.15
            double result = celsiusTemp + 273.15;
            return result;
            }

       public static double celsiusToFahrenheit(double celsiusTemp){
           //formula: (C * 9 / 5) + 32
           double result = (celsiusTemp * 9 / 5) + 32;
           return result;
           }

       public static double kelvinToFahrenheit(double kelvinTemp){
           //formula: (K - 273.15) * 9 / 5 + 32
           double result = (kelvinTemp - 273.15) * 9 / 5 + 32;
           return result;
           }



    


    }// end class
