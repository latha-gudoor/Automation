package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTarget {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arien213\\workspace\\SeleniumTest\\Services\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.target.com");
		WebElement element = driver.findElement(By.id("searchLabel"));
		element.sendKeys("Toys");
		//element = driver.findElement(By.xpath("[@id='searchReset']");
		
	}

}
