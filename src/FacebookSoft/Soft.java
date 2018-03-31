package FacebookSoft;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Soft {
	static WebDriver driver;
	public static void main (String []ar)
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\Soso\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sojood.alsayyed@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("soso");
		Select sel =new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel.selectByIndex(6);
		driver.findElement(By.xpath(".//*[@id='u_0_w']")).click();
	}

}
