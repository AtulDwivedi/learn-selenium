package com.atuldwivedi.seleniumbasics.wait;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoad {

	public void waitForPageLoaded(WebDriver driver, int waitInSeconds){
		while(waitInSeconds != 0){
			try {
				Thread.sleep(1000);
				if(((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"))
					break;
				waitInSeconds--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Timeout waiting for Page Load Request to complete.");
	}
}
