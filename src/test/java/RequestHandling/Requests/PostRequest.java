package RequestHandling.Requests;

import RequestHandling.RequestInfo;
import RequestHandling.UserInfo;
import Utility.Variables.StatusCodes;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Class PostRequest
 * This Class is designed to perform Post Requests using Rest Assured Library.
 */
public class PostRequest implements Request {
    private UserInfo userInfo;

    /**
     * Constructor for class PostRequest
     */
    public PostRequest() {
    }

    /**
     * Another constructor for class PostRequest
     *
     * @param userInfo: userInfo instance to use in class.
     */
    public PostRequest(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * doRequest
     * Performs GET request to given URL.
     *
     * @param requestInfo: Information holder class for following variables:
     *                     apiUrl: API Url to do GET request
     *                     operation: Operation decider. Use Operations class under Utility/Variables to choose which operation to perform
     *                     params: Parameter list, if exists.
     *                     expected: Expected result from given operation and given list, if exists.
     *                     expectedStatusCode: Expected response status code after request has been sent.
     */
    public void doRequest(RequestInfo requestInfo) {
        // If userInfo is null, we expect no body from result because it should return bad request.
        if (userInfo != null) {
            // If expected result is OK, then we assume there is a body. Else, there is no body.
            if (requestInfo.getStatusCode() == StatusCodes.STATUS_OK) {
                given().auth().basic(userInfo.getUsername(), userInfo.getPassword()).
                        when().
                        post(requestInfo.getApiUrl() + "/" + requestInfo.getOperation() + "?params=" + requestInfo.getParams()).
                        then().
                        statusCode(requestInfo.getStatusCode()).
                        body("result", equalTo(requestInfo.getExpectedResult() + ""), "user", equalTo(userInfo.getUsername()));
            } else {
                given().auth().basic(userInfo.getUsername(), userInfo.getPassword()).
                        when().
                        post(requestInfo.getApiUrl() + "/" + requestInfo.getOperation() + "?params=" + requestInfo.getParams()).
                        then().
                        statusCode(requestInfo.getStatusCode());
            }
        } else {
            given().when().
                    post(requestInfo.getApiUrl() + "/" + requestInfo.getOperation() + "?params=" + requestInfo.getParams()).
                    then().
                    statusCode(requestInfo.getStatusCode());
        }
    }
}
