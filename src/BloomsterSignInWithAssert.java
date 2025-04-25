import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import dev.failsafe.internal.util.Assert;

//import static org.testng.Assert.*;
//import org.testng.Asserts;



public class BloomsterSignInWithAssert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://development.d1zlv4mifgvbiq.amplifyapp.com/");
		
		
		
		driver.findElement(By.xpath("//li[normalize-space()='Sign In']")).click();
		driver.findElement(By.name("username")).sendKeys("eza123@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Vicky@1234");
		driver.findElement(By.cssSelector("button[class='btn-blue btn-login d-block ']")).click();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("//form/div/p[1]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//form/div/p[1]")).getText(), "You have entered incorrect Email/Username or Password");
		//Thread.sleep(5000);
		//System.out.println(driver.findElement(By.className("text-danger")).getText());
		//org.testng.Assert.assertEquals(driver.findElement(By.className("text-danger")).getText(), "You have entered an  Email/Username or Password");
		//org.testng.Assert.assertEquals(false, null);
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("tanu");
		
	}

}
