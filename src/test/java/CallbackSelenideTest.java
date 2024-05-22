import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CallbackSelenideTest {
    @Test
    void shouldTest(){
       open("http://localhost:9999/");
        SelenideElement form = $("[data-test-id=callback-form]");
        form.$("[data-test-id=name] input").setValue("Ewan");
        form.$("[data-test-id=phone] input").setValue("+79190000000");
        form.$("[data-test-id=agreement").click();
        form.$("[data-test-id=submit").click();
        $(".alert-success").shouldHave(Condition.exactText("Ваша заявка успешно отправлена!"));
    }
}
