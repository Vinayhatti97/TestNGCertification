package Pages;

import com.Actions.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    SeleniumActions seleniumActions;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
    }

    @FindBy(xpath = "//a[text()='Checkbox Demo']")
    WebElement checkboxDemoLink;

    @FindBy(xpath = "//a[text()='Javascript Alerts']")
    WebElement javaScriptAlertsLink;

    public void clickOnCheckBoxDemoLink(){
        seleniumActions.waitforVisibleAndClick(checkboxDemoLink);
    }

    public void clickOnJavaScriptsAlertLink(){
        seleniumActions.clickByAction(javaScriptAlertsLink);
    }


}
