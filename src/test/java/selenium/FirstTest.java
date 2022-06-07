package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        // 1st approach - setting chrome driver manually.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // 2nd approach - use WebDriverManager library.

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://training.skillo-bg.com:4300/posts/all");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
    }
}
