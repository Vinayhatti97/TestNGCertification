package Pages;

import com.Actions.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxDemoPage {

    WebDriver driver;

    SeleniumActions seleniumActions;
    public CheckboxDemoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
    }

    @FindBy(id = "isAgeSelected")
    WebElement checkBoxUnderSingleCheckboxDemo;

    public WebElement clickONSingleCheckBox(){
        seleniumActions.clickOnElement(checkBoxUnderSingleCheckboxDemo);
        return checkBoxUnderSingleCheckboxDemo;
    }
}
