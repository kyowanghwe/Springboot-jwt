package com.web.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test
{
    public static void main(String[] args)
    {
        Integer array[] = {1, 2, 3};

        List<Integer> list = fromArrayToList(array);

        System.out.println("list: "+list);

    }

    public static <T extends Number> List<Integer> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
}
