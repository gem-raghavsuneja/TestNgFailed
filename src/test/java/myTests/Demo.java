package myTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void Hi() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--illegal-access=warn");
        WebDriver driver = new EdgeDriver(options);
        System.setProperty("webdriver.edge.driver", "C:\\Users\\raghav.suneja\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver.get("https://www.google.com/");

        String s = driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
        System.out.println(s);
        Assert.assertEquals(s,"Jiji");


    }


    @Test
    public void Hi2() {

        Assert.assertEquals(true,true);
    }
}
