package org.test.AGLearnjunit;

import org.junit.*;

public class Aablearnjunitsample {

    @BeforeClass
    public static void beforeclass() {
        System.out.println("before class method");
    }

    @AfterClass
    public static void afterclass() {
        System.out.println("after class method");
    }

    @Before
    public void before() {
        System.out.println("before method");
    }

    @After
    public void after() {
        System.out.println("after method");
    }

    @Test
    public void test1() {
        System.out.println("main test1 method");
    }

    @Test
    public void test2() {
        System.out.println("main test2 method");
    }




}
