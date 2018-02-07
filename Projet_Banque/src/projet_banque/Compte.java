
package projet_banque;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Compte {
    private int Num_Compte;
    private Client Cl;
    private double Solde_Compte;
    private double Taux_Interet;
    private double Montant_Retrait;
    private double Montant_Depot; 
    private String  Date_Transaction;
    private int Duree;
    private String Type_Transaction;
    private Transaction Ts;
    static ArrayList<Compte> Liste_Compte = new ArrayList<Compte>();
    
// Constructeur
public Compte(int Num_Compte,Client Cl, 
    double Solde_Compte, double Taux_Interet){ 
    this.Num_Compte = Num_Compte + 1000; 
    this.Cl = Cl;
    this.Taux_Interet = Taux_Interet;
    this.Solde_Compte = Solde_Compte;
}    
// Getters Setters
public ArrayList<Compte> getListe_Compte() {
    return Liste_Compte;
}
public void setListe_Compte(){
    this.Liste_Compte = Liste_Compte;
}
public int getNum_Compte(){
    return Num_Compte;
}
public Client getClient(){
    return Cl;
}
public Transaction getTransaction(){
    return Ts;
}
public int getDuree(){
    return Duree;
}
public String getType_Transaction(){
    return Type_Transaction;
}
public void setType_Transaction(){
    this.Type_Transaction = Type_Transaction;
}
public void setDuree ( int Duree){
    this.Duree = Duree;
}
public void setClient (Client Cl){
    this.Cl = Cl;
}
public void setTransaction( Transaction Ts){
    this.Ts = Ts;
}
public double getTaux_Interet(){
    return Taux_Interet;
}
public double getSolde_Compte(){
    return Solde_Compte;
}
public double getMontant_Retrait(){
    return Montant_Retrait;
}
public double getMontant_Depot(){
    return Montant_Depot;
}
public String getDate_Operation(){
    return Date_Transaction;
}
public void setSolde_Compte(double Solde_Compte){
    this.Solde_Compte = Solde_Compte;
}
public void setdate(){
    this.Date_Transaction = Date_Transaction;
}
public void setNum_Compte( int Num_Compte){
   this.Num_Compte = Num_Compte;
}
public void setTaux_Interet(double Taux_Interet){
    this.Taux_Interet = Taux_Interet;
}
public void setMontant_Retrait(double Montant_Retrait){
    this.Montant_Retrait = Montant_Retrait;
}
public void setMontant_Depot(double Montant_Depot){
    this.Montant_Depot = Montant_Depot;
}  
// Création du nouveau Compte
public  static void  Creer_Nouveau_Compte(){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Veuillez entrer le numéro de compte: ");
    int Num_Compte = sc.nextInt();
    Scanner sc1 = new Scanner (System.in);
    System.out.println(" Veuillez entrer le numero Client: ");
    int Num_Client = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    System.out.println(" Veuillez entrer votre nom: ");
    String Nom_Client = sc2.nextLine();
    System.out.println(" Veuillez entrer votre Prenom: ");
    String Prenom_Client = sc2.nextLine();
    Scanner sc3 = new Scanner (System.in);
    System.out.println(" Veuillez entrer un taux d'intérêt compris entre 0 et 100: ");
    double Taux_Interet = sc3.nextDouble();
    if (Taux_Interet < 0 || Taux_Interet > 100){
    System.out.println(" Desolé, veuillez taper un nombre compris entre 0 et 100");
    } else { 
    Scanner sc4 = new Scanner(System.in);
    System.out.println("Veuillez entrer votre montant initial: ");
    double Solde_Compte = sc4.nextDouble();
    Client Cl = new Client(Num_Client, Nom_Client, Prenom_Client);
    Compte cp = new Compte (Num_Compte, Cl,
    Solde_Compte, Taux_Interet);
    Liste_Compte.add(cp);
    cp.Affichage_Nouveau_Compte(); 
    cp.Affichage_Liste_Client();
    }
}
public void Affichage_Nouveau_Compte(){
   System.out.println("Welcome!:" + " Numéro_Compte:" + Num_Compte + ""
   + " Numéro_Client:" + Cl.getNum_Client()+ " " + " Nom:" + Cl.getPrenom_Client()
   +" "+ " Prénom:" + Cl.getNom_Client() + " Taux d'intérêt:" + Taux_Interet 
   + " % " + " Solde: " + Solde_Compte);
} 
// Affichage Liste Client
public void Affichage_Liste_Client(){
   if(Liste_Compte.isEmpty()){
   System.out.println(" Desolé, Créer des comptes d'abord! ");
   }
   else {
   for( int i=0; i<Liste_Compte.size(); i++)
   System.out.println(
   + Liste_Compte.get(i).getNum_Compte()+ " " +
     Liste_Compte.get(i).getClient().getNum_Client()+ " " +
     Liste_Compte.get(i).getClient().getNom_Client()+ " " +
     Liste_Compte.get(i).getClient().getPrenom_Client()+ " " +
     Liste_Compte.get(i).getSolde_Compte() + " " +
     Liste_Compte.get(i).getTaux_Interet());
    } 
}
// Fonction qui fait Déposer de l'argent
public static void Deposer_Argent (){
    boolean exp = false;
    Scanner sc = new Scanner(System.in);
    String  Type_Transaction = "Depot";
    System.out.println(" Veuillez entrer votre numéro de Compte: ");
    int Num_Compte = sc.nextInt();
    for(Compte Cpte:Compte.Liste_Compte){
    if(Cpte.getNum_Compte() == Num_Compte ){
         exp = true;
    Scanner sc1 = new Scanner(System.in);
    System.out.println(" Veuillez entrer votre montant à Déposer: ");
    double Montant_Depot = sc1.nextDouble();
    double Montant_Transaction = Montant_Depot;
    Date actuelle = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String Date_Transaction = dateFormat.format(actuelle);
    double Nouveau_Solde = Cpte.Solde_Compte + Montant_Depot;
    Cpte.setSolde_Compte(Nouveau_Solde);
    
    Transaction Ts = new Transaction(Cpte, "Depot", Date_Transaction, Montant_Transaction);
      Transaction.Liste_Transaction.add(Ts);
    
    System.out.println(" Transaction effectuée avec succès: " + " Type_Transaction " 
             + Type_Transaction + " Montant_Transaction " + Montant_Depot + " Date_Transaction " 
             + Date_Transaction + " Nouveau_Solde " + Cpte.getSolde_Compte());     
            } 
        }
    if(!exp){   System.out.println(" Ce compte n'existe pas!");    
    }
} 
// Fonction pour Retirer de l'argent
public static void Retrait_Argent (){
    boolean exp = false;
    Scanner sc = new Scanner(System.in);
    String Type_Transaction = " Retrait";
    System.out.println(" Veuillez entrer votre numéro de Compte: ");
    int Num_Compte = sc.nextInt();
    for(Compte Cpte:Compte.Liste_Compte){
    if(Cpte.getNum_Compte() == Num_Compte ){
    exp = true;
    Scanner sc1 = new Scanner(System.in);
    System.out.println(" Veuillez entrer le montant de votre Retrait");
    double Montant_Retrait = sc1.nextDouble();
    double Montant_Transaction = Montant_Retrait;
    Date actuelle = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String Date_Transaction = dateFormat.format(actuelle);
    if (Cpte.Solde_Compte >= Montant_Retrait){
    double Nouveau_Solde = Cpte.Solde_Compte - Montant_Retrait;
    Cpte.setSolde_Compte(Nouveau_Solde);
    Transaction Ts = new Transaction(Cpte, "Retrait", Date_Transaction, 
    Montant_Transaction);
    Transaction.Liste_Transaction.add(Ts);
    System.out.println(" Transaction effectuée avec succès:" + 
    " Type_Transaction " + Type_Transaction + " Montant_Transaction " 
    + Montant_Retrait + " Date_Transaction " + Date_Transaction + 
    " Nouveau_Solde " + Cpte.getSolde_Compte());
    }else {System.out.println(" Retrait impossible, "
                    + "Solde insuffisant!");
                }              
            }                
       }
    if (!exp){System.out.println(" Ce compte n'existe pas!");}
}
// Fonction pour Calculer les Intérêts
public static void Calcul_Interet(){
    Scanner sc2 = new Scanner(System.in);
    System.out.println(" Veuillez entrer la durée de placement exprimée en année: ");     
    double Duree = sc2.nextDouble();
    // sc2.nextLine();
     if(Liste_Compte.isEmpty()){
     System.out.println(" Ce Client n'existe pas! ");
    }
    else {
    for( Compte Cpt : Compte.Liste_Compte){      
    double Interet_Compte = 
    (double)(Cpt.getSolde_Compte()*Cpt.getTaux_Interet()*Duree)/100;
    // Mise à jour des comptes
    double Annuite = Cpt.getSolde_Compte()+ Interet_Compte;
    Cpt.setSolde_Compte(Annuite);
    System.out.println(" Compte numéro: " +Cpt.getNum_Compte()+ " l'Intérêt est:"
    + " "+ Interet_Compte + " Mise à jour " +Cpt.getSolde_Compte());
                    }
                }                   
            }
}
    

     

 
  

