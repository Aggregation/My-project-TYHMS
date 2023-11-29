import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hms.hospice.GenericUtils.DatabaseUtils;
import com.hms.hospice.GenericUtils.ExcelUtils;
import com.hms.hospice.GenericUtils.FileUtils;
import com.hms.hospice.GenericUtils.IpathConstants;
import com.hms.hospice.GenericUtils.JavaUtils;
import com.hms.hospice.GenericUtils.WebdriverUtils;
import com.objectRepository.AdminLoginPage;
import com.objectRepository.HomePage;

public class AdminLoginPagePOMTEST   {
	
	public static void main(String[] args) throws Throwable   {
	
		FileUtils fu=new FileUtils();
		ExcelUtils eu=new ExcelUtils();
		WebdriverUtils wu=new WebdriverUtils();
		DatabaseUtils db=new DatabaseUtils();
		JavaUtils ju=new JavaUtils();
		
		
	    String URL = fu.readDataFromPropertyFile("url");
	    String adminUN = fu.readDataFromPropertyFile("AdminUsername");
	    String adminPass = fu.readDataFromPropertyFile("AdminPassword");
		
		WebDriver driver=new ChromeDriver();
		wu.maximizeWindow(driver);
		wu.waitForPageLoad(driver, 5);
		driver.get(URL);
		
		HomePage home=new HomePage(driver);
		home.adminlinkClick();
		AdminLoginPage adminLogin=new AdminLoginPage(driver);
		adminLogin.adminlogin(adminUN, adminPass);
		
		
//		adminLogin.getAdmin_UN().sendKeys(adminUN);
//		adminLogin.getAdmin_PWD().sendKeys(adminPass);
//		adminLogin.getSubmit_Btn().click();
		
	} 
	
	
	
		
		
		
		
		
		
	
	
	

}
