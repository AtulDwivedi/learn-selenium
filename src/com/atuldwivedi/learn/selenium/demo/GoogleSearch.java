package com.atuldwivedi.learn.selenium.demo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:/selenium-drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

		WebElement searchTextBox = driver.findElement(By.id("lst-ib"));
		searchTextBox.sendKeys("Selenium");

		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);

		Thread.sleep(4000);

		WebElement searchButton = driver.findElement(By.className("sbico-c"));
		searchButton.click();

		String pageTitle = driver.getTitle();
		System.out.println("Page title is:" + pageTitle);

		// WebDriverWait wait = new WebDriverWait(driver, 5);// 5 seconds
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
		// driver.findElement(By.id("resultStats"));
		Thread.sleep(4000);
		// WebElement results = driver.findElement(By.id("resultStats"));
		// //displays # of results from search
		WebElement results = driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		results.click();
		Thread.sleep(4000);
		WebElement download = driver.findElement(By.linkText("Download"));
		download.click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.linkText("WebDriverBackedSelenium"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		// driver.quit();

	}

}
