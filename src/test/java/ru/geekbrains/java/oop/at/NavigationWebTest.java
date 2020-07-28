package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.ContentPage;

import java.util.stream.Stream;

@DisplayName("Тест на навигацию")
public class NavigationWebTest extends BaseWebTest {

    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/events");
    }

    @AfterEach
    void tearDown() {
        ContentPage contentPage = PageFactory.initElements(driver, ContentPage.class);

        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getHeader()));
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getFooter()));
    }

    @DisplayName("Курсы")
    @Test
    public void courses() {
        String namePage="Курсы";
        ContentPage contentPage = new ContentPage(driver);

        contentPage.getNavigation().getButton(namePage).click();
        contentPage.getButtonClosePopUp1().click();
        contentPage.getButtonClosePopUp2().click();

        contentPage.checkNamePage(namePage);
    }


    @ParameterizedTest
    @MethodSource("dataProvider")
    public void courses(String namePage) {
        ContentPage contentPage = new ContentPage(driver);
        contentPage.getNavigation().getButton(namePage).click();
        contentPage.checkNamePage(namePage);
    }

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Форум", "topics"),
                Arguments.of("Блог", "posts"),
                Arguments.of("Вебинары", "events"),
                Arguments.of("Тесты", "tests"),
                Arguments.of("Карьера", "career")
        );
    }
}


