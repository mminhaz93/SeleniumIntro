import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Sets location of the chrome driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                +"/chromedriver");


        // Creates an instance of WebDriver using ChromeDriver
        // Telling selenium to use chrome
        WebDriver driver = new ChromeDriver();

        // opens browser to certain url
        driver.get("https://www.mztech.us");

        // Tells java to wait for 5 second
        Thread.sleep(5000);
        System.out.println("Done...");
    }
}
