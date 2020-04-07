package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(element -> element).average().getAsDouble();
    }


    public int getIndexOfFirstEven() {
        return arrayList.indexOf(arrayList.stream().filter(element -> element % 2 == 0).findFirst().get());
    }


    public int getLastOdd() {
        List<Integer> reverseList = new ArrayList<>(arrayList);
        Collections.reverse(reverseList);
        return reverseList.stream().filter(element -> element % 2 != 0).findFirst().get();
    }



}
