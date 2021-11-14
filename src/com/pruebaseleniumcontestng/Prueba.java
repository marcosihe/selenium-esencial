package com.pruebaseleniumcontestng;

import org.testng.annotations.Test;

public class Prueba {

    @Test ( priority = 1, description = "Test 1")
    void initialTest(){
        System.out.println("Test: OK");
    }

    @Test ( priority = 2, description = "Test 2" )
    void initialTestUno(){
        System.out.println("Test: OK2");
    }

    @Test ( priority = 3, description = "Test 3" )
    void initialTestDos(){
        System.out.println("Test: OK3");
    }
}
