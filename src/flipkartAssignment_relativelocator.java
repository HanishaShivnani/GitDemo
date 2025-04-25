import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.concurrent.TimeUnit;

public class flipkartAssignment_relativelocator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		//click on become a seller 
		WebElement dropdown = driver.findElement(By.xpath("(//img[@alt='Dropdown with more help links'])[1]"));
		driver.findElement(with(By.tagName("a")).toLeftOf(dropdown)).click();
		
		//click on start selling button 
		driver.findElement(By.xpath("(//button[normalize-space()='Start Selling'])[1]")).click();
		
		//enter gmail 
		WebElement mobile= driver.findElement(By.name("mobileNumber"));
		driver.findElement(with(By.tagName("input")).below(mobile)).sendKeys("hanishashivnani1234@gmail.com");
		
		//select option
		WebElement gst = driver.findElement(By.name("gst"));
		driver.findElement(with(By.tagName("div")).above(gst)).click();
		
		//click privacy policy 
		WebElement t = driver.findElement(By.xpath("(//button[normalize-space()='Terms of Use'])[1]"));
		driver.findElement(with(By.xpath("(//button[normalize-space()='Privacy Policy'])[1]")).toRightOf(t)).click();
		
		//close privacy policy popup
		driver.findElement(By.xpath("//span[@class='close_icon']//*[name()='svg']")).click();
		
		//back to previous page
		driver.navigate().back();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down the page
        js.executeScript("window.scrollBy(0, 7200)");
		
        //click on back to top scroll bar feature
        WebElement fb= driver.findElement(By.xpath("(//a[normalize-space()='Terms of Use'])[1]"));
        driver.findElement(with(By.tagName("svg")).near(fb)).click();
	}

}
