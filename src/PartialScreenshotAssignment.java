import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshotAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.d3q8d8fs329b3i.amplifyapp.com/signup");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//Scroll down the page by pixel
		//JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0, 10000)");
		
		//enter all details of form
		WebElement name= driver.findElement(By.cssSelector("input[name='parentFirstName']"));
		name.sendKeys("Hanisha");
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File ("firstname.png"));
	}

}
