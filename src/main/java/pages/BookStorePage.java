package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BookStorePage extends BasePage{

	public BookStorePage(WebDriver browser) {
		super(browser);
	}

	public void click_book_store() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		jse.executeScript("scrollBy(0,250)", "");
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gotoStore")));
		browser.findElement(By.id("gotoStore")).click();

	}

	public void search_box (String searchBox){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBox")));
		WebElement element = browser.findElement(By.id("searchBox"));
		element.sendKeys(searchBox);
	}

	public void click_book () {
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("see-book-Learning JavaScript Design Patterns")));
		browser.findElement(By.id("see-book-Learning JavaScript Design Patterns")).click();
	}

	public void confirm_ISBN(){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ISBN-wrapper")));
		WebElement element = browser.findElement(By.id("ISBN-wrapper"));
		String text = element.getText();
		assertEquals("ISBN :\n" +
				"9781449331818",text);
	}

	public void confirm_author(){
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("author-wrapper")));
		WebElement element = browser.findElement(By.id("author-wrapper"));
		String text = element.getText();
		assertEquals("Author :\n" +
				"Addy Osmani",text);
	}

	public void click_add_book () throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		jse.executeScript("scrollBy(0,500)", "");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[9]/div[2]")));
		browser.findElement(By.xpath("//div[2]/div[9]/div[2]")).click();
	}

	public void click_confirm_add_book () throws InterruptedException {
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		sendKeys(Keys.ENTER);

	}

	private void sendKeys(Keys enter) {
	}

}