package PracticeDatabase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritedataToPropertyfile {
	public static void main(String[] args) throws IOException {
		
		//creating object for properties file
		Properties pobj=new Properties();
		pobj.setProperty("browser", "chrome");
		pobj.setProperty("url", "http://rmgtestingserver/domain/Hospital_Management_System/");
	    pobj.setProperty("username", "admin");
	    pobj.setProperty("password", "Test@12345");
	    
	    //create object for fileoutputstream
	    FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\commondata.properties");
	    pobj.store(fout, "write data");
	    
	    
	    FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
	    pobj.load(fi);
	    
	    String BROWSER=pobj.getProperty("browser");
	    String URL=pobj.getProperty("url");
	    String USERNAME=pobj.getProperty("username");
	    String PASSWORD=pobj.getProperty("password");
	    
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
