
package com.first.example;
import org.junit.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddFeatureDummy {

	@Test
	
	public void salesforce() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[normalize-space()='Cooler']")).click();
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
	}
	//public AddFeatureDummy() {
        // default constructor
   // }
}
