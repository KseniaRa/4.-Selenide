package findSelenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenPage {
    @Test
    void openPage() {
        // открыть страницу Selenide
        open("https://github.com/selenide/selenide");
    }
}