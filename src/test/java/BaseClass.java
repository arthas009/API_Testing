import RequestHandling.UserInfo;
import Utility.YamlReader;

public class BaseClass {
    public YamlReader configurationReader;
    private String API_URL;
    private String addingParams;
    private String multiplicationParams;
    private String divisionParams;
    private String substractionParams;
    private String sumParam;

    private UserInfo userInfo;

    public BaseClass() {
        configurationReader = new YamlReader("Configuration/configuration.yaml");
        this.userInfo = new UserInfo(configurationReader.getVariable("USERNAME"), configurationReader.getVariable("PASSWORD"));
        this.API_URL = configurationReader.getVariable("URL");
        this.addingParams = configurationReader.getVariable("ADD_VALUES");
        this.multiplicationParams = configurationReader.getVariable("MUL_VALUES");
        this.divisionParams = configurationReader.getVariable("DIV_VALUES");
        this.substractionParams = configurationReader.getVariable("SUB_VALUES");
        this.sumParam = configurationReader.getVariable("SUM_VALUE");
    }

    /**
     * getAPI_URL
     * Gets API_URL string which is read from configuration.yaml. This variable is used to do get/post requests to given URL.
     */
    public String getAPI_URL() {
        return API_URL;
    }

    /**
     * getAddingParams
     * Gets addingParams string which is read from configuration.yaml. This variable is used as parameter list in URL while doing add request.
     */
    public String getAddingParams() {
        return addingParams;
    }

    /**
     * getMultiplicationParams
     * Gets multiplicationParams string which is read from configuration.yaml. This variable is used as parameter list in URL while doing multiplication request.
     */
    public String getMultiplicationParams() {
        return multiplicationParams;
    }

    /**
     * getMultiplicationParams
     * Gets divisionParams string which is read from configuration.yaml. This variable is used as parameter list in URL while doing division request.
     */
    public String getDivisionParams() {
        return divisionParams;
    }

    /**
     * getSubtractionParams
     * Gets substractionParams string which is read from configuration.yaml. This variable is used as parameter list in URL while doing subtraction request.
     */
    public String getSubtractionParams() {
        return substractionParams;
    }

    /**
     * getSumParam
     * Gets sumParam string which is read from configuration.yaml. This variable is used as parameter list in URL while doing sum request.
     */
    public String getSumParam() {
        return sumParam;
    }

    /**
     * userInfo
     * Gets userInfo string which is used to keep user information in system.
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }
}
