import actions.ValidatorOperation;
import authentication.Auth;
import com.relevantcodes.extentreports.LogStatus;
import listeners.ExtentTestManager;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class NewAddEndpointTest {

    @Test
    public void validLoginTest(Method method) {

        ExtentTestManager.startTest(method.getName(), "Description: Valid Add Endpoint Test");
        Auth response = new Auth();
        String token = response.getLoginToken("admin", "password123");

        try {
            //ExtentTestManager.getTest().log(LogStatus.INFO, "URL is: " +response.url)
            response.assertIt(200);
            ExtentTestManager.getTest().log(LogStatus.INFO, "Asserting response code");

            response.assertIt("token", null, ValidatorOperation.NOT_EMPTY);
            ExtentTestManager.getTest().log(LogStatus.INFO, "Asserting response value not empty case");

            response.assertIt("token", null, ValidatorOperation.NOT_NULL);
            ExtentTestManager.getTest().log(LogStatus.INFO, "Asserting response value not null case");
        } catch (AssertionError e) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Assertion Failure: " + e.getMessage());
        }
    }

    @Test
    public void invalidLoginTest(Method method) {

        ExtentTestManager.startTest(method.getName(), "Description: InValid Login Scenario with username and password.");
        Auth response = new Auth();
        String token = response.getLoginToken("dummy", "dummypassword123");

        try {
            //ExtentTestManager.getTest().log(LogStatus.INFO, "URL is: " +response.url);
            response.assertIt(200);
            ExtentTestManager.getTest().log(LogStatus.INFO, "Asserting response code");

            response.assertIt("reason", "Bad credentials", ValidatorOperation.EQUALS);
            ExtentTestManager.getTest().log(LogStatus.INFO, "Asserting response value == Bad credentials");

        } catch (AssertionError e) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Assertion Failure: " + e.getMessage());
        }

    }

}