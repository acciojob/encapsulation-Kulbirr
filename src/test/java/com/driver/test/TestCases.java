package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.driver.RWOnly;
public class TestCases {
    public static void main(String[] args) {
        // Create an instance of RWOnly
        RWOnly obj = new RWOnly();

        // Use setter to set the name
        obj.setName("John");

        // Use getter to get the name
        String name = obj.getName();
        System.out.println("Name: " + name);
    }
}
