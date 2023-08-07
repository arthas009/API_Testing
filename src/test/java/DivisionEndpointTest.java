import RequestHandling.RequestHandler;
import Utility.Variables.StatusCodes;
import org.testng.annotations.Test;

/**
 * Class DivisionEndpointTest
 * Contains Division Endpoint test cases
 */
public class DivisionEndpointTest extends BaseClass {

    @Test(priority = 1, description = "Tests division operation with GET request with user." +
            "Verifies response status code is 404 (NOT FOUND) for division GET requests with user.")
    public void divisionTest_Get() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestDivision("GET", getAPI_URL(), getDivisionParams(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 2, description = "Tests division operation with POST request with user." +
            "Verifies response status code is 200 (OK) for division POST requests." +
            "Verifies result coming from division endpoint is equal to the expected result.")
    public void divisionTest_Post() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestDivision("POST", getAPI_URL(), getDivisionParams(), StatusCodes.STATUS_OK);
    }

    @Test(priority = 3, description = "Tests division operation with GET request without user." +
            "Verifies response status code is 404 (NOT FOUND) for division GET requests without user.")
    public void divisionTest_GetWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestDivisionWithoutUsername("GET", getAPI_URL(), StatusCodes.STATUS_NOT_FOUND);
    }

    @Test(priority = 4, description = "Tests division operation with POST request without user " +
            "Verifies response status code is 400 (BAD REQUEST) for division POST requests without user.")
    public void divisionTest_PostWithoutUser() {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.requestDivisionWithoutUsername("POST", getAPI_URL(), StatusCodes.STATUS_BAD_REQUEST);
    }

}
