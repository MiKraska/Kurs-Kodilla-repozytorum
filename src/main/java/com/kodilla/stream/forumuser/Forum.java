package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1,"Adam Małysz",'M',LocalDate.of(1973,1,15),3));
        forumUserList.add(new ForumUser(2,"Adam Mickiewicz",'M',LocalDate.of(2003,4,15),0));
        forumUserList.add(new ForumUser(3,"Jonna Zmorska",'F',LocalDate.of(2001,5,15),153));
        forumUserList.add(new ForumUser(4,"Anna Lewandowska",'F',LocalDate.of(1977,5,17),2000));
        forumUserList.add(new ForumUser(5,"Adnrzej Andrzejewski",'M',LocalDate.of(1953,5,15),1));
        forumUserList.add(new ForumUser(6,"Karolina Ziemkowska",'F',LocalDate.of(1933,2,12),16));

    }
    public  List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
