import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.ConstructorParameters;

public class IsPositiveTest {
    @Test
    public void testCheckIsPositive(){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(6);
        Assertions.assertTrue(result);
    }
    @Test
    public void TestCheckIsNegative(){
        IsPositive IsNegative = new IsPositive();
        boolean result = IsNegative.checkIsPositive(-3);

        Assertions.assertFalse(result);

    }


}
