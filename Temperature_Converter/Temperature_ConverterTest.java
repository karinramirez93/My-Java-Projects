//this file is working with Junit 4.13.2

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Temperature_ConverterTest{

    Temperature_Converter converter = new Temperature_Converter();

    //defining a delta for double comparisons due to potential floating-point innacuracy
    //limiting to 2 decimal points
    private static final double DELTA = 0.001;

    //----------Fahrenheit convertions ------------

    @Test
    public void testFahrenheitToCelsius_FreezinfPoint(){

        //testing freezing point 32 F should be zero C
        double fahrenheit = 32.0;
        double expectedCelsius = 0.0;
        double actualCelsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals("32F should be 0C", expectedCelsius, actualCelsius, DELTA);
    }

    @Test
    public void testFahrenheirToCelsius_BoilingPoint(){
        //test boiling point: 212 F should be 100 C
        double fahrenheit = 212.0;
        double expectedCelsius = 100.0;
        double actualCelsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals("212F should be 100C", expectedCelsius, actualCelsius, DELTA);
    }
    
    //---------- Celsius Conversins ----------

    @Test
    public void testCelsiusToFahrenheit_FreezingPoint(){
        //test freezing point 0 C should be 32 F
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;
        double actualFahrenheit = converter.celsiusToFahrenheit(celsius);
        assertEquals("0C should be 32F", expectedFahrenheit, actualFahrenheit, DELTA);
    }

    @Test
    public void testCelsiudToKelvin_FreezingPoint(){
        //test freezing point 0 C should be 273.15 K
        double celsius = 0.0;
        double expectedKelvin = 273.15;
        double actualKelvin = converter.celsiusToKelvin(celsius);
        assertEquals("0C should be 273.15K", expectedKelvin, actualKelvin, DELTA);
    }

   //------------Kelvin Conversions ---------

   @Test 
   public void testKelvinToCelsius_AbsoluteZero(){
       //test absolute zero: 0 K should be -273.15 C
       double kelvin = 0.0;
       double tempFahrenheit = converter.kelvinToFahrenheit(kelvin);
       double expectedCelsius = -273.15;
       double actualCelsius = converter.fahrenheitToCelsius(tempFahrenheit);
       assertEquals("0K should be -273.15C", expectedCelsius, actualCelsius, DELTA);
   }

   @Test
   public void testKelvinToFahrenheit_FreezingPoint(){
       //test freezing point equivalent: 273.15 K should be 32 F
       double kelvin = 273.15;
       double expectedFahrenheit = 32.0;
       double actualFahrenheit = converter.kelvinToFahrenheit(kelvin);
       assertEquals("273.15K should be 32.0F", expectedFahrenheit, actualFahrenheit, DELTA);
   }


    }//end class
