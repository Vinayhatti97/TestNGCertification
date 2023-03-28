package TestClass;

import Pages.CheckboxDemoPage;
import Pages.HomePage;
import Pages.JavaScriptAlertBoxDemoPage;
import com.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClassTestNG extends BaseClass {

    CheckboxDemoPage checkboxDemoPage;

    JavaScriptAlertBoxDemoPage javaScriptAlertBoxDemoPage;
    HomePage homePage;
    @BeforeClass
    public void initializePages(){
        javaScriptAlertBoxDemoPage = new JavaScriptAlertBoxDemoPage(driver);
        checkboxDemoPage = new CheckboxDemoPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void scenarioOne(){
        String titleOfPage = driver.getTitle();
        String ExcepectedTitleOfPage = "LambdaTest";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(titleOfPage, ExcepectedTitleOfPage);
        softAssert.assertAll();
    }

    @Test
    public void scenarioTwo(){
        homePage.clickOnCheckBoxDemoLink();
        WebElement checkBoxUnderSingleCheckboxDemo = checkboxDemoPage.clickONSingleCheckBox();
        Assert.assertTrue(checkBoxUnderSingleCheckboxDemo.isSelected());
        checkboxDemoPage.clickONSingleCheckBox();
        Assert.assertFalse(checkBoxUnderSingleCheckboxDemo.isSelected());
    }

    @Test
    public void scenarioThree(){
        homePage.clickOnJavaScriptsAlertLink();
        javaScriptAlertBoxDemoPage.clickOnClickMeButton();
        String actualAlertMessage = javaScriptAlertBoxDemoPage.returnAlertMessage();
        Assert.assertEquals(actualAlertMessage,"I am an alert box!");
    }
}
