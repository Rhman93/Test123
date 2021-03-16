package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties Prop;
	public static WebDriver driver;
	
	public  TestBase() throws IOException {
		
		Prop=new Properties();
	FileInputStream Fil= new FileInputStream("/Users/ahmedshuily/eclipse-workspace/AmiratBDDPOM/src/main/java/Property/Config.Property");
		Prop.load(Fil);
	}
	
	public void Initialization() {
		System.setProperty("webdriver.chrome.driver", 
			"/Users/ahmedshuily/Desktop/untitled folder/chromedriver");
		driver=new ChromeDriver();
		driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get(Prop.getProperty("Url"));
		
		
		
	}
	
	
	
}
