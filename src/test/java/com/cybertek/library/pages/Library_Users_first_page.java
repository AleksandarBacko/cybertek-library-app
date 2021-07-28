package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Library_Users_first_page {
    public Library_Users_first_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//select[@name='tbl_users_length']")
    private WebElement selectRecordsDrop;

    @FindBy(xpath = "//th")
    private List<WebElement> listOfColumns;





    public static List<String> getListOfColumns(){
        Library_Users_first_page page=new Library_Users_first_page();
        List<String> stringList=new ArrayList<>();
        for (WebElement each:page.listOfColumns){
            stringList.add(each.getText());

        }
        return stringList;
    }



    public static int getDefaultOptionInRecordsDrop(){

        Library_Users_first_page page=new Library_Users_first_page();
        Select select=new Select(page.selectRecordsDrop);
        return Integer.parseInt(select.getFirstSelectedOption().getText());
    }





    public static List<String> listOfOptionsINRecordsDrop(){
        Library_Users_first_page page=new Library_Users_first_page();
        Select select=new Select(page.selectRecordsDrop);
        List<WebElement> listOfElements= new ArrayList<>();
        listOfElements=select.getOptions();
        List<String> listOFStrings=new ArrayList<>();
        for (WebElement each:listOfElements){
            listOFStrings.add(each.getText());
        }
        return listOFStrings;

    }

}
