package RequestHandling.Requests;

import RequestHandling.UserInfo;
import Utility.Variables.StatusCodes;

import static io.restassured.RestAssured.given;

/**
 * Class OtherRequests
 * This Class is designed to perform Requests other than GET and POST using Rest Assured Library.
 */
public class OtherRequests {
    UserInfo userInfo;

    /**
     * Constructor for class OtherRequests
     */
    public OtherRequests() {
    }

    /**
     * Another constructor for class OtherRequests
     *
     * @param userInfo: userInfo instance to use in class.
     */
    public OtherRequests(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * doRequest
     * Performs given request type to given URL.
     *
     * @param apiUrl:      API Url to do GET request
     * @param requestType: Used to identify which request to send
     */
    public void doRequest(String apiUrl, String requestType) {

        switch (requestType) {
            case "HEAD":
                if (this.userInfo.getUsername() != null) {
                    // If expected result is OK, then we assume there is a body
                    given().auth().basic(this.userInfo.getUsername(), this.userInfo.getPassword()).when().
                            head(apiUrl).
                            then().
                            statusCode(StatusCodes.STATUS_NOT_FOUND);
                }
            case "DELETE":
                if (this.userInfo.getUsername() != null) {
                    // If expected result is OK, then we assume there is a body
                    given().auth().basic(this.userInfo.getUsername(), this.userInfo.getPassword()).when().
                            delete(apiUrl).
                            then().
                            statusCode(StatusCodes.STATUS_NOT_FOUND);
                }
            case "PUT":
                if (this.userInfo.getUsername() != null) {
                    // If expected result is OK, then we assume there is a body
                    given().auth().basic(this.userInfo.getUsername(), this.userInfo.getPassword()).when().
                            put(apiUrl).
                            then().
                            statusCode(StatusCodes.STATUS_NOT_FOUND);
                }
            case "PATCH":
                if (this.userInfo.getUsername() != null) {
                    // If expected result is OK, then we assume there is a body
                    given().auth().basic(this.userInfo.getUsername(), this.userInfo.getPassword()).when().
                            patch(apiUrl).
                            then().
                            statusCode(StatusCodes.STATUS_NOT_FOUND);
                }
            case "OPTIONS":
                if (this.userInfo.getUsername() != null) {
                    // If expected result is OK, then we assume there is a body
                    given().auth().basic(this.userInfo.getUsername(), this.userInfo.getPassword()).when().
                            options(apiUrl).
                            then().
                            statusCode(StatusCodes.STATUS_NOT_FOUND);
                }
            default:
        }
    }
}
