package com.hms.hospice.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateCheck {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.goibibo.com/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@role=\"presentation\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"sc-12foipm-22 cUvQPq fswDownArrow\"]")).click();
	    //driver.findElement(By.xpath("//div[@class=\"DayPicker-Month\"]/preceding::p[text()='10']")).click();
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//div[text()='October 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='11']")).click();
	            break;
			}
		catch(Exception e) {
			
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	
		}	
	
	}

	}
}
