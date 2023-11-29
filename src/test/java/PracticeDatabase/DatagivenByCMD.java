package PracticeDatabase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatagivenByCMD {
	
	@Test
	public void demo(){
		
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(URL);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.xpath("//a[@href=\"hms/admin\"]")).click();
	    WebElement usernameTF = driver.findElement(By.name("username"));
	    usernameTF.click();
	    usernameTF.sendKeys(USERNAME);
	    WebElement passwordTF = driver.findElement(By.name("password"));
	    passwordTF.click();
	    passwordTF.sendKeys(PASSWORD);
	    WebElement login = driver.findElement(By.name("submit"));
	    login.click();
	    
	}

}
