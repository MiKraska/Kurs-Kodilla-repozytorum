package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postNumber;

    public ForumUser(final int userID,final String username,final char sex,final LocalDate dateOfBirth,final int postNumber) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postNumber = postNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postNumber=" + postNumber +
                '}';
    }
}
