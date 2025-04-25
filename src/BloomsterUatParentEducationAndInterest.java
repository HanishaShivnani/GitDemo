import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BloomsterUatParentEducationAndInterest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat.d3q8d8fs329b3i.amplifyapp.com/");
		//enter details
		driver.findElement(By.name("username")).sendKeys("uatuser@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Vicky@1234");
		//click on sign in button
		driver.findElement(By.cssSelector("button[class='btn-blue btn-login d-block ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[normalize-space()='View your enrolled courses']")).click();
		Thread.sleep(3000);
		//click on profile
		driver.findElement(By.xpath("(//li[@class='position-relative m-0'])[1]")).click();
		Thread.sleep(2000);
		//open profile section list
		driver.findElement(By.xpath("//span[@class='profileClass']")).click();
		//select education tab
		driver.findElement(By.xpath("(//li[@class='link active'])[2]")).click();
		
		//click on add education
		driver.findElement(By.xpath("//strong[contains(@class,'ml-auto')]")).click();
		//click on save button
		driver.findElement(By.xpath("//button[@class='btn-blue btn-login d-block mb-5 ']")).submit();
		
		//matching validations
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='School Name is required']")).getText(), "School Name is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Start month is required']")).getText(), "Start month is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Start year is required']")).getText(), "Start year is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='End month is required']")).getText(), "End month is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='End year is required']")).getText(), "End year is required");
		
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Address 1 is required']")).getText(), "Address 1 is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='City is required']")).getText(), "City is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='State is required']")).getText(), "State is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Country is required']")).getText(), "Country is required");
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Zipcode is required']")).getText(), "Zipcode is required");
		
		//filling data
		driver.findElement(By.name("schoolName")).sendKeys("school");
		Thread.sleep(3000);
		downArrow();
        driver.findElement(By.name("schoolName")).sendKeys(Keys.ENTER);
        
        driver.findElement(By.xpath("(//div[@role='combobox'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[normalize-space()='March'])[1]")).click();
        
        driver.findElement(By.xpath("(//div[@role='combobox'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='2023']")).click();
        
        driver.findElement(By.xpath("(//div[@role='combobox'])[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[normalize-space()='January'])[1]")).click();
        //driver.findElement(By.xpath("(//span[normalize-space()='April'])[1]")).sendKeys(Keys.ENTER);
        
        driver.findElement(By.xpath("(//div[@role='combobox'])[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[normalize-space()='2024'])[1]")).click();
        
        //save data 
        driver.findElement(By.xpath("//button[@class='btn-blue btn-login d-block mb-5 ']")).submit();
        
        //Interest part [click on interest tab]
        driver.findElement(By.xpath("(//div[contains(@class,'panel-body d-flex justify-content-between py-1')])[5]")).click();
        driver.findElement(By.xpath("//div[contains(@role,'combobox')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("Music");
        driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Jazz']//*[name()='svg']")).click();
        
        driver.findElement(By.xpath("(//span[normalize-space()='Back'])[1]")).click();
        //click on profile to go interest tab of child
        //driver.findElement(By.xpath("(//li[@class='position-relative m-0'])[1]")).click();
        //driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[5]")).click();
	}
	
	public static void downArrow() throws AWTException {
		// Simulate pressing the down arrow key
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
	}
}