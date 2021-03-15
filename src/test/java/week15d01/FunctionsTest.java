package week15d01;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTest {

    @Test
    void findMaximumPointTest() {
        Functions c = new Functions();

        Map.Entry<Double, Double> result = c.findMaximumPoint(Map.of(
                -2., -7.,
                -1., -2.,
                0., 1.,
                1., 2.,
                2., 1.,
                3., -2.));

        assertEquals(1., result.getKey());
        assertEquals(2., result.getValue());
    }

    @Test
    void findMaximumPointEmptyTest() {
        Functions c = new Functions();

        Map.Entry<Double, Double> result = c.findMaximumPoint(Map.of());

        assertEquals(null, result.getKey());
        assertEquals(Double.MIN_VALUE, result.getValue());
    }
}