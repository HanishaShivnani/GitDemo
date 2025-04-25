import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupBloomster {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://development.d1zlv4mifgvbiq.amplifyapp.com/signup");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//Scroll down the page by pixel
		//JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0, 10000)");
		
		driver.findElement(By.cssSelector("input[name='parentFirstName']")).sendKeys("hanisha");
		driver.findElement(By.cssSelector("input[name='parentLastName']")).sendKeys("shivnani");
		driver.findElement(By.xpath("//input[@id='rc_select_0']")).sendKeys("California");
		driver.findElement(By.xpath("//input[@id='rc_select_0']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//span[contains(@class,'checkmark')])[1]")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kash1285673@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("H@ni1234");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("H@ni1234");
		driver.findElement(By.xpath("//input[@name='childFirstName']")).sendKeys("siya");
		driver.findElement(By.xpath("//input[@name='childLastName']")).sendKeys("Shivnani");
		driver.findElement(By.name("month")).sendKeys("");
		Thread.sleep(2000);  
		driver.findElement(By.cssSelector("abbr[aria-label='April 3, 2022")).click();
		driver.findElement(By.xpath("//label[contains(@for,'tnc')]//span[contains(@class,'checkmark')]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Sign Up'])[1]")).click();
	}

}
