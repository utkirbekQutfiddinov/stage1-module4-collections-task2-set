package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result=new HashSet<>();
        for (Integer integer : sourceList) {
            if(integer%2==1){
                result.add(integer);
                result.add(integer*2);
            }else {
                while(integer%2==0){
                    result.add(integer);
                    integer/=2;
                }
                result.add(integer);
            }
        }
        return result;
    }
}
