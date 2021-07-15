package findSelenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
    void  softAssertionsTest(){
        // открыть страницу
        open("https://github.com/selenide/selenide");
        // Перейти в wiki
        $(byText("Wiki")).click();
        // Перейти в раздел SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $(byText("SoftAssertions")).click();
        // Проверить, что на странице есть код для тестов JUNIT5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));


    }
}
