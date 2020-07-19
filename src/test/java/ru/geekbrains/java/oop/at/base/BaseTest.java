package ru.geekbrains.java.oop.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public ChromeDriver chromeDriver;
    public WebDriverWait wait15second;

    @BeforeEach
    public void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        chromeDriver.get("https://geekbrains.ru/events");

        wait15second = new WebDriverWait(chromeDriver, 15);
    }


    @AfterEach
    public void afterAll() {
        chromeDriver.quit();
    }

}
