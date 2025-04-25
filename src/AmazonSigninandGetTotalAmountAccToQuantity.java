import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSigninandGetTotalAmountAccToQuantity {

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
		
		//Increase quantity
		driver.findElement(By.xpath("//div/span/span/span/span/span[1]")).click();
		driver.findElement(By.id("quantity_3")).click();
		Thread.sleep(1000);
		
		//count before delete items in the car
		WebElement cartCountElement = driver.findElement(By.id("nav-cart-count"));
        String cartCountText = cartCountElement.getText();
        int cartItemCount = Integer.parseInt(cartCountText);
        System.out.println("Number of items in the cart: " + cartItemCount);
        Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Delete']")).click();
		Thread.sleep(2000);
		
		//count after delete items in the cart
        WebElement cartCountElement2 = driver.findElement(By.id("nav-cart-count"));
        String cartCountText2 = cartCountElement2.getText();
        int cartItemCount2 = Integer.parseInt(cartCountText2);
        System.out.println("Number of items in the cart: " + cartItemCount2);
        //WebElement quantityElement = itemElement.findElement(By.xpath("(//span[normalize-space()='2'])[1]"));
        //WebElement quantityCount= driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'][normalize-space()='1'])"));
        
        
        List<WebElement> quantityInCart = driver.findElements(By.xpath("//span[@class='a-dropdown-prompt']"));
        //int quantity = Integer.parseInt(quantityInCart.getText());
        int qtyArray[] = new int[100];
        int i=0;
        for (WebElement quantity : quantityInCart) {
        	qtyArray[i] = Integer.parseInt(((WebElement) quantity).getText());
        	i++;
        }
        
        // Get the prices of the products in the cart
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
        //System.out.println(prices.getText());
        double totalPrice = 0.0;
        i=0;
        for (WebElement price : prices) {
        	//System.out.println(price.getText());
            String priceText = price.getText().replaceAll("[^0-9.]", ""); // Remove non-numeric characters
            double productPrice = Double.parseDouble(priceText)*qtyArray[i];
            totalPrice += productPrice;
           // System.out.println("Total qty in array " + qtyArray[i] + " and amount in array $" + totalPrice);
            i++;
        }

        // Print the total amount
//        System.out.println("Quantity of products in the cart: " + qtyArray);
        System.out.println("Total amount of all products in the cart: $" + totalPrice);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*List<WebElement> productElements = driver.findElements(By.xpath("//div[@class='sc-list-item-content']"));

        double totalAmount = 0.0;
     // Get the prices of the products in the cart
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));
        for(WebElement we : prices)
        int i = 0;

        // Iterate over each product in the cart
        for (WebElement productElement : productElements) {
        	System.out.println("productElement " + productElement.getText());
            // Extract quantity
            WebElement quantityElement = productElement.findElement(By.xpath(".//span[@class='a-dropdown-prompt']"));
            int quantity = Integer.parseInt(quantityElement.getText());
            System.out.println("quantity " + quantity);

            // Extract price
            WebElement priceElement = (WebElement) driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
           
            System.out.println(prices.size() + "priceElement " + prices.get(i).getText());
            String priceText = prices.get(i).getText().replaceAll("[^0-9.]", ""); // Remove non-numeric characters
            double price = Double.parseDouble(priceText);
            System.out.println("price " + price);
            i = i + 2;

            // Calculate total price for this product
            double totalPrice = quantity * price;
            System.out.println("totalPrice " + totalPrice);

            // Add total price to the overall total amount
            totalAmount += totalPrice;
            System.out.println("totalAmount " + totalAmount);
        }

        // Print the total amount
        System.out.println("Total amount of all items in the cart: $" + totalAmount);

        
        
        
        
        
        
        
        
        
        
        
        
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
        int totalAmount = 0;
        //Iterate over price elements
        double quantity = 1;
        for (WebElement priceElement : priceElements) {
            // Extract price text
        	WebElement quantityElement= driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'][normalize-space()='1'])"));
        	
        	try {
        		System.out.println("before quantity "+quantityElement.getText());
                quantity = Integer.parseInt(quantityElement.getAttribute("value"));
                System.out.println("after quantity "+quantity);
            } catch (NumberFormatException e) {
                // Handle if quantity is not a valid integer
                e.printStackTrace();
            }
        	
            String priceText = priceElement.getText();
            // Remove currency symbol and commas, then convert to numerical value
            double price = Double.parseDouble(priceText.replaceAll("[^\\d.]", ""));
            price = price * quantity;
            System.out.println("Total quantity of all items in Amazon cart: " + quantity);
            // Add price to total amount
            totalAmount = (int) (totalAmount + price);
        }
        WebElement priceElement = (WebElement) driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
        String priceText = priceElement.getText().replaceAll("[^0-9.]", ""); // Remove non-numeric characters
        double price = Double.parseDouble(priceText);

        
		// Calculate total price for this item
        double totalPrice = quantity * price;
        
        // Add total price to the overall total amount
        totalAmount += totalPrice;
        // Print total amount
        System.out.println("Total amount of all items in Amazon cart: " + totalAmount);
        
        
        
        
        
        List<WebElement> itemElements = driver.findElements(By.xpath("//div[@class='s-result-item']"));
        List<WebElement> itemElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
        double totalAmount = 0.0;

        // Iterate over each item
        for (WebElement itemElement : itemElements) {
            // Extract quantity (if available)
            WebElement quantityElement = itemElement.findElement(By.xpath(".//input[@type='text']"));
            int quantity = 1; // Default to 1 if quantity not found
            try {
                quantity = Integer.parseInt(quantityElement.getAttribute("value"));
            } catch (NumberFormatException e) {
                // Handle if quantity is not a valid integer
                e.printStackTrace();
            }
            
            // Extract price
            WebElement priceElement = itemElement.findElement(By.xpath(".//span[@class='a-price']"));
            String priceText = priceElement.getText().replaceAll("[^0-9.]", ""); // Remove non-numeric characters
            double price = Double.parseDouble(priceText);

            // Calculate total price for this item
            double totalPrice = quantity * price;
            
            // Add total price to the overall total amount
            totalAmount += totalPrice;
        }

        // Print the total amount
        System.out.println("Total amount of all items: $" + totalAmount);*/
	}
}
