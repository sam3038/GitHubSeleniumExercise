package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DriverHelper;
import java.util.List;


public class GithubTest{

    @Test
    public void gitHubTest(){

     /*    Test Case - Open The Internet (the-internet.herokuapp.com)
    Steps to Automate:
            1. Launch browser of your choice say., Firefox, chrome etc.
            2. Open this URL - The Internet (the-internet.herokuapp.com)
            3. Maximize or set size of browser window.
            4. adds n number of elements
            5.  asserts that n number of elements exist on the page
            6. Close browser.(driver.close)

      */

        WebDriver driver = DriverHelper.getDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        int count=5;
        WebElement addButton= driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        for (int i=1; i<=count;i++){
            addButton.click();
        }

        List<WebElement> deleteButtonCount=driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        Assert.assertEquals(deleteButtonCount.size(),count);

    }
}