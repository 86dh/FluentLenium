package org.fluentlenium.adapter.cucumber.integration.tests.cucumber.api.multiinheritance.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.fluentlenium.adapter.cucumber.integration.page.LocalPage;
import org.fluentlenium.adapter.cucumber.integration.page.LocalPage2;
import org.fluentlenium.core.annotation.Page;

public class MultiGetBeanStep2 extends FluentCucumberTest {

    @Page
    protected LocalPage page;
    @Page
    protected LocalPage2 page2;

    @When(value = "scenario multi2 I click on next page")
    public void step2() {
        page.clickLink();
    }

    @Then(value = "scenario multi2 I am on the second page")
    public void step3() {
        page2.isAt();
    }
}
