package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.driver;
public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        System.out.println("Before the scenario: Setting up the environment");
        System.out.println("Scenario id: "+scenario.getId());
        System.out.println("Scenario name: "+scenario.getName());

    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("After scenario, cleaning up the test environment");
        System.out.println("Scenario status: "+scenario.getStatus());
        System.out.println("Scenario isFailed?: "+scenario.isFailed());
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","FailedScreenshot");

        }
    }
}