package org.pom;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage extends baseClass {
	public registerPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btncreate;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtfirstname;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement txtsurname;
	
	public WebElement getbtncreate(){
		return btncreate;
		
	}
	public WebElement gettxtfirstname() {
		return txtfirstname;
		
	}
	public WebElement gettxtsurname() {
		return txtsurname;
	}
	

}



