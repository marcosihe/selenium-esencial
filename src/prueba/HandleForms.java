package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleForms {

    public HandleForms(){}

    public void clickButton(WebDriver driver, String id){
        WebElement btn = driver.findElement(By.id( id ) );
        btn.click();
    }

    public void fillFieldById(WebDriver driver, String id, String text){
        driver.findElement( By.id(id)).sendKeys(text);
    }

    public void fillFieldByName(WebDriver driver, String name, String text){
        driver.findElement( By.name(name)).sendKeys("text");
    }

    public void selectRadioButton(WebDriver driver, String id){
        driver.findElement( By.id(id)).click();
    }

    public  void handleSelectField(WebDriver driver, String id, String text){
        Select sel = new Select( driver.findElement( By.id(id)));
        sel.selectByVisibleText(text);
    }

    public void handleCheckBoxItem(WebDriver driver, String id) {
        WebElement checkBox = driver.findElement( By.id(id));
        if( !checkBox.isSelected() ){
            checkBox.sendKeys( Keys.SPACE );
        }
    }

    public void sendForm(WebDriver driver, String formId){
        driver.findElement( By.id(formId) ).submit();
    }
}
