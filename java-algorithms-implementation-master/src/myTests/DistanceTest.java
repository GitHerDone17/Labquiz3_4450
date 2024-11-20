import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.jwetherell.algorithms.mathematics.Distance;

public class DistanceTest {

    @Test
    void testChebyshevDistance() {
        assertEquals(3, Distance.chebyshevDistance(new long[]{0, 0}, new long[]{3, 2}));
        assertEquals(4, Distance.chebyshevDistance(new long[]{5, 5}, new long[]{1, 9}));
        assertEquals(0, Distance.chebyshevDistance(new long[]{2, 2}, new long[]{2, 2}));
    }
    @Test
    void testSquaredDistance() {
        assertEquals(25.0, Distance.squaredDistance(0, 0, 3, 4));
        assertEquals(0.0, Distance.squaredDistance(1, 1, 1, 1));
        assertEquals(72.0, Distance.squaredDistance(-5, -5, 1, 1));
    }

    @Test
    void testEuclideanDistance() {
        assertEquals(5.0, Distance.euclideanDistance(0, 0, 3, 4), 0.001);
        assertEquals(0.0, Distance.euclideanDistance(1, 1, 1, 1), 0.001);
        assertEquals(8.485, Distance.euclideanDistance(-5, -5, 1, 1), 0.001);
    }
}
