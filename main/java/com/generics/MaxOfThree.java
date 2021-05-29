package com.generics;

public class MaxOfThree {

    public <E extends Comparable<E>> E maxOfThreeGeneric(E element1, E element2, E element3) {
        if(element1.compareTo(element1) > 0) {
            if (element1.compareTo(element3)> 0)
                return element1;
            else
                return element3;
        }
        else {
            if (element1.compareTo(element3) > 0)
                return element1;
            else
                return element3;
        }
    }
}
