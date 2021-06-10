package Selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Selenium_sport24 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String playername = "Сидни Кросби";

        driver.get("https://sport24.ru/");
        //Нажатие кнопки бокового меню
        driver.findElement(By.className("_15actI")).click();
        //Нажатие кнопки "Поиск по сайту"
        driver.findElement(By.className("_1YAzux")).click();
        //Создание ссылки на поисковую строку с именем searchbox
        WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[1]/input"));
        searchbox.click();
        //Ввод в поисковую строку имени игрока и нажатие клавиши Enter
        searchbox.sendKeys(playername + Keys.ENTER);
        //Установка ожидания длительносью 2с
        Thread.sleep(2000);
        //Поиск контейнера с найденным именем игрока по имени класса
        WebElement box = driver.findElement(By.className("_3CDElX"));
        //Передача текста из тега span в переменную playerfound
        String playerfound = box.findElement(By.tagName("span")).getText();
        driver.quit();

        //Проверка соответствия между искомым игроком и найденым, в случае соответствия "Success", в случае несоответствия "Failure"
        if (playername.equals(playerfound)){
            System.out.println("Success");
        }
        else{
            System.out.println("Failure");
        }
    }
}