package interfaces;

import actions.HttpOperation;
import actions.ValidatorOperation;

import java.util.List;

public interface IApi {

    void init(String url, HttpOperation method);

    void setHeader(String[][] head);

    void setHeader(String head, String val);

    void setBody(String body);

    void setFormParam(String key, String val);

    void setQueryParam(String key, String val);

    String callIt();

    Object assertIt(int code);

    Object assertIt(String key, Object val, ValidatorOperation operation);

    void assertIt(List<List<Object>> data);

    static void failTest(String expected, String present) {
        throw new AssertionError("Does not contain the expected\t " + expected + "\n but had\t" + present);
    }

    static void failTest(String message) {throw new AssertionError(message);}

    void fileUpload(String key, String path, String mime);

    String extractString(String path);

    int extractInt(String path);

    List extractList(String path);

    Object extractIt(String path);

    String extractHeader(String header_name);

    String getResponseString();

    void printResp();

}
