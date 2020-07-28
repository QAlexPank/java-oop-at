package ru.geekbrains.java.oop.at.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.block.Navigation;

public class ContentPage extends PageFactory {

    @FindBy(css = "[class*='gb-header__content']")
    private WebElement header;

    @FindBy(css = "[class='site-footer__content']")
    private WebElement footer;

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement namePage;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

    private Navigation navigation;

    public ContentPage(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }

    public WebElement getButtonClosePopUp1() {
        return buttonClosePopUp1;
    }

    public WebElement getButtonClosePopUp2() {
        return buttonClosePopUp2;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }

    public WebElement getNamePage() { return namePage; }
}
