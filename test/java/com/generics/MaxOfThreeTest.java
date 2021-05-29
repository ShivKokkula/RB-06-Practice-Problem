package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxOfThreeTest {

    @Test
    void given3Integers_ShouldReturn_MaxAt1() {
        MaxOfThree maxOfThreeInteger = new MaxOfThree();
        Integer result = maxOfThreeInteger.maxOfThreeInt(5,3,4);
        Assertions.assertEquals(5,result);
    }
    @Test
    void given3Integers_ShouldReturn_MaxAt2() {
        MaxOfThree maxOfThreeInteger = new MaxOfThree();
        Integer result = maxOfThreeInteger.maxOfThreeInt(2,6,4);
        Assertions.assertEquals(6,result);
    }
    @Test
    void given3Integers_ShouldReturn_MaxAt3() {
        MaxOfThree maxOfThreeInteger = new MaxOfThree();
        Integer result = maxOfThreeInteger.maxOfThreeInt(2,3,7);
        Assertions.assertEquals(7,result);
    }
    @Test
    void given3Float_ShouldReturn_MaxAt1() {
        MaxOfThree maxOfThreeFloat = new MaxOfThree();
        Double result = maxOfThreeFloat.maxOfThreeFlt(9.0,8.0,4.0);
        Assertions.assertEquals(9.0, result);
    }
    @Test
    void given3Float_ShouldReturn_MaxAt2() {
        MaxOfThree maxOfThreeFloat = new MaxOfThree();
        Double result = maxOfThreeFloat.maxOfThreeFlt(9.0,18.0,4.0);
        Assertions.assertEquals(18.0, result);
    }
    @Test
    void given3Float_ShouldReturn_MaxAt3() {
        MaxOfThree maxOfThreeFloat = new MaxOfThree();
        Double result = maxOfThreeFloat.maxOfThreeFlt(9.0,8.0,44.0);
        Assertions.assertEquals(44.0, result);
    }
}
