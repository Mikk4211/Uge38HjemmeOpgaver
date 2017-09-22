package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Tekst til scanneren
        System.out.println("Indtast meter");
        int meter = input.nextInt();


        // Viser udregning ud fra indtastede data
        double meterConvert = 3.2786;
        double result = meter * meterConvert;

        // Resultat
        System.out.println(meter + " meter er " + result + " fod.");



    }
}
