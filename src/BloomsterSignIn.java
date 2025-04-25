import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BloomsterSignIn{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://development.d1zlv4mifgvbiq.amplifyapp.com/");
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
				//driver.close();
				
				//enter email and password then click on sign in button
				driver.findElement(By.name("username")).sendKeys("hanisha.s@ibirdsservices.com");
				driver.findElement(By.name("password")).sendKeys("Vicky@1234");
				driver.findElement(By.cssSelector("button[class='btn-blue btn-login d-block ']")).click();
				Thread.sleep(15000);
				
				//driver.findElement(By.xpath("//h3[normalize-space()='View your enrolled courses']")).click();
				driver.findElement(By.xpath("(//li[@class='position-relative m-0'])[1]")).click();
				//driver.findElement(By.xpath("//span[@class='profileClass']")).click();
			}

}

	


