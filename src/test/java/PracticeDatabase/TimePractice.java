package PracticeDatabase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TimePractice {


	public static void main(String[] args) throws Throwable {
		FileInputStream fid=new FileInputStream(".\\src\\test\\resources\\commomDataSprint1.properties");
		Properties pobj=new Properties();
		pobj.load(fid);
		
		String BROWSER=pobj.getProperty("browser");
		String URL=pobj.getProperty("url");
		String PUN=pobj.getProperty("PatientName");
		String PPWD=pobj.getProperty("PatientPassword");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
		driver.findElement(By.xpath("//a[@href=\"hms/user-login.php\"]")).click();
		
		WebElement username = driver.findElement(By.name("username"));
		username.click();
		username.sendKeys(PUN);
		
		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.sendKeys(PPWD);
		WebElement loginbtn = driver.findElement(By.name("submit"));
		loginbtn.click();
		driver.findElement(By.xpath("//a[@href=\"book-appointment.php\"]/parent::p[@class=\"links cl-effect-1\"]")).click();
		
		WebElement DoctorSpec = driver.findElement(By.name("Doctorspecialization"));
		Select selectDoctSpec=new Select(DoctorSpec);
		selectDoctSpec.selectByValue("Homeopath");
		
		WebElement DoctorDD = driver.findElement(By.name("doctor"));
		Select selectDoct=new Select(DoctorDD);
		selectDoct.selectByVisibleText("remo");
		driver.findElement(By.name("appdate")).click();
		driver.findElement(By.xpath("//td[text()=\"16\"]")).click();
		driver.findElement(By.name("apptime")).click();
		for(int i=0;i<=5;i++)
		{
			
			driver.findElement(By.xpath("//a[@data-action=\"decrementHour\"]")).click();
			driver.findElement(By.xpath("//a[@data-action=\"decrementMinute\"]")).click();
			driver.findElement(By.xpath("//a[@data-action=\"toggleMeridian\"]")).click();
		}
		driver.findElement(By.xpath("//button[@class=\"btn btn-o btn-primary\"]")).click();
		
		String AlertMessage = driver.switchTo().alert().getText();
		System.out.println(AlertMessage);
		driver.switchTo().alert().accept();
	}

}



