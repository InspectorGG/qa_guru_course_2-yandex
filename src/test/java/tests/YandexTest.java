package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.Click;
import com.codeborne.selenide.commands.PressTab;
import javafx.scene.control.Tab;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class YandexTest {    
    @Test
    void selenideSearchTest() {

        open("https://yandex.ru");
        Configuration.holdBrowserOpen = true;

        $(byName("text")).setValue("qa.guru").pressEnter();

        $(byLinkText("2")).click();

        $("html").shouldHave(text("qa.guru"));
}

}



