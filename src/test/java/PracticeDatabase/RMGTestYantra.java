
package PracticeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RMGTestYantra {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://rmgtestingserver:8084/");
		//Thread.sleep(3000);
		
		//login application
		WebElement un = driver.findElement(By.name("username"));
		System.out.println("un done");
		//Thread.sleep(2000);
		un.sendKeys("rmgyantra");
		WebElement pwd = driver.findElement(By.name("password"));
		System.out.println("ppwd done");
		Thread.sleep(2000);
		pwd.sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		//create project
		driver.findElement(By.xpath("//a[text()=\"Projects\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Create Project\"]")).click();
		
		WebElement projectnameTF = driver.findElement(By.name("projectName"));
		projectnameTF.click();
		projectnameTF.sendKeys("HMS");
		
		WebElement managername = driver.findElement(By.name("createdBy"));
		managername.click();
		managername.sendKeys("Deepak HR");
		
		WebElement dd = driver.findElement(By.xpath("//select[@name='status']/preceding-sibling::label[text()='Project Status ']/..//select[@name=\"status\"]"));
	
				
		Select selectele=new Select(dd);
		System.out.println("done");
		selectele.selectByVisibleText("Created");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Add Project\"]")).click();
		
		//check database
		Driver database=new Driver();
		DriverManager.registerDriver(database);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
		
	    Statement state = con.createStatement();
	    String query="select * from project;";
	    
	    
	    ResultSet result = state.executeQuery(query);
	    String expcetd="HMS";
	    boolean flag=false;
	    while(result.next())
	    {
	    	String actual=result.getString(4);
	    	if(actual.equals(expcetd))
	    	{
	    		flag=true;
	    	}
	    }
	    if(flag)
	    {
	    	System.out.println("Project created");
	    }
	    else
	    {
	    	System.out.println("Not created");
	    }
	    
	    
	    
	    con.close();
	    
		
		
	
		
		
		
	}

}
