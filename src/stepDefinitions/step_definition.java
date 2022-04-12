package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class step_definition {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
// Homepage Defaulth Login
	
	@Given("^User is in stockbit-login Page$")
	public void user_is_in_stockbit_login_page()
	{
		driver.get("https://stockbit.com/")
		driver.findElement(By.xpath("(//a[text()='Log In'])[1]")).click();
	}
	 
	@When("User Input login-email with.*")
	public void user_input_login_email(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And("User Input login-password with.*")
	public void user_input_login_password(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("User Click login button")
	public void user_click_login_button()
	{
		driver.findElement(By.id("loginbutton")).click();
	}
	 
	@Then("home-page are Displayed")
	public void home_page_are_displayed()
	{
		driver.findElement(By.id("loginbutton")).isDisplayed();
	}

// Trading Page Login
	
	@Given("User is in trading-login Page")
	public void user_is_in_trading_login_page()
	{
		driver.findElement(By.className("trading-nonlogin")).click();
		text = driver.findElement(By.className("content-desc")).getText();
		if text.contains("Halo, Selamat Datang")
			driver.findElement(By.className("ant-btn.login-btn")).click()
			return True;
		else
			return False;
	}
	
	@When("User Input trading-pin with.*")
	public void user_input_trading_pin(String pin)
	{
		driver.findElement(By.id("loginbutton")).sendKeys(pin);
	}
	
	@And("User Click login button")
	public void user_click_login_button()
	{
		driver.findElement(By.className("ant-btn.login-btn")).click();
	}
	
	@Then("trading-page are Displayed")
	public void trading_page_are_displayed()
	{
		driver.findElement(By.id("trading-nav")).isDisplayed();
	}

// Click Sell Stock
	
	@Given("User is in trading-page Page")
	public void user_is_in_trading_page()
	{
		driver.findElement(By.id("trading-nav")).isDisplayed();
	}
	
	@And("User have stock-list")
	public void user_have_stock_list()
	{
		data = driver.findElements(By.className("trd-company-symbol"));
		if data.count() > 0
			return True;
		else
			return False;
	}
	
	@When("User Click setting button")
	public void user_click_setting_button()
	{
		driver.findElement(By.className("icon-trading_gear")).click();
	}
	
	@And("User Select sell")
	public void user_select_sell()
	{
		driver.findElement(By.xpath("//a[text()='SELL']")).click();
	}
	
	@Then("stock-detail are Displayed")
	public void stock_detail_are_displayed()
	{
		driver.findElement(By.className("trade-head")).isDisplayed();
		driver.findElement(By.className("sell-buy-form")).isDisplayed();
	}
	
// Set Sell Stock
	
	@Given("User is in stock-detail")
	public void user_is_in_stock_detail()
	{
		driver.findElement(By.className("trade-head")).isDisplayed();
		driver.findElement(By.className("sell-buy-form")).isDisplayed();
	}
	
	@When("User Input sell-order-lot")
	public void user_input_sell_order_lot()
	{
		driver.findElement(By.id("modalsell_input_lot")).sendKeys("72");
	}
	
	@And("User Input price")
	public void user_input_price()
	{
		driver.findElement(By.className("ant-input-number-input")).sendKeys("150");
	}
	
	@And("User Select order-type")
	public void user_select_order_type()
	{
		Select drpCountry = new Select(driver.findElement(By.xpath("//div[@class='order-form']/select")));
		drpCountry.selectByVisibleText("Good For Day");
	}
	
	@Then("Verify proceeds-net-fee is filled")
	public void verify_proceeds_net_fee_is_filled()
	{
		data = driver.findElement(By.xpath("//b[@class='order-info']")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	
	@And("Verify profit-loss is Filled")
	public void verify_profit_loss_is_filled()
	{
		data = driver.findElement(By.xpath("//span[@class='order-info tdgreen']").getText();
		if data.len() > 0
			return True;
		else
			return False;
	}

// Click Place Order button
	
	@Given("place-order button is Enabled")
	public void place_order_button_is_enabled()
	{
		driver.findElement(By.className("setorder").isEnabled();
	}
	
	@When("User Clik place-order button")
	public void user_click_place_order_button()
	{
		driver.findElement(By.className("setorder").click();
	}
	
	@Then("preview-order are Displayed")
	public void preview_order_are_displayed()
	{
		driver.findElement(By.className("modal-previewOrder-title")).isDisplayed();
	}
	
	@And("Verify preview-order-stock is Filled")
	public void verify_preview_order_stock_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[1]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-expiry is Filled")
	public void verify_preview_order_expire_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[2]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-lot is Filled")
	public void verify_preview_order_lot_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[3]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-price is Filled")
	public void verify_preview_order_price_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[4]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-proceed-amount is Filled")
	public void verify_preview_order_proceed_amount_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[5]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-broker-fee is Filled")
	public void verify_preview_order_broker_fee_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[1=6]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-exchange-fee is Filled")
	public void verify_preview_order_exchange_fee_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[7]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-proceeds-net-fee is Filled")
	public void verify_preview_order_proceeds_net_fee_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[8]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("Verify preview-order-profit-loss is Filled")
	public void verify_preview_order_profit_loss_is_filled()
	{
		data = driver.findElement(By.xpath("(//tbody[@class=\"ant-table-tbody\"]/tr/td[@class=\"column-right\"]/b)[9]")).getText();
		if data.len() > 0
			return True;
		else
			return False;
	}
	
	@And("User Click confirm button")
	public void user_click_confirm_button()
	{
		driver.findElement(By.xpath("//span[text()='Confirm']").click();
	}
	
	@And("User Click done button")
	public void user_click_done_button()
	{
		driver.findElement(By.xpath("//span[text()='Done']").click();
	}
	
}
