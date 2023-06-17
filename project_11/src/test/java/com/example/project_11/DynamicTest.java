package com.example.project_11;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

import org.hibernate.HibernateException;
import org.hibernate.action.spi.AfterTransactionCompletionProcess;
import org.hibernate.action.spi.BeforeTransactionCompletionProcess;
import org.hibernate.action.spi.Executable;
import org.hibernate.event.spi.EventSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestFactory;

@DisplayName("JUnit 5 Dynamic Tests Example")
public class DynamicTest {

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
                dynamicTest("simple dynamic test", () -> assertTrue(true)),
                dynamicTest("My Executable class", new MyExecutable()),
                dynamicTest("Exception Executable", () -> {
                    throw new Exception("Exception Example");
                }),
                dynamicTest("simple dynamic test-2", () -> assertTrue(true)));
    }
}

class MyExecutable implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello World");
    }

}