package ДЗ_4;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;




public class DZ_Test {
    @ParameterizedTest
    @CsvSource({"3, 4, 5, 6"})
    public void positiveNumbers(int a, int b, int c, int s) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(s, Triangle.triangle(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"-1, 4, 5, 6"})
    public void negativeNumbers(int a, int b, int c, int s) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,()-> Triangle.triangle(a, b, c));
    }
}
