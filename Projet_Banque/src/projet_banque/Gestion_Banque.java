
package projet_banque;
import java.util.Scanner;
public class Gestion_Banque {
public static void Choix_Operation() {
System.out.println("\n Bienvenue cher(e) client(e)!"
                + "Quelle operation souhaitez vous realiser"
                + "\n 1 - Ouvrir un compte"
                + "\n 2 - Deposer un montant sur votre compte"
                + "\n 3 - Retirer un montant de votre compte"
                + "\n 4 - Consulter le solde de votre compte"
                + "\n 5 - Calcul de l'interet de tous les comptes"
                + "\n 6 - Produire rapport d'activites"
                + "\n 7 - Trouver le nombre de comptes d'un client"
                + "\n *** Tapez 0 pour sorir *** ");
}
public static void Autre_Operation() {
System.out.print(" Veuillez taper 8 pour effectuer une autre"
                + " operation ou 0 pour sortir :");
}
    
}
