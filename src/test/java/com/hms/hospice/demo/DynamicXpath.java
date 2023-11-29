package com.hms.hospice.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXpath {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		String country="England";
		List<WebElement> element = driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]/span[2]"));
		boolean flag=false;
		
		List<WebElement> rating = driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]/following::td[1]"));
		
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr[*]"));	
		
		String countrynames="";
		
		
		for (WebElement webElement : element) 
		{
			 countrynames=webElement.getText();
			
			if(countrynames.equals(country))
			{
				System.out.println("its present");
				flag=true;
				break;
			}
			System.out.println(countrynames);
			
		}
		for (WebElement webElement : rating) 
		{
			String countryRating=webElement.getText();
			
			System.out.println(countryRating);
		}
		
		for (WebElement webElement : allData) {
			String data=webElement.getText();
			System.out.println(data);
		}
//		if(!flag)
//		{
//			System.out.println("not present");
//		}
	}

}
