import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class GoogleAssignment {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Robot rob= new Robot();
		//rob.keyPress(KeyEvent.VK_CONTROL);
	
		driver.switchTo().newWindow(WindowType.TAB);
        
        // Switch to the new tab
        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);
        
        // Open Gmail.com in the new tab
        driver.get("https://accounts.google.com/signin");
        
        // enter email and password
        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("hanisha.s@ibirdsservices.com");
        emailInput.sendKeys(Keys.RETURN);
        Thread.sleep(6000);
        WebElement passwordInput = driver.findElement(By.name("Passwd"));
        passwordInput.sendKeys("H@NIiBIRDS01");
        passwordInput.sendKeys(Keys.RETURN);
        
        Thread.sleep(4000);
        Thread.sleep(5000);
      
        //Actions actions = new Actions(driver);
        //Thread.sleep(5000);
        //if (System.getProperty("os.name").toLowerCase().contains("mac")) {
        //    actions.keyDown(Keys.COMMAND).sendKeys("t").keyUp(Keys.COMMAND).perform();
        //} else {
          //  actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
        //}

        // Wait for a while to see the effect
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     //   actions.sendKeys(Keys.CONTROL).perform();
       // actions.keyDown(Keys.CONTROL).sendKeys("T").perform();
        //actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
        
        driver.switchTo().newWindow(WindowType.TAB);
        String newTab2 = driver.getWindowHandles().toArray()[2].toString();
        driver.switchTo().window(newTab2);
        
        // Open Gmail.com in the new tab
        driver.get("https://www.gmail.com");
        
        // Switch back to the Google tab
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        
        // Now enter some keywords in the Google search box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("flower");
        searchBox.sendKeys(Keys.RETURN);
       
        // Close the browser
        //driver.quit();	        
	        
	       
	    //another approach which is working
	    //((JavascriptExecutor) driver).executeScript("window.open()");
	        

	}

}
