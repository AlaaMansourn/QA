import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class test_case_1 {
    public static void main(String[] args) throws InterruptedException {

        String link = "https://www.letskodeit.com/practice";
         ChromeDriver driver =   connections.Chrome_connection.driver(link);




        driver.findElement(By.id("bmwradio")).click();


        driver.findElement(By.id("hondacheck")).click();


       /* driver.findElement(By.id("openwindow")).click();

        driver.findElement(By.id("opentab")).click();*/


         Select myselect = new Select(driver.findElement(By.id("carselect")));
         myselect.selectByValue("honda");


        Select myselect2 = new Select(driver.findElement(By.id("multiple-select-example")));
        myselect2.selectByValue("peach");


        driver.findElement(By.id("autosuggest")).sendKeys("Asal is a nice place where all respect each other");
        driver.findElement( By.id("disabled-button")).click();
        driver.findElement( By.id("enabled-button")).click();


        Actions ac3 = new Actions(driver);
        ac3.scrollByAmount(500,400).perform();


        driver.findElement( By.id("hide-textbox")).click();
        driver.findElement( By.id("show-textbox")).click();


       driver.findElement(By.id("name")).sendKeys("alaa");
        driver.findElement( By.id("alertbtn")).click();
        driver.switchTo().alert().dismiss();



        WebElement ele1 = driver.findElement(By.id("mousehover"));

        Actions ac1 = new Actions(driver);

        ac1.moveToElement(ele1).perform();



        driver.findElement(By.linkText("Top")).click();




         Thread.sleep(1000);

        Actions ac5 = new Actions(driver);
        ac5.scrollByAmount(0,500).perform();

        WebElement ele4 = driver.findElement(By.id("courses-iframe"));
        Actions ac4= new Actions(driver);
        ac4.moveToElement(ele4).perform();



         driver.findElement(By.xpath("//*[@id='navbar-inverse-collapse']/ul/li[4]/a")).click();




    }
}

