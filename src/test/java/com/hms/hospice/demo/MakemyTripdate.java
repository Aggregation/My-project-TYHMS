package com.hms.hospice.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemyTripdate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.doubleClick().perform();
		Thread.sleep(4000);
		
		System.out.println("hi");
	
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class=\"lbl_input appendBottom10\"]/preceding::span[text()='Departure']")).click();
		
		driver.findElement(By.xpath("//div[text()='November 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='20']")).click();
		
		
	}

}
