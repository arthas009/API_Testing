package RequestHandling.Requests;

import RequestHandling.RequestInfo;

/**
 * Interface Request
 * Interface of GetRequest and PostRequest classes.
 */
public interface Request {

    /**
     * doRequest
     * A generic function to perform http requests
     *
     * @param requestInfo: Contains request information. See related class.
     */
    void doRequest(RequestInfo requestInfo);

}
