package com.hms.hospice.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class RedbusDate {
	public static void main(String[] args) throws Exception {
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/");
		System.out.println("hi");
		driver.findElement(By.xpath("//div[@class=\"labelCalendarContainer\"]")).click();
		System.out.println("hello");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='Nov']/ancestor::div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/descendant::span[text()='20']")).click();
	    for(;;)
	    {
	    	try
	    	{
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
	    	}
	    }
	
	
	
	}

}
