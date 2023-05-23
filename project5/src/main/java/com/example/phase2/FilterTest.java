package com.example.phase2;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FilterTest implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain next)
            throws IOException, ServletException {

        System.out.println(
                "Before filter - Preprocessing before servlet");

        next.doFilter(req, resp);

        System.out.println(
                "After servlet - Following code will execute after running the servlet - PostProcessing");
    }

}
