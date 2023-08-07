import RequestHandling.RequestHandler;
import Utility.Variables.StatusCodes;
import org.testng.annotations.Test;

/**
 * Class SubtractionEndpointTest
 * Contains Subtraction Endpoint test cases
 */
public class SubtractionEndpointTest extends BaseClass {

    @Test(priority = 1, description = "Tests subtract operation with GET request with user." +
            "Verifies response status code is 404 (NOT FOUND) for subtract GET requests with user.")
    public void subtractionTest_Get() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestSubtraction("GET", getAPI_URL(), getSubtractionParams(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 2, description = "Tests subtract operation with POST request with user." +
            "Verifies response status code is 200 (OK) for subtract POST requests." +
            "Verifies result coming from subtract endpoint is equal to the expected result.")
    public void subtractionTest_Post() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestSubtraction("POST", getAPI_URL(), getSubtractionParams(), StatusCodes.STATUS_OK);
    }

    @Test(priority = 3, description = "Tests subtract operation with GET request without user." +
            "Verifies response status code is 404 (NOT FOUND) for subtract GET requests without user.")
    public void subtractionTest_GetWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestSubtractionWithoutUsername("GET", getAPI_URL(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 4, description = "Tests subtract operation with POST request without user " +
            "Verifies response status code is 400 (BAD REQUEST) for subtract POST requests without user.")
    public void subtractionTest_PostWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestSubtractionWithoutUsername("POST", getAPI_URL(), StatusCodes.STATUS_BAD_REQUEST);
    }

}
