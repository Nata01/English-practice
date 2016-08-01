package application;

/**
 * Created by natad on 01.08.2016.
 */
public class User {
    private String badgeName;
    private Integer level;
    private String skypeLogin;

    public User() {
    }

    public User(String badgeName, Integer level, String skypeLogin) {
        this.badgeName = badgeName;
        this.level = level;
        this.skypeLogin = skypeLogin;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSkypeLogin() {
        return skypeLogin;
    }

    public void setSkypeLogin(String skypeLogin) {
        this.skypeLogin = skypeLogin;
    }
}
