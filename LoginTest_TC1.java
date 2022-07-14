package tests;


import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest_TC1 extends BaseTest{
    
public LoginPage loginPage;
String standardUsername = "standard_user";
String password = "secret_sauce";
public HomePage homePage;
String expectedText = "PRODUCTS";



@Test
public void loginTC1(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new homePage(driver);
    loginPage.basePage();
    String username;
    loginPage.login(username: "standard_user", password:"secret_sauce");
    String expectedText;
    homePage.verifySuccesfulLogin(expectedText:"PRODUCTS");

    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
}
}
