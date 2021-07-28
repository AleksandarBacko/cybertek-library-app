package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_first_page {
    public Library_first_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[.='Dashboard']")
    private WebElement dashBoardOption;

    @FindBy(xpath = "//span[.='Books']")
    private WebElement booksOption;


    @FindBy(xpath = "//span[.='Users']")
    private WebElement usersOption;





    public static String getTextOfTheOption(String logInAs){
        Library_first_page page=new Library_first_page();
        if (logInAs.equals("librarian")){
            return page.dashBoardOption.getText();
        }else if (logInAs.equals("student")){
            return page.booksOption.getText();
        }
        return "Log in as third person";

    }

    public static void isDisplayedAssert(String name){
        Library_first_page page=new Library_first_page();
        if (name.equals("Dashboard")){
            Assert.assertTrue(page.dashBoardOption.isDisplayed());
        }if (name.equals("Books")){
            Assert.assertTrue(page.booksOption.isDisplayed());
        }
    }
    
    
    public static void chooseOptopn(String optionFromMain){
        Library_first_page page=new Library_first_page();
        if (optionFromMain.equals("Users")){
            page.usersOption.click();
        }else if (optionFromMain.equals("Dashboard")){
            page.dashBoardOption.click();
        }else if(optionFromMain.equals("Books")){
            page.booksOption.click();
        }else {
            System.out.println("No option existing -"+optionFromMain);
        }
    }


}
