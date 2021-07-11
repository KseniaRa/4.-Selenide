package findSelenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class selenideTest {
    @Test
    void  SoftAssertionsTest(){
        // открыть страницу github.com
        open("https://github.com");
        // ввести selenide
        $("[name=q]").setValue("selenide").pressEnter();
        // выбрать первый элемент из списка
        $$(".repo-list li").first().$("a").click();
        // Перейти в wiki
        $(byText("Wiki")).click();
        // Перейти в раздел SoftAssertions
        $(byText("Soft assertions")).click();
        // Проверить, что на странице есть код для JUNIT5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));


    }
}
