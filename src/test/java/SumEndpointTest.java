import RequestHandling.RequestHandler;
import Utility.Variables.StatusCodes;
import org.testng.annotations.Test;

/**
 * Class SumEndpointTest
 * Contains Sum Endpoint test cases
 */
public class SumEndpointTest extends BaseClass {

    @Test(priority = 1, description = "Tests sum operation with GET request with user." +
            "Verifies response status code is 200 (OK) for sum GET requests." +
            "Verifies result coming from sum endpoint is equal to the expected result.")
    public void sumTest_Get() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestSum("GET", getAPI_URL(), getSumParam(), StatusCodes.STATUS_OK);
    }

    @Test(priority = 2, description = "Tests sum operation with POST request with user." +
            "Verifies response status code is 404 (NOT FOUND) for sum POST requests with user.")
    public void sumTest_Post() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestSum("POST", getAPI_URL(), getSumParam(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 3, description = "Tests sum operation with GET request without user " +
            "Verifies response status code is 400 (BAD REQUEST) for sum GET requests without user.")
    public void sumTest_GetWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestSumWithoutUsername("GET", getAPI_URL(), StatusCodes.STATUS_BAD_REQUEST);
    }

    @Test(priority = 4, description = "Tests sum operation with POST request without user." +
            "Verifies response status code is 404 (NOT FOUND) for sum POST requests without user.")
    public void sumTest_PostWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestSumWithoutUsername("POST", getAPI_URL(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 5, description = "Tests sum operation with get request with multiple parameter and with user." +
            "Verifies response status code is 400 (STATUS_BAD_REQUEST) for sum get requests with multiple parameter and with user.")
    public void sumTest_PostMultipleParams() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestSumMultipleParams(getAPI_URL(), StatusCodes.STATUS_BAD_REQUEST);
    }
}
