import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BloomsterLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fingow.in/sandbox/admin/login");
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.linkText("Forgot password?")).getText());
		driver.findElement(By.linkText("Forgot password?")).click();
		
	}

}
