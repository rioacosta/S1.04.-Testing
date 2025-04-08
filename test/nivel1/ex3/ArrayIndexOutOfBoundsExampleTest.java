package nivel1.ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIndexOutOfBoundsExampleTest {

	@Test
	void testExceptionMethod() {
		ArrayIndexOutOfBoundsExample sample = new ArrayIndexOutOfBoundsExample();
        assertThrows(ArrayIndexOutOfBoundsException.class, sample::exceptionMethod);
	}

}
