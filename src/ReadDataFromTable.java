import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromTable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//read data from static table
		WebElement table = driver.findElement(By.id("product"));
        
        // Find all rows in the table
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        // Iterate through each row
        for (WebElement row : rows) {
            // Find all columns (cells) in the row
            java.util.List<WebElement> columns = row.findElements(By.tagName("td"));
            
            // Iterate through each column and print its text content
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }
            System.out.println(); // Move to the next line after printing all columns in a row
        }
        
        //read data from dynamic table
		
        driver.get("http://103.159.183.242:8087/login");
		driver.findElement(By.name("email")).sendKeys("ibirdscpq.qa@ibirds.com");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='login-btn p-2  btn']")).click();
		WebElement tableTwo = driver.findElement(By.xpath("(//table[@class='data-table table table-striped'])[1]"));
		
		// Find all rows in the table
        java.util.List<WebElement> rowsOfSecondTable = tableTwo.findElements(By.tagName("tr"));
        
        // Iterate through each row
        for (WebElement row : rowsOfSecondTable) {
            // Find all columns (cells) in the row
            java.util.List<WebElement> columns = row.findElements(By.tagName("td"));
            
            // Iterate through each column and print its text content
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }
            System.out.println(); // Move to the next line after printing all columns in a row
        }
		
	}

}
