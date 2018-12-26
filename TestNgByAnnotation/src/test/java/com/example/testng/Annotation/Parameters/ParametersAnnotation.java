package com.example.testng.Annotation.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {


    @Test
    @Parameters({"username", "password"})
    public void parameterTest(String username, String password) {
        System.err.println("Usernamne  is " + username);
        System.err.println("Password is" + password);


    }

}
