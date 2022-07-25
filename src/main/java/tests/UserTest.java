package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.UserPage;
import pages.BookStorePage;
import suport.web;


public class UserTest {
	private WebDriver browser;

	@Before
	public void setUp() {
		browser = web.createChrome();
	}

	@Test
	public void register_with_password_numeric() throws InterruptedException {
		LoginPage loginPage = new LoginPage(browser);
		UserPage userPage = new UserPage(browser);

		loginPage.click_register();
		userPage.insert_first_name("João");
		userPage.insert_last_name("Silva");
		userPage.insert_user_name("JoãoSilva");
		userPage.insert_password("12345");
		/*
		recaptcha não permite clicar em registrar

		userPage.click_register();
		userPage.confirm_password_invalid();
		*/
	}

	@Test
	public void successfully_register() throws InterruptedException {
		LoginPage loginPage = new LoginPage(browser);
		UserPage userPage = new UserPage(browser);

		loginPage.click_register();
		userPage.insert_first_name("João");
		userPage.insert_last_name("Silva");
		userPage.insert_user_name("JoãoSilva");
		userPage.insert_password("Ab123456**##");
		/*
		recaptcha não permite clicar em registrar

		userPage.click_register();
		userPage.confirm_create_user_valid();

		*/
	}

	@Test
	public void access_bookstore_book() throws InterruptedException {
		LoginPage loginPage = new LoginPage(browser);
		BookStorePage bookStorePage = new BookStorePage(browser);

		loginPage.insert_username("TesteArlindo");
		loginPage.insert_password("Xy123456##**");
		loginPage.click_login();

		bookStorePage.click_book_store();
		bookStorePage.search_box("Learning JavaScript Design Patterns");
		bookStorePage.click_book();
		bookStorePage.confirm_ISBN();
		bookStorePage.confirm_author();
		bookStorePage.click_add_book();
		bookStorePage.click_confirm_add_book();
	}

	@After
	public void finish(){
		browser.quit();
	}
}
