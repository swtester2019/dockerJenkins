package firstPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {
    @Test
    public void checkingNum() {
        Assertions.assertTrue(2 < 5);
    }

    @Test
    public void checkingNum1() {
        Assertions.assertTrue(3 < 5);
    }
}
