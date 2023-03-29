package stepdefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Hook;

public class dialer {
    private WebDriver driver;

    public dialer() {
        this.driver = Hook.getDriver();
    }
    @Given("^I close backup$")
    public void closeBackup() throws Throwable {
        driver.findElement(By.id("com.google.android.apps.photos:id/not_now_button")).click();

    }
    @When("^I click on library$")
    public void onLibrary() throws Throwable {
        driver.findElement(By.id("com.google.android.apps.photos:id/tab_library")).click();

    }

    @And("^I click on folder $")
    public void onFolder() throws Throwable {
        driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"aa, album\"]/android.widget.FrameLayout/android.view.View")).click();

    }
    @And("^I click on checkmark$")
    public void createContact() throws Throwable{
        driver.findElement(By.id("com.google.android.apps.photos:id/end_checkmark")).click();
        Thread.sleep(2000);
    }

    @Then("^I validate dialer view$")
    public void i_validate_dialer_view() throws Throwable {
        Assert.assertTrue(driver.findElement(By.id("com.google.android.apps.photos:id/recycler_view")).isDisplayed());

    }




}
