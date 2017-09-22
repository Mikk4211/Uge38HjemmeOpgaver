package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Her kan man indtaste mål på trekantens side
        System.out.println(" Indtast mål på siden her ");
        double længde1 = input.nextDouble();

        // Her udregnes areal og rumfang
        double areal = (Math.sqrt(3)/(4)) * (længde1 * længde1);
        double rumfang = areal * længde1;

        // Her vises så resultatet af beregningerne

        System.out.println("Trekantens længde er " + længde1);
        System.out.println("Trekantens areal er " + areal);
        System.out.println("Trekantens rumfang er " + rumfang);


    }
}
