package RequestHandling;

/**
 * Class RequestInfo
 * This class is designed to keep request information
 */
public class RequestInfo {
    private String requestType;
    private String apiUrl;
    private String operation;
    private String params;
    private int expectedResult;
    private int statusCode;

    /**
     * constructor for class RequestInfo
     */
    public RequestInfo() {
    }

    /**
     * Another constructor for class RequestInfo
     *
     * @param requestType:    Type of Request (GET, POST or others).
     * @param apiUrl:         URL of api to do request.
     * @param operation:      Operation selector (ADD, MULTIPLY etc.).
     * @param params:         Parameters to use in operation.
     * @param expectedResult: Expected result of operation.
     * @param statusCode:     Expected status code from request.
     */
    public RequestInfo(String requestType, String apiUrl, String operation, String params, int expectedResult, int statusCode) {
        this.requestType = requestType;
        this.apiUrl = apiUrl;
        this.statusCode = statusCode;
        this.params = params;
        this.operation = operation;
        this.expectedResult = expectedResult;
    }

    /**
     * Getters and Setters for class variables
     */
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(int expectedResult) {
        this.expectedResult = expectedResult;
    }
}
