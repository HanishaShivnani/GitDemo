import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceQuote {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ibirdssoftwareservices88-dev-ed.develop.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hanishashivnani1234@gmail.com");
		driver.findElement(By.id("password")).sendKeys("S@lesH@NI012");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(7000);
		//click on app launcher
		driver.findElement(By.xpath("(//div[@class='slds-icon-waffle'])[1]")).click();
		Thread.sleep(5000);
		//select salesforce cpq
		driver.findElement(By.xpath("(//p[normalize-space()='Salesforce CPQ'])[1]")).click();
		Thread.sleep(5000);
		//select quote tab
		driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@role='listitem'])[4]")).click();
		Thread.sleep(5000);
		//Click on new
		driver.findElement(By.cssSelector("div[title='New']")).click();
		Thread.sleep(8000);
		//click on opportunity search bar
		WebElement opp= driver.findElement(By.xpath("//input[@placeholder='Search Opportunities...']"));
		opp.sendKeys("KK");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul//lightning-base-combobox-item")).click();
		
		//click on account search bar
		WebElement acc= driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']"));
		acc.sendKeys("KK");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul//lightning-base-combobox-item")).click();
		Thread.sleep(2000);
		//save details
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
