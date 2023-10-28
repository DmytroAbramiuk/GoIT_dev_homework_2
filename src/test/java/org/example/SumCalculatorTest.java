package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    public static SumCalculator sumCalculator;
    public static final int CORRECT_VALUE_THAT_EQUALS_THREE = 3;
    public static final int CORRECT_VALUE_THAT_EQUALS_ONE = 1;
    public static final int INCORRECT_VALUE = -2;
    @BeforeEach
    void initialize(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumTest() {
        int result = sumCalculator.sum(CORRECT_VALUE_THAT_EQUALS_THREE);

        Assertions.assertEquals(6, result);
    }

    @Test
    void sumWithParameterThatEqualsOne(){
        int result = sumCalculator.sum(CORRECT_VALUE_THAT_EQUALS_ONE);

        Assertions.assertEquals(1, result);
    }

    @Test
    void sumWithIncorrectParameterTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(INCORRECT_VALUE));
    }
}