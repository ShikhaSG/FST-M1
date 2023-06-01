import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;

public class Assertion1 {
    @Test
    void addNumbers() {
        Calculator calculator = new Calculator();

        // Assertion with a custom message
        // that will be displayed if the test fails
        assertEquals(3, calculator.add(1, 2), "1 + 2 should equal 3");
    }


}
