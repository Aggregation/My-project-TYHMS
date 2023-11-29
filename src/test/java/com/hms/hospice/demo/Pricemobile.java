package com.hms.hospice.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pricemobile {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.click();
		String mobile="samsung";
		search.sendKeys(mobile);
		search.sendKeys(Keys.ENTER);
		List<WebElement> products = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		 List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]"));
		
		for(int i=0,j=0;i<price.size();i++,j++)
		{
			
			System.out.println(price.get(5).getText()+" "+products.get(5).getText());
			break;
			
		}
		
		
		
	}

}
