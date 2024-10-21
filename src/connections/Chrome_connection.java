package connections;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Chrome_connection {



    public static ChromeDriver driver(String link) {

        ChromeOptions option = new ChromeOptions();

        option.setBinary(new File("C:/Users/AMansour/Downloads/chrome-win64/chrome-win64/chrome.exe"));

        ChromeDriver driver = new ChromeDriver(option);

        driver.get(link);




return driver;
    }







}
