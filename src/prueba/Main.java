package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {

        // set up
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=200,50");
        chromeOptions.addArguments("--window-size=800,500");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://es.wikipedia.org/");
        // Xpath
        // "//*[@id=\"mw-content-text\"]/div[1]/div[1]/div[1]/h1"

        // Basic Commands

        //driver.manage().window().maximize();
        //Dimension dimension = new Dimension( 100,100);
        //driver.manage().window().setSize(dimension);
        //driver.manage().window().fullscreen();
        //driver.close();
        //String title = driver.getTitle();
        //System.out.println(title);

        // Selectors
        //Selectors selectors = new Selectors();
        //selectors.listElementsByTagNameAndShowAttributesById(driver, "name", "//*[@id=\"mw-content-text\"]/div[1]/div[1]/div[1]/h1");

        // Events
        //Events event = new Events();
        //event.clickButton(driver, "some_id");
        //event.hoverBox(driver, "some_id");
        //event.pressKey(driver, "some_tagName");

        // Changes Detector
        ChangesDetector cd = new ChangesDetector();
        cd.executeJavascriptCode(driver);
    }
}
