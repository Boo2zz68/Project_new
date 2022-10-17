package ДЗ_4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;




public class TriangleTest {
    @ParameterizedTest
    @CsvSource({"3, 4, 5, 6"})
    public void positiveNumbers(int a, int b, int c, int s) throws MyException {
        TriangleClass triangle = new TriangleClass();
        Assertions.assertEquals(s, TriangleClass.triangle(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"-1, 4, 5, 6"})
    public void negativeNumbers(int a, int b, int c, int s) throws MyException {
        TriangleClass triangle = new TriangleClass();
        Assertions.assertThrows(MyException.class,()-> TriangleClass.triangle(a, b, c));
    }
}
