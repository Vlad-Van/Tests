package Selenium_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Selenium_sport24Test {

    @Test
    public void matchCheck() throws InterruptedException {
        Selenium_sport24 player = new Selenium_sport24();
        Assertions.assertTrue(player.searcher("Сидни Кросби"));
    }
}