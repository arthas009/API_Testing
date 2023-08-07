import RequestHandling.RequestHandler;
import org.testng.annotations.Test;

/**
 * Class InvalidRequestTypesTests
 * Contains Non-Existing Endpoint test cases
 */
public class InvalidRequestTypesTests extends BaseClass {

    @Test(priority = 1, description = "Tests HEAD request without user." +
            "Verifies response status code is 404 (NOT FOUND) for division HEAD requests.")
    public void invalidRequestTypeTest_Head() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestInvalidType(getAPI_URL(), "HEAD");
    }

    @Test(priority = 2, description = "Tests PUT request without user." +
            "Verifies response status code is 404 (NOT FOUND) for division PUT requests.")
    public void invalidRequestTypeTest_Put() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestInvalidType(getAPI_URL(), "PUT");
    }

    @Test(priority = 3, description = "Tests DELETE request without user." +
            "Verifies response status code is 404 (NOT FOUND) for division DELETE requests.")
    public void invalidRequestTypeTest_Delete() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestInvalidType(getAPI_URL(), "DELETE");
    }

    @Test(priority = 4, description = "Tests PATCH request without user." +
            "Verifies response status code is 404 (NOT FOUND) for division PATCH requests.")
    public void invalidRequestTypeTest_Patch() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestInvalidType(getAPI_URL(), "PATCH");
    }

    @Test(priority = 5, description = "Tests OPTIONS request without user." +
            "Verifies response status code is 404 (NOT FOUND) for division OPTIONS requests.")
    public void invalidRequestTypeTest_Options() {
        RequestHandler requestHandler = new RequestHandler(getUserInfo());
        requestHandler.requestInvalidType(getAPI_URL(), "OPTIONS");
    }
}
