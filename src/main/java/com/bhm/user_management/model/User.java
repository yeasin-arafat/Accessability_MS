package com.bhm.user_management.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

/**
 * @author : arafat
 * @version : 1.0.0-snapshot
 * @description ...
 * @project : bhm
 * @since : 7/17/17
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "user")
public class User {

    @Indexed(unique = true)
    private String userName;
    private String password;
    private boolean isActive;
    private Timestamp lastLoginTimestamp;
    /**
     * lastLoginAttempt represents last five failed login attempt from IP Address(s)
     */
    private String lastLoginAttempt;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    public Timestamp getLastLoginTimestamp() {
        return lastLoginTimestamp;
    }

    public void setLastLoginTimestamp(Timestamp lastLoginTimestamp) {
        this.lastLoginTimestamp = lastLoginTimestamp;
    }

    public String getLastLoginAttempt() {
        return lastLoginAttempt;
    }

    public void setLastLoginAttempt(String lastLoginAttempt) {
        this.lastLoginAttempt = lastLoginAttempt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
