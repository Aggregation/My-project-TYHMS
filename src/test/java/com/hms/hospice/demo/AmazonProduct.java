package com.hms.hospice.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonProduct {
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/s?k=iphone&crid=37FPKEJJ3GIRZ&sprefix=iphone%2Caps%2C316&ref=nb_sb_ss_ts-doa-p_1_6");
		List<WebElement> products = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]"));
		
		for(int i=0,j=0;i<products.size();i++,j++)
		{
			String pricelist = price.get(j).getText();
//			
//		     char[] digits = pricelist.toCharArray();
//			if(digits.length<=6 && digits[0]<='5')
			String pl=pricelist.replace(",", "");
			int pi=Integer.parseInt(pl);
			if(pi<=60000)
				System.out.println(products.get(i).getText()+"--> price="+pricelist);
			
	
			
				
			
			
		}
	} 
	

}
