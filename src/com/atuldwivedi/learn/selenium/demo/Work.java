package com.atuldwivedi.learn.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.atuldwivedi.learn.selenium.utils.screenshot.ScreenShot;
import com.atuldwivedi.learn.selenium.wait.WaitForPageLoad;

public class Work {
	static WebDriver wd = null;
	static WaitForPageLoad wpl;
	public static void main(String[] args) {
		wd =  new FirefoxDriver();
		wpl = new WaitForPageLoad();
		wd.navigate().to("https://vdi.stateauto.com/portal/desktop/index.html");
//		(new ScreenShot()).takeScreenShotAsFile(wd);
		wd.manage().window().maximize();
		try {
			wpl.waitForPageLoaded(wd, 20);
			wd.findElement(By.xpath(".//h2[text()='VMware Horizon HTML Access']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			wd.close();
		}
	}
}
