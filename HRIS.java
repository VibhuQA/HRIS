package com.qait.maven.HRIS;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;
import org.openqa.selenium.support.ui.Select;

public class HRIS{

	WebDriver driver;
	@BeforeClass
	public void Init() {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vibhushrivastav\\eclipse-workspace\\training\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void Step_01_LaunchBrowser() {
		driver.get("https://hris.qainfotech.com/login.php");
	}
	@Test
	public void Step_02_LoginPage() {
		driver.findElement(By.cssSelector("a[href=\"#panel1\"]")).click();

	}
	@Test
	public void Step_03_Inputs() throws InterruptedException {
		driver.findElement(By.cssSelector("input[name=\"txtUserName\"]")).sendKeys("Vibhushrivastav");
		driver.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("Vibhu@321#");
		driver.findElement(By.cssSelector("input[name=\"Submit\"]")).click();	
		Thread.sleep(5000);;
	}
	@Test
	public void Step_04_Hours() throws InterruptedException {

		driver.findElement(By.cssSelector("div#dv_2018-06-11")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class=\"modal-header\"]>button[class=\"close text-peace\"]")).click();

		System.out.println(driver.findElement(By.xpath("//*[text()=\"25\"]/../div/div[2]/p/span")).getText());

	}





}
