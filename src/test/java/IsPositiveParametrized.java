import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveParametrized {

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,86,100, Integer.MAX_VALUE})
    public void checkIsPositiveParametrized(int number){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(number);
        Assertions.assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(ints = {-1,-3,-5,-86,-100, Integer.MIN_VALUE})
    public void checkIsNegativeParametrized(int number) {
        IsPositive isNegative = new IsPositive();
        boolean result = isNegative.checkIsPositive(number);
        Assertions.assertFalse(result);
    }

}
