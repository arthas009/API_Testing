import RequestHandling.RequestHandler;
import Utility.Variables.StatusCodes;
import org.testng.annotations.Test;

/**
 * Class AddEndpointTest
 * Contains Add Endpoint test cases
 */
public class AddEndpointTest extends BaseClass {

    @Test(priority = 1, description = "Tests add operation with GET request with user." +
            "Verifies response status code is 404 (NOT FOUND) for add GET requests with user.")
    public void addingTest_Get() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestAdd("GET", getAPI_URL(), getAddingParams(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 2, description = "Tests add operation with POST request with user " +
            "Verifies response status code is 200 (OK) for add POST requests." +
            "Verifies result coming from add endpoint is equal to the expected result.")
    public void addingTest_Post() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestAdd("POST", getAPI_URL(), getAddingParams(), StatusCodes.STATUS_OK);
    }

    @Test(priority = 3, description = "Tests add operation with GET request without user " +
            "Verifies response status code is 404 (NOT FOUND) for add GET requests without user.")
    public void addTest_GetWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestAddWithoutUsername("GET", getAPI_URL(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 4, description = "Tests add operation with POST request without user " +
            "Verifies response status code is 400 (BAD REQUEST) for add POST requests without user.")
    public void addTest_PostWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestAddWithoutUsername("POST", getAPI_URL(), StatusCodes.STATUS_BAD_REQUEST);
    }

}
