
    import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

    // The Test class should start or end with "Test"
    public class CalculatorTest {

        private Calculator calculator;

        @BeforeEach
        public void setUp() throws Exception {
            calculator = new Calculator();
        }

        @Test
        @DisplayName("Simple multiplication should work")
        public void testMultiply() {
            assertEquals(20, calculator.multiply(5, 4));
        }

        @Test
        void addNumbers() {

            // Assertion with a custom message
            // that will be displayed if the test fails
            assertEquals(3, calculator.add(1, 2), "1 + 2 should equal 3");
        }
    }

