package com.ram.core.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author rams0516
 *         Date: 3/9/2018
 *         Time: 3:01 PM
 */
public class SetLearn {

    public static void main(String[] args) {
        String[] strings = {"ram", "sam", "ram"};
        Set<String> distinct = Arrays.asList(strings).stream().collect(Collectors.toSet());

        Set<String> distinctDash = new HashSet<>();

        for(String string : strings) {
            distinctDash.add(string);
        }
        System.out.println(distinctDash);
    }

}