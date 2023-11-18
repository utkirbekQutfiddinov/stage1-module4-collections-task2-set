package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result=new HashSet<>();

        for (String el: firstSet) {
            if(secondSet.contains(el)&&!thirdSet.contains(el)){
                result.add(el);
            }
        }

        for (String el: thirdSet){
            if (!firstSet.contains(el)&&!secondSet.contains(el)){
                result.add(el);
            }
        }

        return result;
    }
}
