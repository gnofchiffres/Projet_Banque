
package projet_banque;
import java.util.ArrayList;
import java.util.Scanner;
// Déclaration des attributs
    public class Client {
    private int Num_Client;
    private String Nom_Client;
    private String Prenom_Client;
    private Compte cp;
    public static ArrayList<Client> Liste_Client = new ArrayList<Client>();
// Constructeur
    public Client (int Num_Client, String Prenom_Client, String Nom_Client){
    this.Nom_Client = Nom_Client;
    this.Num_Client = Num_Client;
    this.Prenom_Client = Prenom_Client;
        }
// Setters et Getters
    public int getNum_Client(){
    return Num_Client;
    }
    public String getNom_Client(){
    return Nom_Client;
    }
    public String getPrenom_Client(){
    return Prenom_Client;
    }
    public void setPrenom_Client (String Prenom_Client){
        this.Prenom_Client = Prenom_Client;
    }
    public void setNum_Client (int Num_Client){
    this.Num_Client = Num_Client;
    }
    public void setNom_Client (String Nom_Client){
    this.Nom_Client = Nom_Client;
    }
     public String Affichage_Nouveau_Compte(){
         String Nouveau_Client = 
      ("--"  +Num_Client+" "+Nom_Client+ " "+ Prenom_Client);
         return Nouveau_Client;
     }
     
     // Consulter Solde
    public static void Consulter_Solde() {  
    boolean exp = false;
    Scanner sc = new Scanner(System.in);
    System.out.println(" Entrer votre numéro de Compte: ");
    int Num_Compte = sc.nextInt();
    for(Compte Cpt:Compte.Liste_Compte){
    if(Cpt.getNum_Compte() == Num_Compte ){
          exp = true;
    System.out.println(" Le solde de votre compte est: "+Cpt.getSolde_Compte());
           }
    }
    if (!exp){    System.out.println(" Ce compte n'existe pas!");         
        }
      
    } 

    public static void Nbre_Cpte_Client() {
    boolean exp = false;
    Scanner sc = new Scanner(System.in);
    System.out.println(" Entrer votre numéro de Compte: ");
    int Num_Compte = sc.nextInt();
    for(Compte Cpt:Compte.Liste_Compte){
    if(Cpt.getNum_Compte() == Num_Compte ){
          exp = true;  
    System.out.println(Cpt.getNum_Compte()+ " " + Cpt.getClient().getNum_Client() + " " 
    + Cpt.getClient().getNom_Client()+ " " + " " + Cpt.getClient().getPrenom_Client() + 
    " " + Cpt.getTaux_Interet() + " " + Cpt.getSolde_Compte());
        }
    }
    if (!exp){    System.out.println(" Ce numéro n'est pas un Client de la banque!");         
        } 
    }
}

  
      
    
    
    
