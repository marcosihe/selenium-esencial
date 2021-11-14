package prueba;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Events {

    // constructor
    public Events(){}

    // custom methods

    // cick event
    public void clickButton(WebDriver driver, String id){
        WebElement button = driver.findElement(By.id(id));
        button.click();
        showAlertAndGetText(driver);
    }

    // mouse hover event
    public void hoverBox(WebDriver driver,String id){
        WebElement image = driver.findElement( By.id(id));
        Actions action = new Actions(driver);
        action.moveToElement(image).build().perform();
        showAlertAndGetText(driver);
    }

    // key pressed event
    public void pressKey(WebDriver driver, String tagName){
        WebElement document1 = driver.findElement( By.tagName(tagName));
        document1.sendKeys(Keys.ENTER);
        showAlertAndGetText(driver);
    }

    // show alert and getText
    public void showAlertAndGetText(WebDriver driver){
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
    }
}
