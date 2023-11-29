package com.hms.hospice.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAmazon {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		WebElement searchfield = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchfield.click();
		searchfield.sendKeys("iphone");
		searchfield.sendKeys(Keys.ENTER);
		String mobile="realme";
		driver.findElement(By.xpath("//span[text()='"+mobile+"']/preceding-sibling::div[@class=\"a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left\"]")).click();
		
	}

}
