package org.example;

import com.codeborne.selenide.Condition;
import com.thoughtworks.gauge.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepImplementation {
    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws InterruptedException {
        open("https://yandex.ru/");
    }

    @Step("Ensure installation instructions are available")
    public void ensureInstallationInstructionsAreAvailable() throws InterruptedException {
        $("div.home-logo__default").shouldBe(Condition.visible);
    }
}
