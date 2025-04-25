import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class php_travels_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		
		//get all links through tagname a
		List<WebElement> links = driver.findElements(By.tagName("a"));

        
		System.out.println("List of links and Title of link on the webpage:");
		
		//print all link name through loop
        for (WebElement link : links) {
            String linkText = link.getText();
            System.out.println(linkText);
        }
        
        int brokenLinkCount = 0;

        // Checking each link for broken status
        System.out.println("Checking links on the webpage:");
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();
                    int statusCode = connection.getResponseCode();
                    if (statusCode >= 400) {
                        System.out.println("Broken link: " + url + " - Status code: " + statusCode);
                        brokenLinkCount++;
                    } else {
                        System.out.println("Working Fine: " + url + " - Status code: " + statusCode);
                    }
                } catch (IOException e) {
                    System.out.println("Error while checking link: " + url + " - " + e.getMessage());
                }
            }
        }

        // Print count of broken links
      System.out.println("Total broken links: " + brokenLinkCount);
	}
}
