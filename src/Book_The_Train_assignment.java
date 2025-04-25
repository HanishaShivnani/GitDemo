import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Book_The_Train_assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		 

		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		// Step 1: Open the Goibibo website
		driver.get("https://www.goibibo.com/");

		// Maximize the browser window
		driver.manage().window().maximize();

		//close other advertisement popups
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		//driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();

		//switch to train tab
		driver.findElement(By.xpath("//span[normalize-space()='Trains']")).click();
		
		//enter source name
		WebElement from= driver.findElement(By.xpath("//p[normalize-space()='Enter Source Name']"));
		from.click();
		WebElement fromCityInput = driver.findElement(By.xpath("//input[@type='text']"));
        fromCityInput.sendKeys("ajmer");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Ajmer - All Stations']")).click();
		
        //enter desrination name
        WebElement to= driver.findElement(By.xpath("//p[normalize-space()='Enter Destination Name']"));
		to.click();
		WebElement toCityInput2 = driver.findElement(By.xpath("//input[@type='text']"));
        toCityInput2.sendKeys("jaipur");
        driver.findElement(By.xpath("//span[normalize-space()='Jaipur - All Stations']")).click();
        
        //enter date
        driver.findElement(By.xpath("(//p[@class='styles_dayCmp__calDate__heiRT'][normalize-space()='3'])[1]")).click();
		
        //click on search
        driver.findElement(By.xpath("//span[@class='styles_FswSearchCta__Tf7s4']")).click();
        
        //fill other details 
        driver.findElement(By.xpath("//label[normalize-space()='Show AC only']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='General']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the scrollable section to be visible
        WebElement scrollableSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Filters_App__Z5yQg.Filters_ScrollStyle__5GeAr")));

        // Use JavaScript to scroll the specific section
        JavascriptExecutor js2 = (JavascriptExecutor) driver;

        // Scroll down 100 pixels within the scrollable section
        js2.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 300;", scrollableSection);
       
        //select 2AC 
        driver.findElement(By.xpath("//label[normalize-space()='2A - AC 2 Tier Sleeper']")).click();
        
        //select train ticket
        driver.findElement(By.xpath("(//div[@class='TrainCard_trnCrd__clsCnt__5EEE3'])[1]")).click();
        
        //enter details
        driver.findElement(By.xpath("//input[@id='IRCTC_Username']")).sendKeys("hanisha");
        driver.findElement(By.xpath("(//p[@class='AppButton_btnTxt___XIxq styles_mainCnt__vldtBtnTxt__zpEFn rubik400'])[1]")).click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);"); 
        
        driver.findElement(By.xpath("(//button[@class='AppButton_btnStyle__HmavT styles_card__ctaBtn__4a2Hr rubik400 '])[1]")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("user_name")).sendKeys("hanisha");
        driver.findElement(By.xpath("//input[@id='user_age']")).sendKeys("22");
        driver.findElement(By.xpath("//label[@for='Female']")).click();
        
       driver.findElement(By.xpath("//p[@class='AppButton_btnTxt___XIxq ModalWrap_ftrCtaTxt__C_9v1']")).click();
       
       JavascriptExecutor js3 = (JavascriptExecutor) driver;
       js3.executeScript("window.scrollBy(0, 700);"); 
       
       
       WebElement yes= driver.findElement(By.xpath("(//p[contains(text(),'Zero cancellation charges when the ticket is cance')])[1]"));
       yes.click();
       
       driver.findElement(By.xpath("//input[@id='contact_no']")).sendKeys("9687545236");
       
       driver.findElement(By.xpath("(//p[@class='AppButton_btnTxt___XIxq styles_mainCmp__payBtnTxt__LjNy6 rubikMedium'])[1]")).click();
	}

}
