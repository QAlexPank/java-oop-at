package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseTest;

import static org.junit.jupiter.api.Assertions.fail;

public class SearchTest extends BaseTest {

//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Поиск
//    В поле Поиск ввести текст: java
//    Проверить что отобразились блоки:
//    Профессии
//            Курсы
//    Вебинары
//            Блоги
//    Форум
//            Тесты
//    Проекты и компании


    @Test
    public void checkSearch() {
        chromeDriver.findElement(By.cssSelector("[class=\"top-menu-mobile-toggle pull-right js-top-menu-mobile-toggle\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"nav\"] a[href=\"/courses\"]")).click();
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"top-menu-mobile-toggle pull-right js-top-menu-mobile-toggle\"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"main-mobile-menu-header\"] a [class=\"svg-icon icon-search \"]")).click();
        chromeDriver.findElementByCssSelector("[name=\"q\"]")
                .sendKeys("java");
        wait15second.until(ExpectedConditions.textToBePresentInElement(
                chromeDriver.findElementByXPath("//div/header/h2[text()='Профессии']"), "Профессии"));

        String professions_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"professions\"] span")).getText();
        int professions_count = Integer.parseInt(professions_word);
        if (professions_count >= 2) {
            System.out.println("Не менее 2 профессий");
        } else {
            System.out.println("Ошибка. Не верное значение профессий");
        }

        String courses_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"courses\"] span")).getText();
        int courses_count = Integer.parseInt(courses_word);
        if (courses_count > 15) {
            System.out.println("Курсов более 15");
        } else {
            System.out.println("Ошибка. Не верное значение курсов");
        }

        String webinars_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"webinars\"] span")).getText();
        int webinars_count = Integer.parseInt(webinars_word);
        if ((webinars_count > 180) && (webinars_count < 300)) {
            System.out.println("Вебинаров больше чем 180, но меньше 300");
        } else {
            System.out.println("Ошибка. Не верное значение вебинаров");
        }

        chromeDriver.findElement(By.xpath(".//*[text()='Java Junior. Что нужно знать для успешного собеседования?']/.."));

        String blogs_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"blogs\"] span")).getText();
        int blogs_count = Integer.parseInt(blogs_word);
        if (blogs_count > 300) {
            System.out.println("Блогов более 300");
        } else {
            System.out.println("Ошибка. Не верное значение блогов");
        }

        String forums_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"forums\"] span")).getText();
        int forums_count = Integer.parseInt(forums_word);
        if (forums_count != 350) {
            System.out.println("Форумов не 350");
        } else {
            System.out.println("Ошибка. Не верное значение форумов");
        }

        String tests_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"tests\"] span")).getText();
        int tests_count = Integer.parseInt(tests_word);
        if (tests_count != 0) {
            System.out.println("Тестов не 0");
        } else {
            System.out.println("Ошибка. Не верное значение тестов");
        }

        chromeDriver.findElement(By.cssSelector("h3 [href=\"/career/682\"]"));
    }

}

