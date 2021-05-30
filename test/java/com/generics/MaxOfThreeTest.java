package com.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxOfThreeTest {

    @Test
    void given3Integers_ShouldReturn_MaxAt1() {
        MaxOfThree maxOfThreeInteger = new MaxOfThree<Integer>(5, 3, 4);
        Assertions.assertEquals(5, maxOfThreeInteger.testMaximum());
    }

    @Test
    void given3Integers_ShouldReturn_MaxAt2() {
        MaxOfThree maxOfThreeInteger = new MaxOfThree<Integer>(2, 6, 4);
        Assertions.assertEquals(6, maxOfThreeInteger.testMaximum());
    }

    @Test
    void given3Integers_ShouldReturn_MaxAt3() {
        MaxOfThree maxOfThreeInteger = new MaxOfThree<Integer>(2, 3, 7);
        Assertions.assertEquals(7, maxOfThreeInteger.testMaximum());
    }

    @Test
    void given3Float_ShouldReturn_MaxAt1() {
        MaxOfThree maxOfThreeFloat = new MaxOfThree<Double>(9.0, 8.0, 4.0);
        Assertions.assertEquals(9.0, maxOfThreeFloat.testMaximum());
    }

    @Test
    void given3Float_ShouldReturn_MaxAt2() {
        MaxOfThree maxOfThreeFloat = new MaxOfThree<Double>(9.0, 18.0, 4.0);
        Assertions.assertEquals(18.0, maxOfThreeFloat.testMaximum());
    }

    @Test
    void given3Float_ShouldReturn_MaxAt3() {
        MaxOfThree maxOfThreeFloat = new MaxOfThree<Double>(9.0, 8.0, 44.0);
        Assertions.assertEquals(44.0, maxOfThreeFloat.testMaximum());
    }

    @Test
    void given3String_ShouldReturn_MaxAt1() {
        MaxOfThree maxOfThreeString = new MaxOfThree<String>("Sagar", "Saga", "Sag");
        Assertions.assertEquals("Sagar", maxOfThreeString.testMaximum());
    }

    @Test
    void given3String_ShouldReturn_MaxAt2() {
        MaxOfThree maxOfThreeString = new MaxOfThree<String>("Saga", "Sagar", "Sag");
        Assertions.assertEquals("Sagar", maxOfThreeString.testMaximum());
    }

    @Test
    void given3String_ShouldReturn_MaxAt3() {
        MaxOfThree maxOfThreeString = new MaxOfThree<String>("Sag", "Saga", "Sagar");
        Assertions.assertEquals("Sagar", maxOfThreeString.testMaximum());
    }

    @Test
    void given3StringGeneric_ShouldReturn_MaxAt1() {
        MaxOfThree maxOfThreeStringGeneric = new MaxOfThree<String>("Sagar", "Saga", "Sag");
        Assertions.assertEquals("Sagar", maxOfThreeStringGeneric.testMaximum());
    }

    @Test
    void given3StringGenericClass_ShouldReturn_MaxAt1() {
        MaxOfThree<String> eMaxOfThree = new MaxOfThree<String>("Sagar", "Saga", "Sag");
        Assertions.assertEquals("Sagar", eMaxOfThree.testMaximum());
    }
}
