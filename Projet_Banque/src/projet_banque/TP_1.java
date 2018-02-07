
package projet_banque;

import java.util.Scanner;
public class TP_1 {
public static void main(String[] args) {    
    Gestion_Banque.Choix_Operation();
    Scanner sc = new Scanner (System.in);
    int choix = 0;
    do {
    choix = sc.nextInt();
    switch (choix) {
    case 1:
    System.out.println(" ----------------------------------");
    System.out.println(" Creation de nouveau compte \n");
    Compte.Creer_Nouveau_Compte();
    Gestion_Banque.Autre_Operation();
    break;
    case 2:
    System.out.println(" ----------------------------------");
    System.out.println(" Dépôt d'argent sur le compte \n");
    Compte.Deposer_Argent();
    Gestion_Banque.Autre_Operation();
    break;
    case 3:
    System.out.println(" ----------------------------------");
    System.out.println(" Retrait d'argent sur le compte \n");
    Compte.Retrait_Argent ();
    Gestion_Banque.Autre_Operation();
    break;
    case 4:
    System.out.println(" ----------------------------------");
    System.out.println(" Consultation du solde de compte \n");
    Client.Consulter_Solde();
    Gestion_Banque.Autre_Operation();
    break;
    case 5:
    System.out.println(" ----------------------------------");
    System.out.println(" Calcul des intérêts et mise à jour \n");
    Compte.Calcul_Interet();
    Gestion_Banque.Autre_Operation();
    break;
    case 6:
    System.out.println(" ----------------------------------");
    System.out.println(" \n Rapport d'activites de la banque :");   
    Transaction.Affichage_Liste_Operation();
    Gestion_Banque.Autre_Operation();
    break;
    case 7:
    System.out.println(" Liste de tous les comptes du Client :");
    Client.Nbre_Cpte_Client();    
    Gestion_Banque.Autre_Operation();
    break;
    case 8: 
    Gestion_Banque.Choix_Operation();
    break;
    } 
    }while (choix != 0);
}
}
     
 
     
  
