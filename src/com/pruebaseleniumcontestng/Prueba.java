package com.pruebaseleniumcontestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prueba {

    @Test(priority = 1, description = "Test 1")
    void initialTest() {
        System.out.println("Test: OK");
        //Assert.assertEquals("uno", "dos");
    }

    @Test(priority = 2, description = "Test 2")
    void initialTestUno() {
        System.out.println("Test: OK2");
    }

    @Test(priority = 3, description = "Test 3")
    void initialTestDos() {
        System.out.println("Test: OK3");
    }

    @Test(priority = 1, description = "Test 1")
    void titleTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://es.wikipedia.org/");

        Assert.assertEquals(driver.getTitle(), "Wikipedia, la enciclopedia libre");
    }
}