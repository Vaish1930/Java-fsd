package com.example.project_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class Conditional {
    @Test
    @EnabledOnOs({ OS.WINDOWS })
    public void runOnWindows() {
        System.out.println("This runs on window");
    }

    @Test
    @EnabledOnOs({ OS.LINUX })
    public void runOnLinux() {
        System.out.println("This runs on Linux");

    }
}
