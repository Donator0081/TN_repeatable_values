package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestDataRepeatableValues {

    public static final List<String> STRING_LIST = new ArrayList<>();
    public static final List<Double> DOUBLE_LIST = new ArrayList<>();
    public static final List<Integer> INTEGER_LIST = new ArrayList<>();
    public static final List<Boolean> BOOLEAN_LIST = new ArrayList<>();

    static {
        STRING_LIST.add("Boy");
        STRING_LIST.add("Girl");
        STRING_LIST.add("Girl");
        STRING_LIST.add("Boy");
        STRING_LIST.add("Boy");
        STRING_LIST.add("Dog");
        STRING_LIST.add("Cat");
        STRING_LIST.add("Boy");
        STRING_LIST.add("Dog");
    }

    static {
        DOUBLE_LIST.add(10.2);
        DOUBLE_LIST.add(11.2);
        DOUBLE_LIST.add(12.2);
        DOUBLE_LIST.add(13.2);
        DOUBLE_LIST.add(14.2);
        DOUBLE_LIST.add(10.2);
        DOUBLE_LIST.add(12.2);
        DOUBLE_LIST.add(13.2);
        DOUBLE_LIST.add(10.6);
    }

    static {
        INTEGER_LIST.add(3);
        INTEGER_LIST.add(77);
        INTEGER_LIST.add(12);
        INTEGER_LIST.add(8);
        INTEGER_LIST.add(1);
        INTEGER_LIST.add(1);
        INTEGER_LIST.add(8);
        INTEGER_LIST.add(77);
        INTEGER_LIST.add(3);
        INTEGER_LIST.add(50);
        INTEGER_LIST.add(48);
    }

    static {
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(true);
        BOOLEAN_LIST.add(false);
    }
}
