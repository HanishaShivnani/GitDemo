import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceProductRelatedAddOptions {

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
		Thread.sleep(3000);
		//select product
		driver.findElement(By.cssSelector("a[title='Cooler']")).click();
		Thread.sleep(2000);
		//go to related tab
		driver.findElement(By.cssSelector("a[title='Related'] span[class='title']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down the page
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(3000);
		//click on new
		driver.findElement(By.xpath("(//div[@title='New'][normalize-space()='New'])[7]")).click();
		Thread.sleep(5000);
		//data fill
		driver.findElement(By.xpath("//input[@name='SBQQ__Number__c']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@placeholder='Search Products...']")).sendKeys("Refrigerator");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='slds-listbox__item'])[1][.='RefrigeratorRef']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Product Features...']")).sendKeys("Swing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='slds-listbox__item'])[1][.='Swing']")).click();
		Thread.sleep(2000);
	
        
        //WebElement scrollbar2 = (WebElement) js.executeScript("return document.getElementById('scrollbar2')");
        //js.executeScript("arguments[0].scrollDown = 1000;", scrollbar2);
        
        ///WebElement scrollbar = driver.findElement(By.xpath("//div[@class='ps-scrollbar-y']"));

       // JavascriptExecutor js2 = (JavascriptExecutor) driver;
        //Scroll down the page
        //js2.executeScript("window.scrollBy(0, 400)", scrollbar);
        // Scroll the scrollbar element
        //JavascriptExecutor js2 = (JavascriptExecutor) driver;
        //js2.executeScript("arguments[0].scrollBy(0, 900);", scrollbar); // Scroll 500 pixels down
        
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		//driver.findElement(By.cssSelector("div[data-target-selection-name='sfdc:RecordField.SBQQ__ProductOption__c.SBQQ__AppliedImmediately__c'] span[class='slds-checkbox_faux']")).click();
	}

}
