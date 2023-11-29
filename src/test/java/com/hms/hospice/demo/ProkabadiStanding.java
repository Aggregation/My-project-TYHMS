package com.hms.hospice.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ProkabadiStanding {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.prokabaddi.com/standings");
		String teamname="Bengaluru Bulls";
		 List<WebElement> teamdata = driver.findElements(By.xpath("//p[.='"+teamname+"']/ancestor::div[@class='table-row qualifier']"));
//		List<WebElement> team = driver.findElements(By.xpath("//div[@class=\"table-data team\"]"));
//		List<WebElement> play = driver.findElements(By.xpath("//div[@class=\"table-data matches-play\"]"));
//		List<WebElement> won = driver.findElements(By.xpath("//div[@class=\"table-data matches-won\"]"));
//		List<WebElement> lost = driver.findElements(By.xpath("//div[@class=\"table-data matches-lost\"]"));
//		List<WebElement> draw = driver.findElements(By.xpath("//div[@class=\"table-data matches-draw\"]"));
//		List<WebElement> score = driver.findElements(By.xpath("//div[@class=\"table-data score-diff\"]"));
//		List<WebElement> form = driver.findElements(By.xpath("//div[@class=\"table-data form\"]"));
//		List<WebElement> points = driver.findElements(By.xpath("//div[@class=\"table-data points\"]"));
//		
//		for(int i=0,p=0,w=0,l=0,d=0,s=0,f=0,b=0;i<team.size();i++,p++,w++,l++,d++,s++,f++,b++)
//		{
//			String t=team.get(i).getText();
//			String pl=play.get(p).getText();
//			String wi=won.get(w).getText();
//			String lo=lost.get(l).getText();
//			String dr=draw.get(d).getText();
//			String sc=score.get(s).getText();
//			String fo=form.get(f).getText();
//			String poin=points.get(b).getText();
//			
//			System.out.println(t+" "+pl+" "+wi+" "+lo+" "+dr+" "+sc+" "+fo+" "+poin);
//			
//		}
//		
		for(int i=0;i<teamdata.size();i++)
		{
			System.out.println(teamdata.get(i).getText());
		}
		
		
		
		
	}

}
