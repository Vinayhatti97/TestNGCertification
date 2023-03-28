package Pages;

import com.Actions.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertBoxDemoPage {

    WebDriver driver;

    SeleniumActions seleniumActions;
    public JavaScriptAlertBoxDemoPage(WebDriver driver){
        this.driver = driver;
        seleniumActions = new SeleniumActions(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[.='Java Script Alert Box']/following-sibling::button")
    WebElement clickOnClickMeButtonBelowJavaScriptAlertBox;

    public void clickOnClickMeButton(){
        seleniumActions.clickOnElement(clickOnClickMeButtonBelowJavaScriptAlertBox);
    }

    public String returnAlertMessage() {
        String AlertTitle = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return AlertTitle;
    }

}
