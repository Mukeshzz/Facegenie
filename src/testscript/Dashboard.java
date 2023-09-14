package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facegenie-ams-school.web.app/");
		driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.id("password")).sendKeys("facegenie");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		//Select Date
		WebElement date=driver.findElement(By.xpath("//div[@role='cell']//button[text()='1']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", date);
		
		//Attendace Logs
		WebElement attendance=driver.findElement(By.xpath("//span[text()='Attendance Logs']"));
		js.executeScript("arguments[0].click();", attendance);
		
		//Analytics and Reports
		WebElement analytics=driver.findElement(By.xpath("//span[text()='Analytics and Reports']"));
		js.executeScript("arguments[0].click();", analytics);
		
		//Manage Students
		WebElement students=driver.findElement(By.xpath("//span[text()='Manage Student']"));
		js.executeScript("arguments[0].click();", students);
		
		//Manage Licenses
		WebElement license=driver.findElement(By.xpath("//span[text()='Manage Licenses']"));
		js.executeScript("arguments[0].click();", license);
		
		//Manage Sync
		WebElement sync=driver.findElement(By.xpath("//span[text()='Manage Sync']"));
		js.executeScript("arguments[0].click();", sync);
		
		//Setting
		WebElement setting=driver.findElement(By.xpath("//span[text()='Setting']"));
		js.executeScript("arguments[0].click();", setting);
	
	}

}
