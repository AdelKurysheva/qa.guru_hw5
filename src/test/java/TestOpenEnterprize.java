import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestOpenEnterprize {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    void beforeEach() {
        Configuration.browser = "firefox";
    }

    @Test
    void testOpenEnterprise() {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".HeaderMenu-dropdown-link[href='/enterprise']").click();
        $(".h1-mktg.mb-3").shouldHave(text("Build like the best"));

    }

}
