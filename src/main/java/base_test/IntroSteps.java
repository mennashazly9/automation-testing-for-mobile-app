package base_test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.IntroScreen;
import screens.SecondScreen;

public class IntroSteps extends BaseTest {
    private IntroScreen introScreen = new IntroScreen();
    private SecondScreen secondScreen = new SecondScreen();
    @When("click on تصفح كزائر button")
    public void clickOnتصفحكزائرButton() {
        introScreen.clickOnButton();

    }

    @Then("screen will display مرحلتك الدراسيه")
    public void screenWillDisplayمرحلتكالدراسيه() {
        Assert.assertTrue(secondScreen.getTitle().isDisplayed());
    }
}
