import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_The_Flight_assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		 System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
//	        FirefoxOptions options = new FirefoxOptions();
//	        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//	        WebDriver driver = new FirefoxDriver(options);
		
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize(); 
	     driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
         driver.get("https://www.goibibo.com/");
            
            driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
            //driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
            
            //enter flight from 
            WebElement fromCityInput = driver.findElement(By.xpath("(//div[@class='sc-12foipm-2 eTBlJr fswFld '])[1]"));
            fromCityInput.click();
            
            WebElement fromCityInput2 = driver.findElement(By.xpath("//input[@type='text']"));
            fromCityInput2.sendKeys("mumbai");
            Thread.sleep(1000);
            fromCityInput2.sendKeys(Keys.ENTER);
            
            //enter flight to 
            WebElement toCityInput2 = driver.findElement(By.xpath("//input[@type='text']"));
            toCityInput2.sendKeys("Bengaluru");
            Thread.sleep(1000);
            toCityInput2.sendKeys(Keys.ENTER);
            
            WebElement date = driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']"));
            date.click();
            
            driver.findElement(By.xpath("//div[@aria-label='Sat Jul 20 2024']//p[@class='fsw__date'][normalize-space()='20']")).click();
            driver.findElement(By.xpath("//span[@class='sc-12foipm-72 ezNmSh']")).click();
            
            // Wait for the page to load
           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
	}

}
