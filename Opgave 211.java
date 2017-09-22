package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast antal år: ");
        int år = input.nextInt();

        // Her beregnes antal af mennesker, disse tal er fra en hjemmeside der hedder:
        // http://www.worldometers.info/world-population/
        // det er antaget, at de tal er korrekte, og at der er en eksponientel stigning i antal mennesker

        double nuvPopulation = 7569; //Tallet er i millioner, men det er for langt at skrive.
        double forøgelse = 78.5; // Tallet er her også i millioner.
        double befolkning = (nuvPopulation) + (forøgelse * år);

        //Resultatet vises her:

        System.out.println("Nuværende antal mennesker i verden er: " + nuvPopulation + " millioner.");
        System.out.println("Antal af mennesker, der kommer hvert år er: " + forøgelse + " millioner.");
        System.out.println("Om " + år + " år er jordens befolkning " + befolkning + " millioner.");




    }
}
