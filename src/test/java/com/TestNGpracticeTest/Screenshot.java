package com.TestNGpracticeTest;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		WebElement sortBYorder = driver.findElement(By.xpath("//button[@type=\"button\"]/parent::div[@class=\"relative h-full\"]/ancestor::div[@class=\"Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum\"]"));
		sortBYorder.click();
	
		List<WebElement> divLink = driver.findElements(By.xpath("//div[@id=\"headlessui-menu-items-:R1769b6:\"]/descendant::ul[@class=\"jsx-1259984711 w-56 px-2.5 bg-darkOnyx-800 text-silverSurfer-100 rounded-l-xs\"]/li[@class=\"jsx-1259984711\"]/a"));
		
		
		
		
		for (WebElement webElement : divLink) {
			
			System.out.println(webElement);
		    String text = webElement.getText();
		    System.out.println(text);
			
			
		}
		
		
		

		
		
	}

}
