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

    @When("click on fifth grade")
    public void clickOnFifthGrade() {
        secondScreen.clickOnFifthGradeButton();
    }

    @When("click on math category")
    public void clickOnMathCategory() {
        secondScreen.clickOnMathCategoryButton();
    }

    @When("click on teacher {string}")
    public void clickOnTeacher(String TeacherName) {
        secondScreen.clickOnTeacherNameButton();
    }

    @Then("teacher salary per hour should be {string}")
    public void teacherSalaryPerHourShouldBe(String salary) {
        Assert.assertEquals(secondScreen.getTeacherSalary().getText(),salary);
    }
}
