import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.concurrent.TimeUnit;

public class RelativeLocatorOnBloomster {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.d3q8d8fs329b3i.amplifyapp.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//below
		//Thread.sleep(5000);
		WebElement FirstName = driver.findElement(By.xpath("//div[@class='input-group']//label[contains(.,'First Name*')]"));
		driver.findElement(with(By.xpath("//input[@id='parentName']")).below(FirstName)).sendKeys("hanisha");
		
		//above
		WebElement LastName = driver.findElement(By.xpath("//input[@name='parentLastName']"));
		System.out.println(driver.findElement(with(By.xpath("(//label)[2]")).above(LastName)).getText());
		
		//rightof
		WebElement email = driver.findElement(By.name("email"));
		driver.findElement(with(By.xpath("(//label)[4]")).toRightOf(email)).click();
		
		//driver.findElement(By.xpath("//label[@for='tnc']//span[@class='checkmark']")).click();
		//driver.findElement(By.xpath("//label[contains(@for,'tnc')]//span[contains(@class,'checkmark')]")).click();
		
		//WebElement signUp = driver.findElement(By.xpath("(//button[normalize-space()='Sign Up'])[1]"));
		//driver.findElement(with(By.xpath("(//button[normalize-space()='Reset'])[1]")).toLeftOf(signUp));
		
		
		WebElement checkbox = driver.findElement(By.xpath("(//label[@class='Selcheckbox Qwrongopton']//span)[4]"));
		System.out.println(driver.findElement(By.xpath("(//label[@class='Selcheckbox Qwrongopton']//span)[4]")).getText());
		driver.findElement(with(By.xpath("//label[contains(@for,'tnc')]//span[contains(@class,'checkmark')]")).toLeftOf(checkbox)).click();
		
	}
}
