package nivel1.ex2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoDniTest {
    private int dniNumber;
    private char expectedLetter;

    public CalculoDniTest(int dniNumber, char expectedLetter) {
        this.dniNumber = dniNumber;
        this.expectedLetter = expectedLetter;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {12345678, 'Z'},
            {87654321, 'X'},
            {11111111, 'H'},
            {22222222, 'G'},
            {33333333, 'U'},
            {44444444, 'X'},
            {55555555, 'N'},
            {66666666, 'Y'},
            {77777777, 'F'},
            {88888888, 'P'}
        });
    }

    @Test
    public void testCalculateLetter() {
        assertEquals(expectedLetter, CalculoDni.getLetterExpected());
    }
}