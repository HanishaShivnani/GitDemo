import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BloomsterChildInterest {

	//not working
	//not working
	//not working
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat.d3q8d8fs329b3i.amplifyapp.com/");
		
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
		driver.findElement(By.xpath("//span[@class='profileClass']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='link active'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='profilecategory'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='profilecategory'])[2]")).click();
		//driver.findElement(By.xpath("(//a[contains(@activeclassname,'selectedActive')][normalize-space()='Interests'])[2]")).click();
		//driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[5]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page
        js.executeScript("window.scrollBy(0, 1200)");
		driver.findElement(By.cssSelector("div[id='section_0'] div:nth-child(5)")).click();
		//driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(7) > span:nth-child(1)")).click();
		
	}
}
