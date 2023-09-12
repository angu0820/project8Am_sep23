package org.base;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class baseClass {
	
	public static WebDriver driver;
	public static WebDriver ChromeBrowser() {
		
		driver = new ChromeDriver();
		return driver;
		
	}
	
	public static void urllaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static void implicitylywait(int secs){
		driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS);
	}
	
	public static void sendkeys(WebElement e , String value) {
		
	e.sendKeys(value);	
	
	}
	
	public static void click(WebElement e) {
		e.click();
		
	}
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		
		return text;
		
		
	}
	
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
		
	}
	public static void quit() {
		driver.quit();
		
	}
		
    public static void clear(WebElement e) {
    	e.clear();
    	
    }
	public static void staticwait(int secs) throws InterruptedException {
		Thread.sleep(secs);
	}
	
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static void dragAndDrop(WebElement src , WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

		}
	
	public static void doubleclick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}
	
	public static void contextclick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick (e);

		}
	
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
		
	}
	
	public static void selectByValue(WebElement e,String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement e , String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}
	public static List<WebElement> getoptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
		
	}
	public static List<WebElement> getallselectedoptions(WebElement e){
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
		
	}
	public static void getfirstselectedoptions(WebElement e) {
		Select s = new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
	}
	
	public static void isMutiple(WebElement e) {
		Select s = new Select(e);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
	}
	public static void deselectedByIndex(WebElement e, int index) {
		Select s = new Select ( e);
		s.deselectByIndex(index);
	}
	public static void deselectedByValue(WebElement e, String Value) {
		Select s = new Select ( e);
		s.deselectByValue(Value);
		
	}
	
	public static void deselectedByVisibleText(WebElement e, String Value) {
		Select s = new Select ( e);
		s.deselectByVisibleText(Value);
		
	}
	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}
	
	public static void TakesScreenshot(WebElement e) {
		TakesScreenshot tk =(TakesScreenshot)driver;
		File src = e.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
	}
//	public static void getWindowHandle() {
//		String ParentId = driver.getWindowHandle();
//		return System.out.println(ParentId);
		
	
	
//	public static Set<String> getWindowHandles(){
//		
//		Set<String> allId = driver.getWindowHandles();
//		System.out.println(allId);
		
		
//	}
	
	public static WebDriver browserLaunch(String bname) {
		if(bname.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(bname.equals("edge")){
		
			driver = new EdgeDriver();
			
		}
		else if(bname.equals("firefox")) {
			
			driver = new FirefoxDriver();
		}
		
		return driver;
		
		
	}
	
//	public static WebDriver browserLaunch1(String bname1 ) {
//		switch(bname1) {
//		
//		case"chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		case"edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//			
//	    default:
//	    	System.out.println("Invalid browsername");
//			
//		
//		}
//		return driver;
//		
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	
	
	
	

}
