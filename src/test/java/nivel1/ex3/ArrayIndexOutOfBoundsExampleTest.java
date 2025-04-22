package nivel1.ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexOutOfBoundsExampleTest {
    @Test
    void testExceptionMethod() {
        ArrayIndexOutOfBoundsExample sample = new ArrayIndexOutOfBoundsExample();
        assertThrows(ArrayIndexOutOfBoundsException.class, sample::exceptionMethod);
    }
}