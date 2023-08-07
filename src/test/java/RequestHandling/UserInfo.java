package RequestHandling;

/**
 * Class UserInfo
 * This class is designed to keep user information in requests
 */
public class UserInfo {
    private String username;
    private String password;

    /**
     * Constructor for class RequestInfo
     */
    public UserInfo() {
    }

    /**
     * Another constructor for class RequestInfo
     *
     * @param username: Username to use in requests
     * @param password: Password of username
     */
    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Getters and Setters for variables
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
