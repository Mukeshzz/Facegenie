package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_logout{
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facegenie-ams-school.web.app/");
		driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.id("password")).sendKeys("facegenie");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		WebElement logout=driver.findElement(By.xpath("//span[text()='Log Out']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logout);
		
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		
		
		
	}
		
				
	}

