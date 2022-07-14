package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        super(driver);
    }

    By homePageTitleBy = By.xpath(xPathExpression: "//*[@id='header_container']/div[2]/span");
    

    public HomePage verifySuccesfulLogin(String expectedText){
        String actualText = readText(homePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }
}
