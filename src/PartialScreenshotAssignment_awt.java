import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshotAssignment_awt {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");

        // Initialize ChromeDriver and open the link
        WebDriver driver = new ChromeDriver();
        driver.get("https://uat.d3q8d8fs329b3i.amplifyapp.com/signup");
        Thread.sleep(7000);
        driver.manage().window().maximize();

        // Wait for the page to load (you may need to add appropriate waits here)
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Define the area for the checkbox
        // Adjust the coordinates according to the position of the checkbox on the screen
        int x = 305; // X-coordinate of the top-left corner of the checkbox
        int y = 289; // Y-coordinate of the top-left corner of the checkbox
        int width = 300; // Width of the checkbox
        int height = 180; // Height of the checkbox

        try {
            // Create a Robot object
            Robot robot = new Robot();

            // Capture the screenshot
            BufferedImage screenshot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            // Crop the screenshot to the area of the checkbox
            BufferedImage partialScreenshot = screenshot.getSubimage(x, y, width, height);
            
            // Save the partial screenshot to a file
            File partialFile = new File("partialScreenshot.png");
            ImageIO.write(partialScreenshot, "png", partialFile);

            System.out.println("Partial screenshot saved to: " + partialFile.getAbsolutePath());
        } catch (AWTException | IOException ex) {
            ex.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}