package com.hms.hospice.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartGetProduct {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3DRealme&otracker=nmenu_sub_Electronics_0_Realme");
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='col col-7-12']/child::div[@class='_4rR01T']"));
        List<WebElement> price = driver.findElements(By.xpath("//div[@class='col col-7-12']/child::div[@class='_4rR01T']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]"));
		for(int i=0,j=0;i<product.size();i++,j++)
		{
			System.out.println(product.get(i).getText()+" -->>price="+price.get(j).getText());
		}
	}
}
