import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchProductandADDTOCART {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/signin");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//sign in in amazon with credentials
		driver.findElement(By.name("email")).sendKeys("7627041741");
		driver.findElement(By.name("password")).sendKeys("Am@zH@NI");
		driver.findElement(By.id("signInSubmit")).click();
		
		//extra step for signin
		driver.findElement(By.id("inbContinueWithPersonalAccount")).click();
		Thread.sleep(2000);
		
		//enter text to search in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("comb");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(),'Nat Habit Kacchi Neem Wooden Comb - Soaked In 17 H')]")).click();
		Thread.sleep(3000);
		
		//move to next tab where product is showing
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		
	      //switch to open tab
	      driver.switchTo().window(w.get(1));
	      
	      //driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	      //driver.findElement(By.name("submit.add-to-cart")).click();
	      
	      //click on add to cart button
	      driver.findElement(By.id("add-to-cart-button")).click();
	      driver.findElement(By.id("nav-cart")).click();
	      Thread.sleep(3000);
	      
	      //click on product and increase quantity of that product
	      driver.findElement(By.xpath("//div/span/span/span/span/span[1]")).click();
		  driver.findElement(By.id("quantity_3")).click();
	}

}
