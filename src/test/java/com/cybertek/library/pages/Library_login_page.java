package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_login_page {
    public Library_login_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id = "inputEmail")
    private WebElement emailInput;
    @FindBy(id = "inputPassword")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[.='Sign in']")
    private WebElement signInButton;



    public static void logInToLibrary(String email,String password){
        Library_login_page page=new Library_login_page();
        page.emailInput.sendKeys(email);
        page.passwordInput.sendKeys(password);
        page.signInButton.click();
    }
}
