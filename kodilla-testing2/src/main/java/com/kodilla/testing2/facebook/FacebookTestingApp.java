package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//button[contains(@class, \"_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy\")]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//a[contains(@class, \"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]";

    public static final String XPATH_DATE_OF_BIRTH_DAY = "//select[@id=\"day\"]";
    public static final String XPATH_DATE_OF_BIRTH_MONTH = "//select[@id=\"month\"]";
    public static final String XPATH_DATE_OF_BIRTH_YEAR = "//select[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookiesButton = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookiesButton.click();

        WebElement createNewAccountButton = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        createNewAccountButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DATE_OF_BIRTH_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(1);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_DATE_OF_BIRTH_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(1);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_DATE_OF_BIRTH_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(25);

    }
}
