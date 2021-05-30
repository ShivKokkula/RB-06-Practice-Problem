package com.generics;

public class MaxOfThree <E extends Comparable<E>>{

    public <E extends Comparable<E>> E maxOfThreeGeneric(E element1, E element2, E element3) {
        if(element1.compareTo(element2) > 0) {
            if (element1.compareTo(element3)> 0)
                return element1;
            else
                return element3;
        }
        else {
            if (element2.compareTo(element3) > 0)
                return element2;
            else
                return element3;
        }
    }
}
