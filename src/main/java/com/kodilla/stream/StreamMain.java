package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter(sex -> sex.getSex() == 'M')
                .filter(date -> ChronoUnit.YEARS.between(date.getDateOfBirth(),LocalDate.now()) >= 20)
                .filter(posts -> posts.getPostNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);

//        Rozwiązanie zadania 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("I'm sexy and i know it",(a -> a.toUpperCase())));
        System.out.println(poemBeautifier.beautify("I'm sexy and i know it",(a -> a + "ABC")));
        System.out.println(poemBeautifier.beautify("I'm sexy and i know it",(a -> "ABC" + a)));
        System.out.println(poemBeautifier.beautify("I'm sexy and i know it",(a -> a.toLowerCase())));
        System.out.println(poemBeautifier.beautify("I'm sexy and i know it ",(a ->  a + a)));
    }
}
