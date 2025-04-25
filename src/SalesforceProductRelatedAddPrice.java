import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceProductRelatedAddPrice {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(5000);
		//select product
		driver.findElement(By.cssSelector("a[title='Cooler']")).click();
		Thread.sleep(4000);
		//go to related tab
		driver.findElement(By.cssSelector("a[title='Related'] span[class='title']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down the page
        js.executeScript("window.scrollBy(0, 2000)");
        Thread.sleep(5000);
		//click on new
		driver.findElement(By.xpath("(//div[@title='Add Standard Price'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='input uiInputSmartNumber']")).sendKeys("20000");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[title='Save'] span[class=' label bBody']")).click();
		//driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
