package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("I'm sexy and i know it",(a -> a.toUpperCase()));
        poemBeautifier.beautify("I'm sexy and i know it",(a -> a + "ABC"));
        poemBeautifier.beautify("I'm sexy and i know it",(a -> "ABC" + a));
        poemBeautifier.beautify("I'm sexy and i know it",(a -> a.toLowerCase()));
        poemBeautifier.beautify("I'm sexy and i know it ",(a ->  a + a));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
