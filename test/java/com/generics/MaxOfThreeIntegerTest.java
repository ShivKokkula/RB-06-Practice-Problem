package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxOfThreeIntegerTest {

    @Test
    void given3Integers_ShouldReturn_MaxAt1() {
        MaxOfThreeInteger maxOfThreeInteger = new MaxOfThreeInteger();
        Integer result = maxOfThreeInteger.maxOfThreeInt(5,3,4);
        Assertions.assertEquals(5,result);
    }
    @Test
    void given3Integers_ShouldReturn_MaxAt2() {
        MaxOfThreeInteger maxOfThreeInteger = new MaxOfThreeInteger();
        Integer result = maxOfThreeInteger.maxOfThreeInt(2,6,4);
        Assertions.assertEquals(6,result);
    }
    @Test
    void given3Integers_ShouldReturn_MaxAt3() {
        MaxOfThreeInteger maxOfThreeInteger = new MaxOfThreeInteger();
        Integer result = maxOfThreeInteger.maxOfThreeInt(2,3,7);
        Assertions.assertEquals(7,result);
    }
}
