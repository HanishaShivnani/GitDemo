import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Wrist Watches");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Analogue']")).click();
        driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
        driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();

        // Get the fifth element from the search results
        WebElement fifthElement = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[5]"));
        
        WebElement nameElement = fifthElement.findElement(By.xpath(".//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        nameElement.getText();
        
        WebElement priceElement = fifthElement.findElement(By.xpath(".//span[@class='a-price-whole']"));	
        priceElement.getText();
        
        // Print the fifth element text
        System.out.println("Name of Product=> " + nameElement.getText());
        System.out.println("Price of Product=> " + priceElement.getText());
        
	}

}
