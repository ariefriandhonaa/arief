package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Hook;


public class instagramfeature {

    private WebDriver driver;

    public instagramfeature() {
        this.driver = Hook.getDriver();
    }

    @Given("^I open instagram browser$")
    public void i_open_instagram_browser() throws Throwable {
        System.out.println("instagram is opened successfully");
        driver.get("https://www.instagram.com/");
    }

    @Then("^I navigate to instagram page$")
    public void i_navigate_to_instagram_page() throws Throwable {
        driver.get("https://www.instagram.com/");
    }

    @Then("^I input email instagram \"([^\"]*)\"$")
    public void i_input_email_instagram(String email) throws Throwable {
        driver.findElement(By.xpath("//input[@name='username']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
        Thread.sleep(2000);
    }

    @Then("^I input email password \"([^\"]*)\"$")
    public void i_input_email_password(String email) throws Throwable {
        driver.findElement(By.xpath("//input[@name='password']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(email);
        Thread.sleep(2000);
    }

    @Then("^I click log in$")
    public void i_click_log_in() throws Throwable {
        driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
        Thread.sleep(2000);
    }



    @Then("^I click button create$")
    public void i_click_button_create() throws Throwable {
        driver.findElement(By.xpath("//div[7]//div[1]//div[1]//a[1]//div[1]//div[2]")).click();
        Thread.sleep(2000);
    }

    @Then("^I click select from computer$")
    public void i_click_select_from_computer() throws Throwable {
        WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
        chooseFile.sendKeys(System.getProperty("user.dir")+"/train.png");

    }

    @Then("^I change format picture$")
    public void i_change_format_picture() throws Throwable {
        driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1emribx x1e56ztr x1i64zmx x10l6tqk x1ey2m1c x17qophe x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1cy8zhl x1oa3qoh x1nhvcw1']//div//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1y1aw1k x1sxyh0 xwib8y2 xurb0ha x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s x1q0g3np xqjyukv x6s0dn4 x1oa3qoh xl56j7k']//*[name()='svg']")).click();

    }

    @Then("^I change to 169$")
    public void i_change_to_169() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'16:9')]")).click();

    }

    @Then("^I click next$")
    public void i_click_next() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();

    }

    @Then("^I click next2$")
    public void i_click_next2() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();

    }

    @Then("^I input caption \"([^\"]*)\"$")
    public void i_input_caption(String email) throws Throwable {
        driver.findElement(By.xpath("//div[@aria-label='Write a caption...']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@aria-label='Write a caption...']")).sendKeys(email);
        Thread.sleep(2000);
    }

    @Then("^I click share$")
    public void i_share() throws Throwable {
        driver.findElement(By.xpath("//div[contains(text(),'Share')]")).click();
        Thread.sleep(4000);
    }

    @Then("^I click close$")
    public void i_click_close() throws Throwable {
        driver.findElement(By.xpath("//div[@class='x1i10hfl x6umtig x1b1mbwd xaqea5y xav7gou x9f619 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8 x1hl2dhg xggy1nq x1a2a7pz x6s0dn4 x78zum5 xjbqb8w x1ejq31n xd10rxx x1sy0etr x17r0tee x1ypdohk xl56j7k x1y1aw1k x1sxyh0 xwib8y2 xurb0ha']")).click();
        Thread.sleep(2000);
    }

    @Then("^I click button home")
    public void i_click_button_home() throws Throwable {
        driver.findElement(By.xpath("//div[@role='button']")).click();
        Thread.sleep(2000);
    }

















}
