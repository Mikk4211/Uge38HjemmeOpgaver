import java.util.Scanner;

public class Opgave21 {
    public static void main(String[] args) {


    // Her kan vi indsætte mil
    Scanner input = new Scanner(System.in);

    System.out.println(" Indtast antal mil: ");
    int mil = input.nextInt();

    // Definerer at vores værdier kan være kommatal
    double kilometer = 1.6;
    double result = mil * kilometer;

    String milResultat;
    milResultat = " mil omregnet til kilometer giver ";

    System.out.println( mil + milResultat + result + ".");
    }
    }
