package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.driver;

public class ScenarioOutlineStepDef {
    @Given("the user navigates to the Ebay homepage")
    public void theUserNavigatesToTheEbayHomepage() {
        driver.getDriver().get("https://www.ebay.com");
        driver.getDriver().navigate().refresh();
    }

    @When("the user searches for {string}")
    public void theUserSearchesFor(String string) {
        WebElement searchBox =driver.getDriver().findElement(By.id("gh-ac"));
        searchBox.sendKeys(string, Keys.ENTER);
    }

    @Then("the user verifies that the search results contain {string}")
    public void theUserVerifiesThatTheSearchResultsContain(String string) {
        WebElement firstItem=driver.getDriver().
                findElement(By.xpath("//*[contains(@class,'srp-results')]" +
                        "/li[@data-viewport]/div/div/a/div/span"));

        Assert.assertTrue(firstItem.getText().toLowerCase().contains(string));
    }

    @When("I close the browser")
    public void iCloseTheBrowser() {
        //driver.closeDriver();

    }
}