package com.generics;

public class MaxOfThreeInteger {
    public Integer maxOfThreeInt(Integer a, Integer b, Integer c) {
        if(a.compareTo(b) > 0) {
            if (a.compareTo(c)> 0)
                return a;
            else
                return c;
        }
        else {
            if (b.compareTo(c) > 0)
                return b;
            else
                return c;
        }
    }
}
