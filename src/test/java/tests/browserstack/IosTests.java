package tests.browserstack;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IosTests extends TestBase{

    @Tag("ios")
    @Test
    @DisplayName("Authorization test")
    void loginTest() {
        step("Click button", () -> {
            $(AppiumBy.id("Text Button")).click();
        });
        step("Write email", () -> {
            $(AppiumBy.id("Text Input")).click();
            $(AppiumBy.id("Text Input")).sendKeys("mail@gmail.com");
            $(AppiumBy.id("Text Input")).pressEnter();
        });
        step("Check result", () -> {
            assertEquals("mail@gmail.com", $(id("Text Output")).getText());
        });
    }
}