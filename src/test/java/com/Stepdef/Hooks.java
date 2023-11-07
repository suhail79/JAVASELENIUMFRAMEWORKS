package com.Stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void Beformethod() {
        System.out.println("this is hooks before method");
    }

    @After
    public void Aftermethod() {
        System.out.println("this is hooks After method");
    }

}
