package prueba;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public Screenshot(){}

    public void takeScreenshot(WebDriver driver){
        driver.manage().window().maximize();
        File src = ((TakesScreenshot)driver).getScreenshotAs( OutputType.FILE);

        try{
            FileUtils.copyFile(src, new File("C:\\selenium\\imagen.png"));
        }catch( IOException e){
            System.out.println(e.getMessage());
        }
    }
}
