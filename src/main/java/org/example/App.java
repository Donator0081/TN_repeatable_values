package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static final List<Double> DOUBLE_LIST = new ArrayList<>();

    public static void main( String[] args ) {
        DOUBLE_LIST.add(10.2);
        DOUBLE_LIST.add(11.2);
        DOUBLE_LIST.add(12.2);
        DOUBLE_LIST.add(13.2);
        DOUBLE_LIST.add(14.2);
        DOUBLE_LIST.add(10.2);
        DOUBLE_LIST.add(12.2);
        DOUBLE_LIST.add(13.2);
        DOUBLE_LIST.add(10.6);

        RepeatableValues repeatableValues = new RepeatableValues();
        repeatableValues.findRepeatableValues(DOUBLE_LIST);
    }
}
