import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceProductRelatedAddFeatures {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ibirdssoftwareservices88-dev-ed.develop.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hanishashivnani1234@gmail.com");
		driver.findElement(By.id("password")).sendKeys("S@lesH@NI01");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(7000);
		//click on app launcher
		driver.findElement(By.xpath("(//div[@class='slds-icon-waffle'])[1]")).click();
		Thread.sleep(5000);
		//select salesforce cpq
		driver.findElement(By.xpath("(//p[normalize-space()='Salesforce CPQ'])[1]")).click();
		Thread.sleep(5000);
		//select product tab
		driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@role='listitem'])[8]")).click();
		Thread.sleep(3000);
		//select product
		driver.findElement(By.cssSelector("a[title='Cooler']")).click();
		Thread.sleep(2000);
		//go to related tab
		driver.findElement(By.cssSelector("a[title='Related'] span[class='title']")).click();
		Thread.sleep(3000);
		//click on new
		driver.findElement(By.xpath("(//div[@title='New'][normalize-space()='New'])[5]")).click();
		Thread.sleep(3000);
		//add details
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Swing");
		driver.findElement(By.xpath("//input[@name='SBQQ__Number__c']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='SBQQ__MaxOptionCount__c']")).sendKeys("5");
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-truncate'][normalize-space()='Dynamic'])[1]")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	
		//driver.findElement(By.xpath("//div[@class='slds-grid slds-size_1-of-1 label-stacked undo']//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']")).click();
		//driver.findElement(By.xpath("(//div[@class='slds-form-element__control'])[5]")).click();
		//driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Software']")).click();
		//driver.findElement(By.xpath("(//span[@class='slds-truncate'][normalize-space()='Hardware'])[1]")).sendKeys(Keys.ENTER);
		//Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_DOWN);
       // robot.keyRelease(KeyEvent.VK_DOWN);
        //driver.findElement(By.xpath("(//span[@class='slds-truncate'][normalize-space()='Hardware'])[1]")).sendKeys(Keys.ENTER);
		//Robot robot = new Robot();
	    // Simulate a left mouse button press and release
	    ///robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    //robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);	
	}
}
