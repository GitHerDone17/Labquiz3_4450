import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.jwetherell.algorithms.mathematics.Division;


public class DivisionTest {
    @Test
    public void testDivision() throws Exception {
        assertEquals(2, Division.division(10, 5));
        assertEquals(-3, Division.division(9, -3));
    }

    @Test
    void testDivisionUsingLoop() throws Exception{
        assertEquals(2, Division.divisionUsingLoop(10, 5));
        assertEquals(-3, Division.divisionUsingLoop(9, -3));
    }

    @Test
    void testDivisionUsingRecursion() throws Exception {
        assertEquals(2, Division.divisionUsingRecursion(10, 5));
        assertEquals(-3, Division.divisionUsingRecursion(9, -3));
    }

    @Test
    void testDivisionUsingMultiplication() throws Exception {
        assertEquals(2, Division.divisionUsingMultiplication(10, 5));
        assertEquals(-3, Division.divisionUsingMultiplication(9, -3));
    }

    @Test
    void testDivisionUsingShift() throws Exception {
        assertEquals(2, Division.divisionUsingShift(10, 5));
        assertEquals(-3, Division.divisionUsingShift(9, -3));
    }

    @Test
    void testDivisionUsingLogs() throws Exception {
        assertEquals(2, Division.divisionUsingLogs(10, 5));
        assertEquals(-3, Division.divisionUsingLogs(9, -3));
    }
}
