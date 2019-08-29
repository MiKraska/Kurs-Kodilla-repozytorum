package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
           String result = secondChallenge.probablyIWillThrowException(2,1);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Złapałem błąd");
        } finally {
            System.out.println("To musi tu być");
        }
    }
}
