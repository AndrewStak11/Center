package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Clickable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://skillfactory.ru/career-center");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#rec350865380 > div > div > div.t396__elem.tn-elem.tn-elem__3508653801630244968952 > a")).click();
            driver.findElement(By.cssSelector("#rec350932452 > div > div > div.t396__elem.tn-elem.tn-elem__3509324521628851978871 > a")).click();
            driver.findElement(By.cssSelector("#form349211843 > div.t-form__inputsbox.t-form__inputsbox_vertical-form.t-form__inputsbox_inrow > div.t-form__submit > button")).click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}