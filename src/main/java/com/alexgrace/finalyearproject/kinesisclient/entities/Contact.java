/*
 * Developed by Alex Grace for research purposes only. (ag00248@surrey.ac.uk)
 */

package com.alexgrace.finalyearproject.kinesisclient.entities;

public class Contact {
    public long getPhone() {
        return phone;
    }
    public String getFormattedPhone() {
        return formattedPhone;
    }
    public String getTwitter() {
        return twitter;
    }
    public String getInstagram() {
        return instagram;
    }
    public String getFacebook() {
        return facebook;
    }
    public String getFacebookUsername() {
        return facebookUsername;
    }
    public String getFacebookName() {
        return facebookName;
    }

    private long phone;
    private String formattedPhone;
    private String twitter;
    private String instagram;
    private String facebook;
    private String facebookUsername;
    private String facebookName;
}
