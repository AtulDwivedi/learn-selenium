package com.atuldwivedi.seleniumbasics.utils.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	static WebDriver wd = null;
	static File scrFile = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumTestFramework/chromedriver/chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("http://google.com");
		takeScreenShotAsFile(wd);
		
	}

	public static void takeScreenShotAsFile(WebDriver wd){
		scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("screenshot\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
