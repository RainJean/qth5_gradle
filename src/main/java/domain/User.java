package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable{
    private Integer id;
    private String email;
    private String password;
    private java.sql.Timestamp lastLoginTime;
    private Integer loginCount;

    public User() {
    }

    public User(String email, String password, Timestamp lastLoginTime, Integer loginCount) {
        this.email = email;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
        this.loginCount = loginCount;
    }

    public User(Integer id, String email, String password, Timestamp lastLoginTime, Integer loginCount) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
        this.loginCount = loginCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", loginCount=" + loginCount +
                '}';
    }
}
