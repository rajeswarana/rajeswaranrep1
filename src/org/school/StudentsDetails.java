package org.school;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentsDetails {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vicky\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\a\\Details\\drive\\chromedriver.exe");

		WebDriver drive= new ChromeDriver();

		drive.get("https://letcode.in/buttons");

		WebElement position=drive.findElement(By.id("position"));
		Point point=position.getLocation();
		int xvalue=point.getX();
		int yvalue=point.getY();
		System.out.println(xvalue+yvalue);

		WebElement color=drive.findElement(By.id("color"));
		String col=color.getCssValue("background-color");
		System.out.println(col);

		WebElement height=drive.findElement(By.id("property"));
		int hei=height.getSize().getHeight();
		int hii=height.getSize().getWidth();
		System.out.println(hei+hii);

		WebElement home=drive.findElement(By.id("home"));
		home.click();


	}
}