import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CounterOfDigitsTest {
    CounterOfDigits number;
    Map<Integer, Integer> mapValuesOfFactorials = new HashMap<>();

    // values to compare
    @Before
    public void init() {
        number = new CounterOfDigits();
        mapValuesOfFactorials.put(0, 1);
        mapValuesOfFactorials.put(2, 2);
        mapValuesOfFactorials.put(5, 3);
        mapValuesOfFactorials.put(10, 27);
        mapValuesOfFactorials.put(100, 648);
    }

    @After
    public void destroy() {
        number = null;
        mapValuesOfFactorials.clear();
    }

    // comparing values using an enhanced for loop
    @Test
    public void compareCorrectValues() {
        for (Map.Entry entry : mapValuesOfFactorials.entrySet()) {
            Integer num = (Integer) entry.getKey();
            Integer sumDigitsFactorial = (Integer) entry.getValue();
            assertThat(sumDigitsFactorial, is(CounterOfDigits.countTheSumOfDigits(num)));
        }
    }
}