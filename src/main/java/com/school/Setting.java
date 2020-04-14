package com.school;

import org.checkerframework.checker.units.UnitsTools;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.Keys.ENTER;

public class Setting {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    }


    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.dns-shop.ru/");

        WebElement site = driver.findElement(By.xpath("//*[text()='Компьютеры']"));
        site.click();
        //site.wait(5000);
        WebElement site1 = driver.findElement(By.xpath("(//a[contains(@href,'periferiya-i-aksessuary')])[2]"));
        site1.click();
        sleep(3000);
        driver.findElement(By.xpath("//a[@class='category-item-desktop ui-link ui-link_blue' and contains(@href,'monitory')]")).click();
        sleep(3000);
        driver.findElement(By.xpath("//*[@name='q' and @autocomplete='off']")).click();
        driver.findElement(By.xpath("//*[@name='q' and @autocomplete='off']")).sendKeys("acer");
        driver.findElement(By.xpath("//*[@name='q' and @autocomplete='off']")).sendKeys(ENTER);
        sleep(2000);
        driver.findElement(By.xpath("//*[@data-position-index='0']//*[@class='ui-link']")).click();
        sleep(1500);
        driver.findElement(By.xpath("//*[@class='buttons-wrapper buttons-wrapper_without-by-in-shop']/button//span[text()='Купить']")).click();


    }
}