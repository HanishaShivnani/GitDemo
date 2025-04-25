import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://development.d1zlv4mifgvbiq.amplifyapp.com/");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            // Save the screenshot to local system [important - add locaion where the ss will added but also add screenshot name(here main is screenshot name) which we need to give here]
        	
        	FileHandler.copy(screenshotFile,new File("C:\\Users\\Admin\\Pictures\\Screenshots\\main.png"));
            System.out.println("Screenshot saved successfully.");
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
	}

}
