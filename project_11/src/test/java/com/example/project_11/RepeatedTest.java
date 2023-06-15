package com.example.project_11;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedTest {
    @org.junit.jupiter.api.RepeatedTest(3)
    void math_add_1() {
        System.out.println("Run math_add_1()");
        assertEquals(2, 1 + 1);
    }

    @org.junit.jupiter.api.RepeatedTest(3)
    void math_add_2() {
        System.out.println("Run math_add_2()");
        assertEquals(2, 1 + 1);
    }
}
