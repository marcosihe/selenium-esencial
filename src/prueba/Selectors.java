package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Selectors {

    // constructor
    public Selectors(){}

    // Custom methods

    public void getElementByIdAndShowText(WebDriver driver, String id){
        WebElement elem = driver.findElement(By.id(id));
        System.out.println(elem.getText());
    }

    public void listElementsByClassNameAndShowText(WebDriver driver, String className){
        List<WebElement> elements = driver.findElements(By.className(className));
        listWebElements(elements);
    }

    public void listElementsByTagNameAndShowAttributesById(WebDriver driver, String tagName, String id){
        List<WebElement> elements = driver.findElements(By.tagName(tagName));
        for(WebElement element : elements){
            System.out.println(element.getAttribute(id));
        }
    }

    public void listElementsByXpath(WebDriver driver, String xpath){
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        listWebElements(elements);
    }

    public void listWebElements(List<WebElement> elements){
        for (WebElement element : elements){
            System.out.println(element.getText());
        }
    }
}
