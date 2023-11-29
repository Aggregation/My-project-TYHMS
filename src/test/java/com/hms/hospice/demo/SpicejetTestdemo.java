package com.hms.hospice.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.implementation.Implementation;

public class SpicejetTestdemo {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
//		 WebElement origin = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]"));
//	     origin.click();
	     WebElement from = driver.findElement(By.xpath("//div[text()=\"From\"]"));
	     from.click();
		
	     
	
	
	}
}
