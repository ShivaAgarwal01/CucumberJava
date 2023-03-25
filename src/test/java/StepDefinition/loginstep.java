package StepDefinition;


import io.cucumber.java.en.*;


public class loginstep {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("LoginPage");

    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Enter Username and pwd");

    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("clicks on login");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Navigae to homepage");
    }


}
