package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("The options are:");
        short factionNumber = 0;
        for (Faction faction : Faction.values()) {
            System.out.println(factionNumber + ". " + faction);
            factionNumber++;
        }

        App.getFactionInput();
    }

    static void getFactionInput() throws IOException {
        System.out.println("Please input a number to select a race/faction");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int factionInput = Integer.parseInt(reader.readLine());
        Faction faction = Faction.values()[factionInput];
        Generator generator = new Generator(faction);
        generator.getOptions();
    }

    protected static void outputName(final String[] name) {
        System.out.println(name.toString());
    }
}
