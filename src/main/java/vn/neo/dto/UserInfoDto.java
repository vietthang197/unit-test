package vn.neo.dto;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
public class UserInfoDto {
    private String username;
    private String password;

    public UserInfoDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

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
