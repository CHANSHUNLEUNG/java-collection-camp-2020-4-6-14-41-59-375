package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(element -> {
            return (element % 2 != 0) ? element * 3 + 5 : 0;
        }).sum();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> oddListDesc = arrayList.stream().filter(element -> element % 2 != 0).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> evenListAsc = arrayList.stream().filter(element -> element % 2 == 0).
                sorted().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<Integer>();
        resultList.addAll(evenListAsc);
        resultList.addAll(oddListDesc);
        return resultList;
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        List<Integer> evenList = arrayList.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        return evenList.contains(specialElement);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(element -> {
            return (element % 2 != 0) ? element * 3 + 2 : element;
        }).collect(Collectors.toList());
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(element -> element * 3 + 2).sum();
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        int smallerBorder = (leftBorder < rightBorder) ? leftBorder : rightBorder;
        int biggerBorder = (leftBorder < rightBorder) ? rightBorder : leftBorder;
        for(int number = smallerBorder; number <= biggerBorder; number++){
            if(number % 2 == 0){
                sum += number;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        int smallerBorder = (leftBorder < rightBorder) ? leftBorder : rightBorder;
        int biggerBorder = (leftBorder < rightBorder) ? rightBorder : leftBorder;
        for(int number = smallerBorder; number <= biggerBorder; number++){
            if(number % 2 != 0){
                sum += number;
            }
        }
        return sum;
    }

}
