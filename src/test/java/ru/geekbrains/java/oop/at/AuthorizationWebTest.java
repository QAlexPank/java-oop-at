package ru.geekbrains.java.oop.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.page.sing.AuthorizationPage;

@Feature("Авторизация")
@Story("Проверка авторизации")
@DisplayName("Проверка авторизации")
public class AuthorizationWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка авторизации с корректными данными")
    @Test
    void events() {
        String login = "hks47018@eoopy.com";
        String password = "hks47018";
        new AuthorizationPage(driver)
                .openUrl()
                .authorization(login,password)
                .checkNamePage("Главная");
    }
}
