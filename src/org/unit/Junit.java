package org.unit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
public static WebDriver driver;

@BeforeClass

public static void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniu\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");	
}
@AfterClass

public static void afterClass(){
	driver.quit();
}

@Before

public void Before() {
	Date d=new Date();
	System.out.println(d);
}

@After

public void after() {
	Date d=new Date();
	System.out.println(d);
}
@Test
public void Test() {
	WebElement e=driver.findElement(By.id("email"));
	e.sendKeys("saranya");
	Assert.assertEquals("saranya",e.getAttribute("value"));
	WebElement p=driver.findElement(By.id("pass"));
	p.sendKeys("saranyau");
	Assert.assertEquals("saranyau",p.getAttribute("value"));
    driver.findElement(By.id("u_0_a")).click();
}
	
}
