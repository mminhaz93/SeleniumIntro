# Selenium Intro

#### Steps:
1. Create a java project
2. Download - https://www.selenium.dev/downloads/ (Java)
3. Add selenium libraries/dependencies 
    3.1 File -> Project Structure -> libraries -> + and select all jar files -> apply
4. Update main.java
```java
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

```

Important links
- Tutorial - https://www.guru99.com/selenium-tutorial.html
- Selenium libs - https://www.selenium.dev/downloads/
- Chromedriver - https://chromedriver.chromium.org/downloads