package prueba;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;

import java.util.ArrayList;

public class ChangesDetector {

    // constructor
    public ChangesDetector(){}

    // Custom methods

    public void getAndShowNewRoute(WebDriver driver, String xpath){
        WebElement link1 = driver.findElement( By.xpath(xpath));
        String currentRoute = driver.getCurrentUrl();
        link1.click();
        String newRoute = driver.getCurrentUrl();

        String msg = (currentRoute.equals(newRoute)) ? "ERROR" : "Navigation OK";
        System.out.println(msg);
        System.out.println(newRoute);
    }

    /*
    * The main deference between get() and navigate().to() is that with navigate
    * we have access to the navigates history
    *  */
    public void navigateTheSite(WebDriver driver, String url1, String url2){
        driver.navigate().to(url1);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to(url2);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
    }

    public void openLinkIntoNewTab(WebDriver driver, String xpath){
        String openNewTab = Keys.chord( Keys.CONTROL, Keys.RETURN);
        WebElement link1 = driver.findElement( By.xpath(xpath));
        link1.sendKeys(openNewTab);
    }

    public void handleMultiplesTabs(WebDriver driver, String xpath){
        String openNewTab = Keys.chord( Keys.CONTROL, Keys.RETURN);
        WebElement link1 = driver.findElement( By.xpath(xpath));
        link1.sendKeys(openNewTab);
        System.out.println(driver.getCurrentUrl());
        ArrayList tabs = new ArrayList( driver.getWindowHandles());
        System.out.println( tabs.size());
        driver.switchTo().window( tabs.get(1).toString());
        System.out.println(driver.getCurrentUrl());
    }

    public void handleOtherWindow(WebDriver driver, String xpath){
        WebElement link1 = driver.findElement( By.xpath(xpath));
        link1.click();
        ArrayList windows = new ArrayList( driver.getWindowHandles() );
        driver.switchTo().window( windows.get(1).toString());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }

    public void executeJavascriptCode(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("alert ('hola mundoo)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
