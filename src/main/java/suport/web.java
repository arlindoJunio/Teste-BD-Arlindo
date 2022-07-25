package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class web {

	public static WebDriver createChrome(){
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.get("https://demoqa.com/login");

		return browser;
	}
}
