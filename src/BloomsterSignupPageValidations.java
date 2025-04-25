import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BloomsterSignupPageValidations {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://development.d1zlv4mifgvbiq.amplifyapp.com/signup");
	//driver.manage().window().maximize();
	Thread.sleep(10000);
	
	//blank name entered in first name
	driver.findElement(By.cssSelector("input[name='parentFirstName']")).sendKeys("");
	leftClick();
	Assert.assertEquals(driver.findElement(By.xpath("(//div[contains(text(),'First name is required')])[1]")).getText(), "First name is required");
	
	//numbers entered in last name
	driver.findElement(By.cssSelector("input[name='parentLastName']")).sendKeys("4");
	leftClick();
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Last name can only contain letters')]")).getText(), "Last name can only contain letters");
	
	//wrong email address format entered in email
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kash126@.com");
	leftClick();
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid email address')]")).getText(), "Please enter a valid email address");
	
	//entered existed email 
	driver.findElement(By.cssSelector("input[name='email']")).clear();
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hanisha.s@ibirdsservices.com");
	//leftClick();
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("(//div[contains(text(),'Email already exists')])[1]")).getText(), "Email already exists");
	
	//entered different password and confirm password
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("H@ni1234");
	driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("H@ni1235");
	leftClick();
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Passwords do not match')]")).getText(), "Passwords do not match");
	
	//Entered only 1 digit in password
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("H");
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Password must contain at least 8 characters')]")).getText(), "Password must contain at least 8 characters");
    	
	//entered special character in child first name
	driver.findElement(By.xpath("//input[@name='childFirstName']")).sendKeys("@");
	leftClick();
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'First name can only contain letters')]")).getText(), "First name can only contain letters");
	
	//entered space in child last name
	driver.findElement(By.xpath("//input[@name='childLastName']")).sendKeys(" ");
	leftClick();
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Last name can only contain letters')]")).getText(), "Last name can only contain letters");
	
	//entered current date in date [expected less than two years]
	driver.findElement(By.name("month")).sendKeys("");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("abbr[aria-label='April 3, 2022']")).click();
	Assert.assertEquals(driver.findElement(By.xpath("//p[@class='invalid-feedback']")).getText(), "Your child needs to be 2 years and above to sign up");
	System.out.println(driver.findElement(By.xpath("//p[@class='invalid-feedback']")).getText());
	//click on second check box and sign up button
	driver.findElement(By.xpath("//label[contains(@for,'tnc')]//span[contains(@class,'checkmark')]")).click();
	driver.findElement(By.xpath("(//button[normalize-space()='Sign Up'])[1]")).click();
	
	//state required condition check
	Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='State is required']")).getText(), "State is required");
	
	//parent age condition check 
	Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Please confirm you are 18 years or older']")).getText(), "Please confirm you are 18 years or older");
	}
	
	public static void leftClick() throws AWTException {
		Robot robot = new Robot();
	    // Simulate a left mouse button press and release
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}