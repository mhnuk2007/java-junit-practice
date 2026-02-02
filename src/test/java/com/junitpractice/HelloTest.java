package com.junitpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    Hello hello = new Hello();
    @Test
    public void test() {
        assertEquals( "Hello World!", hello.hello() );
    }
}
