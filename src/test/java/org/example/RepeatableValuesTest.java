package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.TestDataRepeatableValues.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatableValuesTest {

    private final RepeatableValues repeatableValues = new RepeatableValues();

    @Test
    @DisplayName("Testing findRepeatableValues method with String List should return List with Dog Girl Boy values")
    void findRepeatableValuesWithStringList() {
        List<String> expectedList = repeatableValues.findRepeatableValues(STRING_LIST);
        assertEquals(expectedList, List.of("Dog", "Girl", "Boy"));
    }

    @Test
    @DisplayName("Testing findRepeatableValues method with Double List should return List with 10.2,13.2,12.2 values")
    void findRepeatableValuesWithDoubleList() {
        List<Double> expectedList = repeatableValues.findRepeatableValues(DOUBLE_LIST);
        assertEquals(expectedList, List.of(10.2, 13.2, 12.2));
    }

    @Test
    @DisplayName("Testing findRepeatableValues method with Integer List should return List with Dog Girl Boy values")
    void findRepeatableValuesIntegerList() {
        List<Integer> expectedList = repeatableValues.findRepeatableValues(INTEGER_LIST);
        assertEquals(expectedList, List.of(1, 3, 8, 77));
    }

    @Test
    @DisplayName("Testing findRepeatableValues method with Boolean List should return List with Dog Girl Boy values")
    void findRepeatableValuesBooleanList() {
        List<Boolean> expectedList = repeatableValues.findRepeatableValues(BOOLEAN_LIST);
        assertEquals(expectedList, List.of(true));
    }
}