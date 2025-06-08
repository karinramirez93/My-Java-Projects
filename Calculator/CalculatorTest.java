// this javafile test use Junit 4.13.2 and hamcrest-core-1.3 for testing

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    private static Calculator calculator;

    @BeforeClass
    public static void setup(){
        calculator = new Calculator();

    }

    @Test
    public void testAddition(){
        assertEquals(4.0, calculator.addition(2,2),0.0001);
        assertEquals(15.0, calculator.addition(10,5),0.0001);
        assertEquals(-10.0, calculator.addition(10,-20),0.0001);
    }
    @Test
    public void testSubtraction(){
        assertEquals(2.0, calculator.subtraction(4,2),0.0001);
        assertEquals(-2.0, calculator.subtraction(4,6),0.0001);
    }
    @Test
    public void testMultiplication(){
        assertEquals(9.0, calculator.multiplication(3,3),0.0001);
        assertEquals(10.0, calculator.multiplication(2,5),0.0001);
    }
    @Test
    public void testDivision(){
        assertEquals(2.0, calculator.division(4,2),0.0001);
        assertEquals(3.0, calculator.division(27,9),0.0001);
        
    }
    @Test(expected = ArithmeticException.class)//this tells Junit to expect an Arithmetic exception
    public void testDivisionbyZero(){
        calculator.division(10,0);
    }
    }//end class
