package StepDefinition;

import io.cucumber.java.en.*;

public class HomePage {
    @Given("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("testcase1");
    }
    @When("user click on login")
    public void user_click_on_login() {
        System.out.println("testcase2");
    }
    @When("clicks on submitt")
    public void clicks_on_submitt() {
        System.out.println("testcase3");
    }
    @Then("user is authorized")
    public void user_is_authorized() {
        System.out.println("testcase4");
    }
//Test
}
