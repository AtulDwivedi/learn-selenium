package com.atuldwivedi.seleniumbasics.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.atuldwivedi.seleniumbasics.utils.screenshot.ScreenShot;
import com.atuldwivedi.seleniumbasics.wait.WaitForPageLoad;

public class HelloWorld {
	static WebDriver wd = null;
	static WaitForPageLoad wpl;
	public static void main(String[] args) {
		wd =  new FirefoxDriver();
		wpl = new WaitForPageLoad();
		wd.navigate().to("http://atulmdwivedi.blogspot.in");
		(new ScreenShot()).takeScreenShotAsFile(wd);
		wd.manage().window().maximize();
		try {
			wpl.waitForPageLoaded(wd, 20);
			wd.findElement(By.xpath(".//div[@id='content']/div[1]/div[1]/div[1]/div/div[text()='Frequently Asked SQL Queries']")).click();
			wd.findElement(By.xpath(".//a[@class='kd-button small close']")).click();
			wpl.waitForPageLoaded(wd, 10);
			wd.findElement(By.xpath(".//div[@id='content']/div[2]/div[1]/div[1]/div/div[text()='Oracle Database Script']")).click();
			wd.findElement(By.xpath(".//a[@class='kd-button small close']")).click();

			System.out.println("Title: "+wd.getTitle());

			Capabilities cap = ((RemoteWebDriver) wd).getCapabilities();
			System.out.println(cap.getBrowserName());
			System.out.println(cap.getPlatform());
			System.out.println(cap.getVersion());
			System.out.println(cap.isJavascriptEnabled());
			System.out.println(cap.asMap());
			System.out.println(cap.is("version"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			wd.close();
		}
	}
}
