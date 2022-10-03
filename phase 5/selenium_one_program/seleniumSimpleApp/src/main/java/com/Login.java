package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prateek\\Phase 5 Workspace\\selenium_one_program\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://127.0.0.1:5500/login1.html");
		
	 
		WebElement emailIdRef = wd.findElement(By.id("a1"));
		WebElement passwordRef = wd.findElement(By.id("a2"));
		WebElement submitButtonRef = wd.findElement(By.id("b1"));
		submitButtonRef.click();
		Alert alertRef	= wd.switchTo().alert();	
		System.out.println(alertRef.getText());
		alertRef.accept();
		
		
		
	}

}
