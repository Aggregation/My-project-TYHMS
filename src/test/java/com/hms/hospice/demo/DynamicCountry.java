package com.hms.hospice.demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicCountry {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> countryName = driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]"));
		 List<WebElement> matches = driver.findElements(By.xpath("//table/tbody/tr[*]/td[3]"));
		 List<WebElement> points = driver.findElements(By.xpath("//table/tbody/tr[*]/td[4]"));
		 
		
		 for(int i=0,j=0,k=0;i<countryName.size();i++,j++,k++)
		 {
			 System.out.println("Country="+countryName.get(i).getText()+" Matches="+matches.get(j).getText()+" points="+points.get(k).getText());
		 }
		
	}

}
