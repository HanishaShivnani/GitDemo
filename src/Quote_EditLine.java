import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quote_EditLine {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

		driver.get("https://ibirdssoftwareservices88-dev-ed.develop.my.salesforce.com/");
		
		//login in salesforce
		driver.findElement(By.id("username")).sendKeys("hanishashivnani1234@gmail.com");
		driver.findElement(By.id("password")).sendKeys("S@lesH@NI01");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(7000);
		//click on app launcher
		driver.findElement(By.xpath("(//div[@class='slds-icon-waffle'])[1]")).click();
		Thread.sleep(5000);
		//select salesforce cpq
		driver.findElement(By.xpath("(//p[normalize-space()='Salesforce CPQ'])[1]")).click();
		Thread.sleep(5000);
		//select quote tab
		driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@role='listitem'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Q-00000'])[1]")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Q-00000']")).click();
		Thread.sleep(5000);
		//driver.navigate().refresh();
		driver.findElement(By.xpath("(//li[4]//lightning-button-menu//button//lightning-primitive-icon)[1]")).click();
		//driver.findElement(By.xpath("(//li[4]//lightning-button-menu//button//lightning-primitive-icon)[1]")).click();
		driver.findElement(By.xpath("(//a[contains(@role,'menuitem')])[10]")).click();
		Thread.sleep(9000);
		
		//System.out.println(driver.findElement(By.tagName("iframe")));
		//WebElement iframeElement = driver.findElement(By.name("vfFrameId_1713854745912"));
		//driver.switchTo().frame(iframeElement);

		//driver.switchTo().frame();
		//WebElement addProduct = driver.findElement(By.xpath("//*[@id=\"mainButton\"]"));
		//addProduct.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='accessibility title']")));
		Thread.sleep(5000);
		//WebElement addProduct = driver.findElement(By.xpath("//sb-custom-action[@name='Add Products']"));
		//addProduct.click();
		
		/*root1
		WebElement root1 = driver.findElement(By.tagName("sb-page-container"));
		//Get shadow root element
		WebElement shadowRoot1 = expandRootElement(root1);
				
		//root2
		WebElement root2 = shadowRoot1.findElement(By.cssSelector("sb-line-editor"));
		WebElement shadowRoot2 = expandRootElement(root2);

		//root3
		WebElement root3 = shadowRoot2.findElement(By.cssSelector("sb-page-header"));
		WebElement shadowRoot3 = expandRootElement(root3);
		
		//root4
		WebElement root4 = shadowRoot3.findElement(By.cssSelector("sb-custom-action"));
		WebElement shadowRoot4 = expandRootElement(root4);
		
		WebElement actualButton = shadowRoot4.findElement(By.xpath("//*[@id=\"mainButton\"]"));
		actualButton.click();
		
	
	
	
	public WebElement expandRootElement(WebElement element) {
		JavascriptExecutor driver = null;
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",element);
		return ele;
		*/
	}
	
}
