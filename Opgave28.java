package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      System.out.println("Indtast forskydning: ");
      int forskydning = input.nextInt();

      // Antal millisekunder der er i dit system i dette øjeblik,
        // Så man på den måde kan finde tiden der er på din computer
     long totalMilliseconds = System.currentTimeMillis();

     //For at finde antal sekunder
        long totalSeconds = totalMilliseconds / 1000;

      // For at finde antal sekunder i forhold til min/time
      long currentSeconds = totalSeconds % 60;

      //For at finde antal minutter
        long totalMinutes = totalSeconds / 60;

      //Nuværende minut i timen

      long currentMinutes = totalMinutes % 60;

      // For at finde antal timer
        long totalHours = totalMinutes / 60;

      // Nuværende time
        long currentHours = totalHours % 24;
        currentHours = currentHours + forskydning;
      //Her kan resultatet så ses:

      System.out.println("Klokken er nu " + (currentHours+2) + ":" + currentMinutes + ":" + currentSeconds);

      //Jeg har valgt at sætte currentHours+2, da dette giver det korrekte resultat for vores tidszone.
        //Hvis jeg skrev forskydningen var +3, ville det kun give +1 time, fordi vi er 2 timer forud.
    }
}
