package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Fantasy Name Generator: ");
        System.out.println("Please input a race");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String race = reader.readLine();
        System.out.println("The race you've chosen is: " + race);
    }
}
