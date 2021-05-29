package com.generics;

public class MaxOfThree {
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

    public Double maxOfThreeFlt(Double x, Double y, Double z) {
        if(x.compareTo(y) > 0) {
            if (x.compareTo(z)> 0)
                return x;
            else
                return z;
        }
        else {
            if (y.compareTo(z) > 0)
                return y;
            else
                return z;
        }
    }
}
