package com.lf.sample.model;

/**
 * Created by krishna on 1/18/16.
 */
public class UserInfo {

    private String name;
    private String jobTtile;
    private String profileUrl;

    public UserInfo(String name, String title,String avatar) {
        this.name = name;
        this.jobTtile = title;
        this.profileUrl = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTtile() {
        return jobTtile;
    }

    public void setJobTtile(String jobTtile) {
        this.jobTtile = jobTtile;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
