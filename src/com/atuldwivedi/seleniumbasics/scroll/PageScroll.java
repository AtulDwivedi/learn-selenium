package com.atuldwivedi.seleniumbasics.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageScroll {
	public static void scrollToBottom(WebDriver driver) {
		((JavascriptExecutor) driver)
		.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", element);
	}

	public static void scrollCoordinates(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}
}
