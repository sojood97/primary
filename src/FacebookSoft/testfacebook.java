package FacebookSoft;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testfacebook {

	static WebDriver driver;
	@Before
	public void setup() throws Exception {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\Soso\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@After
	public void  tearDown() throws Exception{
		
	}
	
	@Test
	public void test(){
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sojood.alsayyed@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("soso");
		driver.findElement(By.xpath(".//*[@id='u_0_w']")).click();
	}
}
