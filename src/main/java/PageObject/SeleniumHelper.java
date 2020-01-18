package PageObject;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalTime;

public class SeleniumHelper {
    public static void takeScreenshoot(WebDriver driver) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/"+ LocalTime.now().getNano() + ".png");
        Files.copy(screenshotFile.toPath(),destinationFile.toPath());


    }
}
