package org.pom;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInpage extends baseClass {
	public logInpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(id="email")
	private WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnlogin;
	
	
	public WebElement gettxtusername() {
		return txtusername;
		
	}
	
	public WebElement gettxtpassword() {
		return txtpassword;
		

	}
	public WebElement getbtnlogin() {
		return btnlogin;
		
	} 
	
	
	
	
	
	

}
