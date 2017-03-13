package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\arien213\\workspace\\WebDriver\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\arien213\\workspace\\SeleniumTest\\Services\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.wikipedia.org");
		WebElement link = driver.findElement(By.id("js-link-box-en"));
		//ink.sendKeys("English");
		link.click();
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		Thread.sleep(3000);
		searchBox.submit();
		System.out.println("Result : " + driver.getCurrentUrl());
		driver.quit();
		
	}

}
