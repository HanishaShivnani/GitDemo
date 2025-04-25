import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleAutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//enter Hanisha [name]
		driver.findElement(By.name("enter-name")).sendKeys("Hanisha");
		
		//click on alert button to show alert message 
		driver.findElement(By.id("alertbtn")).click();
		
		//get text of alert and print in console
		System.out.println( driver.switchTo().alert().getText());
		
		//accept alert means OK to alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//click on confirm button for another alert message 
		driver.findElement(By.id("confirmbtn")).click();
		
		//get text of alert and print in console
		System.out.println( driver.switchTo().alert().getText());
		
		//cancel alert means reject the alert msg 
		driver.switchTo().alert().dismiss();
		
	}

}
