package Selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Selenium_sport24 {

    public static boolean searcher(String playername) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sports.ru/");
        //Создание элемента поисковой строки сайта
        WebElement searchbox = driver.findElement(By.className("search-block-trigger"));
        searchbox.click();
        //Ожидание загрузки страницы 2 секунды
        Thread.sleep(2000);
        //Ввод в поисковую строку имени игрока и нажатие клавиши Enter
        searchbox.sendKeys(" "+playername + Keys.ENTER);
        //Ожидание загрузки страницы 2 секунды
        Thread.sleep(2000);
        //Поиск контейнера с найденным именем игрока по имени класса
        WebElement box = driver.findElement(By.className("overBox"));
        //Передача текста из тега <a> в переменную playerfound
        String playerfound = box.findElement(By.tagName("a")).getText();
        driver.quit();
        //Проверка соответствия между искомым и найденым игроком
        return playername.equals(playerfound);

    }
}