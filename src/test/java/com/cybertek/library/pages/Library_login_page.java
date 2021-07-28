package com.cybertek.library.pages;

import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(xpath = "(//h6[.='Users'])/../h2")
    private WebElement numberOfUsers;


    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
    private WebElement accountName;


    public static String getNameOfAccount(){
        BrowserUtils.sleep(5);
        Library_login_page page =new Library_login_page();
       return page.accountName.getText();
    }



    public static void logInToLibrary(String email,String password){
        Library_login_page page=new Library_login_page();
        page.emailInput.sendKeys(email);
        page.passwordInput.sendKeys(password);
        page.signInButton.click();
    }

    public static void putEmail(String email) {
        Library_login_page page = new Library_login_page();
        page.emailInput.sendKeys(email);
    }
    public static void putPassword(String password){
        Library_login_page page=new Library_login_page();
        page.passwordInput.sendKeys(password);
    }

    public static void clickOnSingInButton(){
        Library_login_page page=new Library_login_page();
        page.signInButton.click();
    }

    public static int numberOfUsers(){
        BrowserUtils.sleep(5);
        Library_login_page page=new Library_login_page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(page.numberOfUsers));
        String str=page.numberOfUsers.getText();
        return Integer.parseInt(str);
    }

}
