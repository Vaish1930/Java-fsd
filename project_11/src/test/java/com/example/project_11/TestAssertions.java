package com.example.project_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAssertions {
    @Test
    public void assertTest() {

        String actual = "Some Value";
        String expected = "Some Value";

        Assertions.assertEquals(expected, actual);

        Assertions.assertTrue(5 > 0);
        Assertions.assertFalse(5 < 0);

        String[] a1 = { "A", "B" };
        String[] a2 = { "A", "B" };

        Assertions.assertArrayEquals(a1, a2);

        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException();
        });
    }
}