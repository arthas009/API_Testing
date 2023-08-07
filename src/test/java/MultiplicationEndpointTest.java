import RequestHandling.RequestHandler;
import Utility.Variables.StatusCodes;
import org.testng.annotations.Test;

/**
 * Class MultiplicationEndpointTest
 * Contains Multiplication Endpoint test cases
 */
public class MultiplicationEndpointTest extends BaseClass {

    @Test(priority = 1, description = "Tests multiply operation with GET request with user." +
            "Verifies response status code is 404 (NOT FOUND) for multiply GET requests with user.")
    public void multiplicationTest_Get() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestMultiplication("GET", getAPI_URL(), getMultiplicationParams(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 2, description = "Tests multiply operation with POST request with user." +
            "Verifies response status code is 200 (OK) for multiply POST requests." +
            "Verifies result coming from multiply endpoint is equal to the expected result.")
    public void multiplicationTest_Post() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestMultiplication("POST", getAPI_URL(), getMultiplicationParams(), StatusCodes.STATUS_OK);
    }

    @Test(priority = 3, description = "Tests multiply operation with GET request without user." +
            "Verifies response status code is 404 (NOT FOUND) for multiply GET requests without user.")
    public void multiplicationTest_GetWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestMultiplicationWithoutUsername("GET", getAPI_URL(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 4, description = "Tests multiply operation with POST request without user " +
            "Verifies response status code is 400 (BAD REQUEST) for multiply POST requests without user.")
    public void multiplicationTest_PostWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestMultiplicationWithoutUsername("POST", getAPI_URL(), StatusCodes.STATUS_BAD_REQUEST);
    }

}

