package org.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Save {
	public static void main(String[] args) {
		//set the property
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dinesh karunanithi\\eclipse-workspace\\MyProject\\drive\\chromedriver.exe");
	//launch browser
		WebDriver driver=new FirefoxDriver();
		//enter the url
		driver.get("http://traininginchennai.in/download-links.pdf");
	}

}
