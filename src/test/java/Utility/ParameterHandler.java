package Utility;

import java.util.ArrayList;
import java.util.List;

/**
 * ParameterHandler
 * This class is responsible to convert List<Integer> params to String params or convert String params to List<Integer>.
 */
public class ParameterHandler {

    /**
     * concatenateParameters
     * Converts List<Integer> params to String. Params are divided by ',' in return String.
     *
     * @param paramsAsList: List<Integer> to convert into String.
     * @return Returns concatenated parameter string.
     */
    public static String concatenateParameters(List<Integer> paramsAsList) {
        StringBuilder paramsAsString = new StringBuilder();

        for (int i = 0; i < paramsAsList.size(); i++) {
            if (i == paramsAsList.size() - 1) {
                paramsAsString.append(paramsAsList.get(i));
                break;
            }
            paramsAsString.append(paramsAsList.get(i)).append(",");
        }

        return paramsAsString.toString();
    }

    /**
     * extractIntegersFromParams
     * Converts String params to List<Integer>.
     *
     * @param params: String to convert into List<Integer>.
     * @return Returns concatenated parameters List<Integer>.
     */
    public static List<Integer> extractIntegersFromParams(String params) {
        String[] splitString = params.split(",");
        List<Integer> returnArray = new ArrayList<>();

        for (String s : splitString) {
            returnArray.add(Integer.valueOf(s));
        }

        return returnArray;
    }

}
