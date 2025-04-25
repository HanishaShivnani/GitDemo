import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class mail_assignment {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedSubject = "Test Mail";
        String expectedBody = "Test Email Body";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        // enter email and password
        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("hanisha.s@ibirdsservices.com");
        emailInput.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        WebElement passwordInput = driver.findElement(By.name("Passwd"));
        passwordInput.sendKeys("H@NIiBIRDS#012");
        passwordInput.sendKeys(Keys.RETURN);
        Thread.sleep(10000);
        driver.get("https://www.gmail.com");
        Thread.sleep(6000);
        
        Thread.sleep(5000);
	  
	    driver.get("https://mail.google.com/mail/u/0/#inbox?compose=new");
	    Thread.sleep(5000);
	    
	    // Enter recipient
	    WebElement to = driver.findElement(By.xpath("(//span[normalize-space()='To'])"));
	    driver.findElement(with(By.tagName("input")).toRightOf(to)).sendKeys("hanisha.s@ibirdsservices.com");
	    
	    // Enter subject
	    WebElement subjectInput = driver.findElement(By.cssSelector("input[name='subjectbox']"));
	    subjectInput.sendKeys("Test Mail");
	
	    // Enter body
	    WebElement bodyInput = driver.findElement(By.cssSelector(".editable"));
	    bodyInput.sendKeys("Test Email Body");
	    Thread.sleep(3000);
	    
	    WebElement moreOptionsButton = driver.findElement(By.xpath("//div[@aria-label='More options']"));
        moreOptionsButton.click();
	    
        Thread.sleep(3000);
        
        WebElement labelOption = driver.findElement(By.xpath("//div[text()='Label']"));
        labelOption.click();
        
        Thread.sleep(3000);
        
        WebElement socialLabel = driver.findElement(By.xpath("//div[text()='Social']"));
        socialLabel.click();

        Thread.sleep(2000);
       
	    Thread.sleep(4000);
	    //send email
	    driver.findElement(By.xpath("//div[@class='dC']//div[1][text()='Send']")).click();
	    //driver.findElement(By.xpath("//div[text()='Send']")).click();
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title, 'Inbox')]"))).click();
	    
        driver.findElement(By.xpath("//a[normalize-space()='Inbox']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("(//td[@class='apU xY'])[1]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//tbody//tr//td[5])[1]")).click();
       
        Thread.sleep(4000);
          
        WebElement subjectElement = driver.findElement(By.cssSelector("h2.hP"));
        String subject = subjectElement.getText();
        if (subject.equals(expectedSubject)) {
            System.out.println("Subject is verified successfully: " + subject);
        } else {
            System.out.println("Subject verification failed. Expected: " + subjectInput + ", but got: " + subject);
        }

        // Verify the body
        WebElement bodyElement = driver.findElement(By.xpath("(//div[@class='gs']//div[3]//div//div)[2]"));
        String body = bodyElement.getText();
        if (body.contains(expectedBody)) { // Using contains because the body might have extra text (e.g., signatures)
            System.out.println("Body is verified successfully: " + body);
        } else {
            System.out.println("Body verification failed. Expected to contain: " + expectedBody + ", but got: " + body);
        }

        // Verify the label
        driver.navigate().back(); // Go back to the inbox
        Thread.sleep(2000); // Wait for the inbox to load

        WebElement socialLabel1 = driver.findElement(By.xpath("//a[normalize-space()='Social']"));
        socialLabel1.click();

        Thread.sleep(2000); // Wait for the social tab to load

        boolean emailFound = driver.findElements(By.xpath("//span[contains(text(), '" + expectedSubject + "')]")).size() > 0;
        if (emailFound) {
            System.out.println("Email verification under 'Social' label is successful.");
        } else {
            System.out.println("Email verification under 'Social' label failed.");
        }
	}

}
