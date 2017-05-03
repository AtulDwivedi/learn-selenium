package com.atuldwivedi.seleniumbasics.helloworld;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

		WebElement searchTextBox = driver.findElement(By.id("lst-ib"));
		searchTextBox.sendKeys("Colin");

		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);

		WebElement searchButton = driver.findElement(By.className("lsb"));
		searchButton.click();

		String pageTitle = driver.getTitle();
		System.out.println("Page title is:" + pageTitle);


		WebDriverWait wait = new WebDriverWait(driver, 5);// 5 seconds 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
		driver.findElement(By.id("resultStats"));

		WebElement results = driver.findElement(By.id("resultStats")); //displays # of results from search
		System.out.println(results);

		//driver.quit();


	}

}
