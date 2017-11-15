/* Lavet af Mikkel Sørensen
Mikk4211@edu.easj.dk
EASJ Næstved, DAT 1 */

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Input til hvor langt der er kørt
        System.out.println("Hvor langt har du kørt?: ");
        double antalKm = input.nextDouble();

        //Input til hvor mange KM din bil kører på literen
        System.out.println("Hvor mange KM kører din bil pr liter?: ");
        double antalKmL = input.nextDouble();

        //Input til hvad en liter benzin koster
        System.out.println("Hvor meget koster en liter benzin?: ");
        double literPris = input.nextDouble();

        // Udregningen af prisen for turen
        double totalPris = (antalKm / antalKmL) * literPris;


        System.out.println("Din tur har kostet " + totalPris + " kr.");

        //Jeg får en fejl med programmet (specifikt med scanneren) som jeg ikke lige kan se.
        



    }
}
