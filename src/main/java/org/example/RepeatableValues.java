package org.example;

import java.util.*;

public class RepeatableValues {

    public <T> List<T> findRepeatableValues(List<T> list) {
        HashMap<T, Integer> result = new HashMap<>();
        list.forEach(v -> result.merge(v, 1, Integer::sum));
        return result.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    public <T> void showValues(Collection<T> collection) {
        collection.forEach(v-> System.out.print(v+ " "));
    }
}
