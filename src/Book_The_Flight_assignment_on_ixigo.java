import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Book_The_Flight_assignment_on_ixigo {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		
		WebDriverManager.chromedriver().setup();  // It will handle driver automatically
        ChromeDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            // Step 1: Open the Goibibo website
            driver.get("https://www.ixigo.com/");
            
            // Maximize the browser window
            driver.manage().window().maximize();
           
            
            WebElement from = driver.findElement(By.xpath("//span[normalize-space(text()) = 'From']"));
            from.click();
            driver.findElement(By.xpath("(//span[@class='block truncate'][normalize-space()='Mumbai, Maharashtra, India'])[1]")).click();
	}

}
