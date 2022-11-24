import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addingTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.countTwoNumbers(5,5));
    }

}