import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSignInFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/signin");
		Thread.sleep(10000);
		//sign in with credentials
		driver.findElement(By.name("email")).sendKeys("7627041741");
		driver.findElement(By.name("password")).sendKeys("Am@zH@NI");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("inbContinueWithPersonalAccount")).click();
		Thread.sleep(2000);
		
		//click on cart to open cart page
		driver.findElement(By.id("nav-cart")).click();
		
		//uncheck checkbox of first item
		//driver.findElement(By.className("a-icon a-icon-checkbox")).click();
		
		//Increase quantity [code shifted to another class]
		//driver.findElement(By.xpath("//div/span/span/span/span/span[1]")).click();
		//driver.findElement(By.id("quantity_3")).click();
		//Thread.sleep(1000);
		
		//count before delete items in the car
		WebElement cartCountElement = driver.findElement(By.id("nav-cart-count"));
        String cartCountText = cartCountElement.getText();
        int cartItemCount = Integer.parseInt(cartCountText);
        System.out.println("Number of items in the cart: " + cartItemCount);
        Thread.sleep(2000);
        
        //delete product
		//driver.findElement(By.name("submit.delete.2cce28ca-0a7c-4ac5-8601-e21ac6261a1d")).click();
		Thread.sleep(2000);
		
		//count after delete items in the cart
        WebElement cartCountElement2 = driver.findElement(By.id("nav-cart-count"));
        String cartCountText2 = cartCountElement2.getText();
        int cartItemCount2 = Integer.parseInt(cartCountText2);
        System.out.println("Number of items in the cart: " + cartItemCount2);
        //WebElement quantityElement = itemElement.findElement(By.xpath("(//span[normalize-space()='2'])[1]"));
        //WebElement quantityCount= driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'][normalize-space()='1'])"));
        
        WebElement quantityInCart = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
        int quantity = Integer.parseInt(quantityInCart.getText());
       // System.out.println(quantity);
        // Get the prices of the products in the cart
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
        //System.out.println(prices.getText());
        double totalPrice = 0.0;
        for (WebElement price : prices) {
        	//System.out.println(price.getText());
            String priceText = price.getText().replaceAll("[^0-9.]", ""); // Remove non-numeric characters
            double productPrice = Double.parseDouble(priceText);
            totalPrice += productPrice;
        }

        // Print the total amount
        System.out.println("Quantity of products in the cart: " + quantity);
        System.out.println("Total amount of all products in the cart: $" + totalPrice);
	}

}
