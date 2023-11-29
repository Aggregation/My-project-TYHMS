package com.hms.hospice.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SpiceJet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid=\"round-trip-radio-button\"]")).click();
		 WebElement from = driver.findElement(By.xpath("//div[text()='From']"));
		 from.click();
//		 from.click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[text()='Agartala Airport']")).click();
		 WebElement tolink= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]"));
		 tolink.click();
		 WebElement destiniation = driver.findElement(By.xpath("//div[text()='Delhi']"));
		 destiniation.click();
		 Thread.sleep(2000);
		WebElement startdate = driver.findElement(By.xpath("//div[@data-testid=\"undefined-month-November-2023\"]/descendant::div[@data-testid=\"undefined-calendar-day-10\"]"));
		 startdate.click();
		WebElement returndate = driver.findElement(By.xpath("//div[@data-testid=\"undefined-month-December-2023\"]/descendant::div[@data-testid=\"undefined-calendar-day-16\"]"));
		 returndate.click();
		WebElement traveller = driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]"));
		traveller.click();
		WebElement addOne = driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
		addOne.click();
		//driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement(By.xpath("//div[text()='INR']")).click();
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		WebElement searchflight = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"));
		Thread.sleep(2000);
		searchflight.click();
		   
		
		
		//driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();)
		
	}

}
