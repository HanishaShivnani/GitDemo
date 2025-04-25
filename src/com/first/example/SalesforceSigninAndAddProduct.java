package com.first.example;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;


import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesforceSigninAndAddProduct {

	@SuppressWarnings("deprecation")
	@Test
	//@BeforeClass
	public void salesforcetwo() throws AWTException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("https://ibirdssoftwareservices88-dev-ed.develop.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hanishashivnani1234@gmail.com");
		driver.findElement(By.id("password")).sendKeys("S@lesH@NI01");
		driver.findElement(By.id("Login")).click();
		//Thread.sleep(9000);
		//click on app launcher
		driver.findElement(By.xpath("(//div[@class='slds-icon-waffle'])[1]")).click();
		//Thread.sleep(5000);
		//select salesforce cpq
		driver.findElement(By.xpath("(//p[normalize-space()='Salesforce CPQ'])[1]")).click();
		//driver.findElement(By.cssSelector("button[aria-label='View All Applications']")).click();
		//driver.findElement(By.xpath("(//button[normalize-space()='View All'])[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//p[normalize-space()='Salesforce CPQ'])[1]")).click();
		//Thread.sleep(5000);
		//select products tab
		driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@role='listitem'])[8]")).click();
		//Thread.sleep(3000);
		//click on new 
		driver.findElement(By.xpath("(//div[@title='New'])[1]")).click();
		//Thread.sleep(5000);
		//add product
		WebElement productName =driver.findElement(By.cssSelector("body > div:nth-child(22) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > article:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)"));
		productName.sendKeys("AC");
		driver.findElement(By.cssSelector("body > div:nth-child(22) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > article:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).sendKeys("ac10");
		driver.findElement(By.cssSelector("body > div:nth-child(22) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > article:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down the page
        //js.executeScript("window.scrollBy(0, 1000)");
        driver.findElement(By.xpath("(//a[@role='button'][normalize-space()='--None--'])[2]")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='Allowed']")).click();
        downArrow();
        
        driver.findElement(By.xpath("(//a[@role='button'][normalize-space()='--None--'])[3]")).click();
        driver.findElement(By.cssSelector("a[title='Always']")).click();
        downArrow();
        
        driver.findElement(By.xpath("(//a[@role='button'][normalize-space()='--None--'])[2]")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='Sections']")).click();
        downArrow();
        //save details
        driver.findElement(By.cssSelector("button[title='Save'] span[class=' label bBody']")).click();
       
	}
	@Test
	public void downArrow() throws AWTException {
		// Simulate pressing the down arrow key
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
	}
	//public SalesforceSigninAndAddProduct() {
        // default constructor
   // }
}