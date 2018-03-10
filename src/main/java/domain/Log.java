package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Log implements Serializable{

    private Integer id;
    private java.sql.Timestamp loginTime;
    private User user;

    public Log() {
    }

    public Log(Timestamp loginTime, User user) {
        this.loginTime = loginTime;
        this.user = user;
    }

    public Log(Integer id, Timestamp loginTime, User user) {
        this.id = id;
        this.loginTime = loginTime;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", loginTime=" + loginTime +
                ", user=" + user +
                '}';
    }
}
