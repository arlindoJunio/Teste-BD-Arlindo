package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class UserPage extends BasePage{

	public UserPage(WebDriver browser) {
		super(browser);
	}

	public void insert_first_name (String firstname){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
		WebElement element = browser.findElement(By.id("firstname"));
		element.sendKeys(firstname);
	}

	public void insert_last_name (String lastname){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastname")));
		WebElement element = browser.findElement(By.id("lastname"));
		element.sendKeys(lastname);
	}

	public void insert_user_name (String username){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
		WebElement element = browser.findElement(By.id("userName"));
		element.sendKeys(username);
	}

	public void insert_password (String password){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		WebElement element = browser.findElement(By.id("password"));
		element.sendKeys(password);
	}

	public void click_register(){
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
		browser.findElement(By.id("register")).click();
	}

	public void confirm_register_with_password_numeric(){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		WebElement element = browser.findElement(By.id("name"));
		String text = element.getText();
		assertEquals("Passwords must have at least " +
				"one non alphanumeric character, one digit ('0'-'9')," +
				" one uppercase ('A'-'Z'), one lowercase ('a'-'z')," +
				" one special character and Password must be eight characters or longer.",text);
	}

	public void confirm_successfully_register(){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		WebElement element = browser.findElement(By.id("name"));
		String text = element.getText();
		assertEquals("Passwords must have at least " +
				"one non alphanumeric character, one digit ('0'-'9')," +
				" one uppercase ('A'-'Z'), one lowercase ('a'-'z')," +
				" one special character and Password must be eight characters or longer.",text);
	}

}