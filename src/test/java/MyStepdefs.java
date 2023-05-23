import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MyStepdefs {

    WebDriver driver= DriverFactory.getDriver();

    RenaultPages renaultPages =new RenaultPages(driver);

    @Given("User opens homepage")
    public void userOpensHomepage() {
        renaultPages.homePage();
    }

    @When("Click find authorized dealer button")
    public void clickFindAuthorizedDealerButton() {
        renaultPages.findAuthorizedDealerButton();
    }

    @When("Check authorized dealer page")
    public void checkAuthorizedDealerPage() {
        renaultPages.authorizedDealerPage();
    }

    @When("Enter location")
    public void enterLocation() {
        renaultPages.location();
    }

    @When("Click the first location")
    public void clickTheFirstLocation() {
        renaultPages.firstLocation();
    }

    @When("Click filter button")
    public void clickFilterButton() {
        renaultPages.filterButton();
    }

    @When("Filter for new car and accept")
    public void filterForNewCarAndAccept() {
        renaultPages.newCar();
    }

    @When("Click first branch")
    public void clickFirstBranch() {
        renaultPages.firstBranch();
    }

    @When("Click online service appointment")
    public void clickOnlineServiceAppointment() {
        renaultPages.serviceAppointment();
    }

    @Then("User access the appointment page")
    public void userAccessTheAppointmentPage() {
        renaultPages.accessAppointmentPage();
    }

}
