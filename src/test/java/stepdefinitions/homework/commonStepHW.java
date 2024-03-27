package stepdefinitions.homework;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class commonStepHW {
    WebDriver driver;
    @Given("user goes to url")
    public void user_goes_to_url() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }
    @When("user click on start")
    public void user_click_on_start() {
        driver.findElement(By.id("button00")).click();
    }
    @Then("one button raised to clicked")
    public void one_button_raised_to_clicked() {
        driver.findElement(By.id("button01")).click();

    }
    @Then("two button raised to clicked")
    public void tow_button_raised_to_clicked() {
        driver.findElement(By.id("button02")).click();

    }
    @Then("three button raised to clicked")
    public void three_button_raised_to_clicked() {
        driver.findElement(By.id("button03")).click();

    }
    @Then("see message 'All Buttons Clicked!")
    public void see_message_all_buttons_clicked() {
        Assert.assertTrue(driver.findElement(By.id("buttonmessage")).isDisplayed());
    }

}