import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//this code is not working
//this code is not working
//this code is not working




public class FeedbackAlertHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://development.d1zlv4mifgvbiq.amplifyapp.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.findElement(By.name("username")).sendKeys("jyoti@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Vicky@1234");
		driver.findElement(By.cssSelector("button[class='btn-blue btn-login d-block ']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//li[@class=' ']//span[@class='d-flex']//*[name()='svg']")).click();
		driver.findElement(By.xpath("(//div[@class='rs-stack-item'])[1]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Once a fortnight'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='barClassName rs-slider-bar'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='barClassName rs-slider-bar'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='barClassName rs-slider-bar'])[3]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		//Thread.sleep(2000);
		
		System.out.println( driver.switchTo().alert().getText());
		
	}

}
