package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstWebDriverProg {
	@Test
	public void testHome(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arien213\\workspace\\WebDriver\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://walmart.com");
		System.out.println("Title : " + driver.getTitle());
		By by =By.id("global-search-input");
		WebElement element = driver.findElement(by);
		element.sendKeys("laptop");
		System.out.println("Result : " + driver.getCurrentUrl());
		element = driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn"));
		element.click();
		System.out.println("Title : " + driver.getTitle());
		driver.close();
	}
	
	}


