package Selenium_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Selenium_Practice {
	private static char[] Title;

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\mjnag\\Desktop\\projects\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver1 = new EdgeDriver();
	int html;
	
	
	//driver.get("https://www.facebook.com/");
	
	driver1.get("https://www.amazon.in/");
	
	//driver.get("https://www.amazon.com/");

    driver1.get("https://www.facebook.com/");
	
	driver1.get("https://www.amazon.in/");
	
	driver1.get("https://www.seleniumeasy.com");
	
	String title = driver1.getTitle();
	System.out.println("TITLE: "+title);
	
	String Title= driver1.getTitle(); 
	System.out.println(Title);
	
	
	String currentUrl=driver1.getCurrentUrl();
	System.out.println("URL NAME:"+currentUrl);
			
	//String pageSourse=driver.getPageSource();
	//System.out.println(pageSourse);
	

	}

	public static char[] getTitle() {
		return Title;
	}

	public static void setTitle(char[] title) {
		Title = title;
	}
	
	

}
