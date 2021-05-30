package com.generics;

public class MaxOfThree <E extends Comparable<E>>{
    public E element1;
    public E element2;
    public E element3;

    public MaxOfThree(E element1,E element2,E element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public E testMaximum(){
        if(this.element1.compareTo(this.element2) > 0) {
            if (this.element1.compareTo(this.element3)> 0)
                return this.element1;
            else
                return this.element3;
        }
        else {
            if (this.element2.compareTo(this.element3) > 0)
                return this.element2;
            else
                return this.element3;
        }
    }
}
