package com.hms.hospice.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OlymbicsMedals {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		
		List<WebElement> Countrys = driver.findElements(By.xpath("//div[@class=\"styles__CountryWrapper-sc-fehzzg-4 hjfJyH\"]"));
		List<WebElement> Gold = driver.findElements(By.xpath("//div[@title=\"Gold\"]"));
		List<WebElement> silver = driver.findElements(By.xpath("//div[@title=\"Silver\"]"));
		List<WebElement> bronze = driver.findElements(By.xpath("//div[@title=\"Bronze\"]"));
		List<WebElement> Total = driver.findElements(By.xpath("//div[contains(@data-medal-id,\"total-medals-row\")]"));
		
		String countryname="India";
		for(int i=0,j=0,k=0,p=0,t=0;i<Countrys.size();i++,j++,k++,p++,t=0)
		{
			String c=Countrys.get(i).getText();
			String G=Gold.get(j).getText();
			String s=silver.get(k).getText();
			String b=bronze.get(p).getText();
			String T=Total.get(t).getText();
			
			if(c.equals(countryname))
			{
			System.out.println(c+" Gold="+G+" Silver="+s+" Bronze="+b+" Total="+T);
			}
		}

	
	
	
	
	
	}

}
