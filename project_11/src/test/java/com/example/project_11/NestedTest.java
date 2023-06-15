package com.example.project_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {
    @BeforeEach
    public void init() {
        System.out.println("Init on outer invoked");
    }

    @Nested
    class Nested1 {

        @BeforeEach
        public void init() {
            System.out.println("Init on inner invoked");
        }

        @Test
        @DisplayName("Test inside class Nested")
        public void test() {
            System.out.println(" Example test for class Nested1");
        }

        @Test
        @DisplayName("Test inside class New")
        public void testNew() {
            System.out.println(" Example test for class new");
        }
    }
}
