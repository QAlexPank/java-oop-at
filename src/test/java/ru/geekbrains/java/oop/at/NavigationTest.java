package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseTest;

public class NavigationTest extends BaseTest {

//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//            Вебинары
//    Форум
//            Блог
//    Тесты
//            Карьера

    @AfterEach
    void tearDown() {
        WebElement header = chromeDriver.findElementByCssSelector("[class*=\"gb-header__content\"]");
        WebElement footer = chromeDriver.findElementByCssSelector("[class=\"site-footer__content\"]");

        wait15second.until(ExpectedConditions.visibilityOf(
                header));
        wait15second.until(ExpectedConditions.visibilityOf(
                footer));
    }

    @Test
    public void courses() {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] a[href=\"/courses\"]")).click();
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void topics() {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] a[href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void posts() {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] a[href=\"/posts\"]")).click();
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void events() {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] a[href=\"/events\"]")).click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void tests() {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] a[href=\"/tests\"]")).click();
        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void career() {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] a[href=\"/career\"]")).click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

}
