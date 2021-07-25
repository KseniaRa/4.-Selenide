package findSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragDrop {

    @Test
    void dragAndDrop(){
        // открыть страницу Drag and drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // поменять элменты местами
        $("#column-a").dragAndDropTo($("#column-b"));
        // проверить , что элемент а поменялся на элмент б
        $("#column-b").shouldHave(text("A"));


    }


}
