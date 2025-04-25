import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SalesforceSignInLead {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ibirdssoftwareservices88-dev-ed.develop.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hanishashivnani1234@gmail.com");
		driver.findElement(By.id("password")).sendKeys("S@lesH@NI01");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(9000);
		
		//click on app launcher
				driver.findElement(By.xpath("(//div[@class='slds-icon-waffle'])[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//lightning-button[@class='slds-button slds-p-horizontal--small'])[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Leads");
				Thread.sleep(2000);
		        driver.findElement(By.xpath("(//mark[normalize-space()='Leads'])[1]")).click();
		        Thread.sleep(7000);
		        driver.findElement(By.xpath("//button[normalize-space()='New']")).click();
		        Thread.sleep(5000);
		        
		        //enter details in new lead
		        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Lalwani");
		        driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("KK");
		        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		        Thread.sleep(2000);
		        driver.navigate().refresh();
		        Thread.sleep(6000);
		        
		        //click on dropdown to select convert
		        driver.findElement(By.xpath("(//li[4]//lightning-button-menu//button//lightning-primitive-icon)[1]")).click();
		        //select convert 
		        driver.findElement(By.xpath("(//a[contains(@role,'menuitem')])[7]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("(//button[normalize-space()='Convert'])[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@title='Close this window']")).click();
		        driver.navigate().refresh();
		        Thread.sleep(3000);             
				        
				//click on app launcher
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[normalize-space()='Sales']")).click();
				//driver.findElement(By.xpath("//button[normalize-space()='View All']")).click();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//mark[normalize-space()='Sales']")).click();
				//driver.findElement(By.xpath("//one-app-launcher-app-tile[3]//div[1]//div[2]//div[1]//a[1]//lightning-formatted-rich-text[1]//span[1]//p[1]//mark[1]")).click();
				Thread.sleep(4000);
				
				//Match Opp
				driver.findElement(By.xpath("//one-app-nav-bar-item-root[3]")).click();
				Thread.sleep(4000);
				WebElement oppTable = driver.findElement(By.xpath("//table[@role='grid']//tbody"));
				String recentOppRecords = oppTable.getText();
		        String expectedOppName = "KK-";
		        Assert.assertEquals(true, recentOppRecords.contains(expectedOppName), "Expected account '" + expectedOppName + "' not found in recent opp records");
		        System.out.println("Opportunity matched");
		       
		        //Match Account
		        driver.findElement(By.xpath("//one-app-nav-bar-item-root[7]")).click();
				Thread.sleep(4000);
				WebElement accountTable = driver.findElement(By.xpath("//table[@role='grid']//tbody"));
				String recentAccountRecords = accountTable.getText();
		        String expectedAccountName = "KK";
		        Assert.assertEquals(true, recentAccountRecords.contains(expectedAccountName), "Expected account '" + expectedAccountName + "' not found in recent account records");
		        System.out.println("Account matched");
		    	
		    	//Match Contact
		        driver.findElement(By.xpath("//one-app-nav-bar-item-root[8]")).click();
				Thread.sleep(4000);
				WebElement conatactTable = driver.findElement(By.xpath("//table[@role='grid']//tbody"));
				String recentContactRecords = conatactTable.getText();
		        String expectedContactName = "Lalwani";
		        Assert.assertEquals(true, recentContactRecords.contains(expectedContactName), "Expected conatact '" + expectedContactName + "' not found in recent conatact records");
		        System.out.println("Contact matched");
	}
}
