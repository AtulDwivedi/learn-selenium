package com.atuldwivedi.learn.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyBlog {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:/selenium-drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://learn.atuldwivedi.com");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Design");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement clickPost = driver.findElement(By.xpath(".//div[contains(text(), 'Singleton Design Pattern')]"));
		clickPost.click();

		Thread.sleep(5000);

		driver.findElement(By.linkText("Design Patterns")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(10000);
		driver.switchTo().frame("comment-editor");
		driver.findElement(By.xpath(".//form/div/div[2]/textarea[@id = 'commentBodyField']"))
				.sendKeys("This is amazing tutorial.");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.name("identityMenu"));
		Select se = new Select(element);
		se.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@value = 'Publish']")).click();
	}
}
