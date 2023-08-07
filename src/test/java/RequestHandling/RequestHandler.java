package RequestHandling;

import RequestHandling.Requests.GetRequest;
import RequestHandling.Requests.OtherRequests;
import RequestHandling.Requests.PostRequest;
import Utility.ParameterHandler;
import Utility.Variables.Operations;

import java.util.List;

/**
 * Class RequestHandler
 * This class is designed to operate and perform which requests.
 */
public class RequestHandler {
    UserInfo userInfo;

    /**
     * Constructor for class RequestHandler
     */
    public RequestHandler() {
    }

    /**
     * Another constructor for class RequestHandler
     *
     * @param userInfo: userInfo instance to use in class.
     */
    public RequestHandler(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * requestAdd
     * Does Add request to given URL. Calculates expected result inside if needed.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param params:      Parameter list, if exists.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestAdd(String requestType, String apiURL, String params, int statusCode) {
        List<Integer> integerParams = ParameterHandler.extractIntegersFromParams(params);
        int expected = integerParams.get(0);

        for (int i = 1; i < integerParams.size(); i++)
            expected += integerParams.get(i);

        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.ADD_OPERATION, params, expected, statusCode);

        if (requestType.equals("GET"))
            new GetRequest(this.userInfo).doRequest(requestInfo);
        else
            new PostRequest(this.userInfo).doRequest(requestInfo);
    }

    /**
     * requestAddition
     * Does Multiplication request to given URL. Calculates expected result inside if needed.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param params:      Parameter list, if exists.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestMultiplication(String requestType, String apiURL, String params, int statusCode) {
        List<Integer> integerParams = ParameterHandler.extractIntegersFromParams(params);
        int expected = integerParams.get(0);

        for (int i = 1; i < integerParams.size(); i++)
            expected *= integerParams.get(i);

        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.MULTIPLY_OPERATION, params, expected, statusCode);

        if (requestType.equals("GET"))
            new GetRequest(this.userInfo).doRequest(requestInfo);
        else
            new PostRequest(this.userInfo).doRequest(requestInfo);
    }

    /**
     * requestDivision
     * Does Division request to given URL. Calculates expected result inside if needed.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param params:      Parameter list, if exists.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestDivision(String requestType, String apiURL, String params, int statusCode) {
        List<Integer> integerParams = ParameterHandler.extractIntegersFromParams(params);
        int expected = integerParams.get(0);

        for (int i = 1; i < integerParams.size(); i++)
            expected /= integerParams.get(i);

        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.DIVIDE_OPERATION, params, expected, statusCode);

        if (requestType.equals("GET"))
            new GetRequest(this.userInfo).doRequest(requestInfo);
        else
            new PostRequest(this.userInfo).doRequest(requestInfo);
    }

    /**
     * requestSubtraction
     * Does Subtraction request to given URL. Calculates expected result inside if needed.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param params:      Parameter list, if exists.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestSubtraction(String requestType, String apiURL, String params, int statusCode) {
        List<Integer> integerParams = ParameterHandler.extractIntegersFromParams(params);
        int expected = integerParams.get(0);

        for (int i = 1; i < integerParams.size(); i++)
            expected -= integerParams.get(i);

        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.SUBTRACT_OPERATION, params, expected, statusCode);

        if (requestType.equals("GET"))
            new GetRequest(this.userInfo).doRequest(requestInfo);
        else
            new PostRequest(this.userInfo).doRequest(requestInfo);
    }

    /**
     * requestSum
     * Does Sum request to given URL. Calculates expected result inside if needed.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param param:       Parameter, if exists.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestSum(String requestType, String apiURL, String param, int statusCode) {
        int integerParam = Integer.valueOf(param);
        int expected = integerParam * (integerParam + 1) / 2;

        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.SUM_OPERATION, param, expected, statusCode);

        if (requestType.equals("GET"))
            new GetRequest(this.userInfo).doRequest(requestInfo);
        else
            new PostRequest(this.userInfo).doRequest(requestInfo);
    }

    /**
     * requestAddWithoutUsername
     * Does Add request to given URL without any username in header.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestAddWithoutUsername(String requestType, String apiURL, int statusCode) {
        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.ADD_OPERATION, "", 0, statusCode);

        if (requestType.equals("GET"))
            new GetRequest().doRequest(requestInfo);
        else
            new PostRequest().doRequest(requestInfo);
    }

    /**
     * requestMultiplicationWithoutUsername
     * Does Multiplication request to given URL without any username in header.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestMultiplicationWithoutUsername(String requestType, String apiURL, int statusCode) {
        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.MULTIPLY_OPERATION, "", 0, statusCode);

        if (requestType.equals("GET"))
            new GetRequest().doRequest(requestInfo);
        else
            new PostRequest().doRequest(requestInfo);
    }

    /**
     * requestDivisionWithoutUsername
     * Does Division request to given URL without any username in header.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestDivisionWithoutUsername(String requestType, String apiURL, int statusCode) {
        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.DIVIDE_OPERATION, "", 0, statusCode);

        if (requestType.equals("GET"))
            new GetRequest().doRequest(requestInfo);
        else
            new PostRequest().doRequest(requestInfo);
    }

    /**
     * requestSubtractionWithoutUsername
     * Does Subtraction request to given URL without any username in header.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestSubtractionWithoutUsername(String requestType, String apiURL, int statusCode) {
        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.SUBTRACT_OPERATION, "", 0, statusCode);

        if (requestType.equals("GET"))
            new GetRequest().doRequest(requestInfo);
        else
            new PostRequest().doRequest(requestInfo);
    }

    /**
     * requestSumWithoutUsername
     * Does Sum request to given URL without any username in header.
     *
     * @param requestType: It should be GET or POST. Decides which one to do.
     * @param apiURL:      API Url to do request.
     * @param statusCode:  Expected result from given operation and given list, if exists.
     */
    public void requestSumWithoutUsername(String requestType, String apiURL, int statusCode) {
        RequestInfo requestInfo = new RequestInfo(requestType, apiURL, Operations.SUM_OPERATION, "", 0, statusCode);

        if (requestType.equals("GET"))
            new GetRequest().doRequest(requestInfo);
        else
            new PostRequest().doRequest(requestInfo);
    }

    /**
     * requestSumMultipleParams
     * Does Sum (GET) request to given URL without any username in header.
     *
     * @param apiURL:     API Url to do request.
     * @param statusCode: Expected result from given operation and given list, if exists.
     */
    public void requestSumMultipleParams(String apiURL, int statusCode) {
        RequestInfo requestInfo = new RequestInfo("GET", apiURL, Operations.SUM_OPERATION, "12,14", 0, statusCode);

        new GetRequest(this.userInfo).doRequest(requestInfo);
    }

    /**
     * requestInvalidType
     * Does an request with invalid request type to given
     */
    public void requestInvalidType(String apiURL, String requestType) {
        new OtherRequests(this.userInfo).doRequest(apiURL, requestType);
    }
}
