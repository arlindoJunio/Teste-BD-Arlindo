package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class LoginPage extends BasePage {
	public LoginPage(WebDriver browser) {
		super(browser);
	}

	public void click_register(){
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newUser")));
		browser.findElement(By.id("newUser")).click();
	}

	public void insert_username(String username){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
		WebElement element = browser.findElement(By.id("userName"));
		element.sendKeys(username);
	}

	public void insert_password(String password){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		WebElement element = browser.findElement(By.id("password"));
		element.sendKeys(password);
	}

	public void click_login(){
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
		browser.findElement(By.id("login")).click();
	}
}
