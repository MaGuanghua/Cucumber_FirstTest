package com.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaiduSearchStepfs {
	private WebDriver driver;

	@Given("^Go to baidu home$")
	public void go_to_baidu_home(){
		System.setProperty("webdriver.chrome.driver", "D:/seleniumdriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
		options.addArguments("--test-type", "--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://www.baidu.com/");
	}

	@When("^Type the search text \"([^\"]*)\"$")
	public void type_the_search_text(String searchText){
		driver.findElement(By.id("kw")).clear();
		driver.findElement(By.id("kw")).sendKeys(searchText);
	}

	@And("^Click the submit$")
	public void click_the_submit() {
		driver.findElement(By.id("su")).click();
	}

	@Then("^Wait the query result")
	public void wait_the_query_result() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertEquals("selenium_°Ù¶ÈËÑË÷", driver.getTitle());
		driver.close();
		driver.quit();
	}
}