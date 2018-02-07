
package projet_banque;

// Déclaration des attributs
import java.util.Scanner;
import java.util.ArrayList;

public class Transaction {
    
    private String Type_Transaction;
    private Compte Cpte;
    private String Date_Transaction;
    private Double Montant_Transaction;
    static ArrayList<Transaction> Liste_Transaction = new ArrayList<Transaction>();
    public Transaction(Compte Cpte, String Type_Transaction, String Date_Transaction,
            Double Montant_Transaction) {
       this.Cpte = Cpte;
        this.Type_Transaction = Type_Transaction;
        this.Date_Transaction = Date_Transaction;
        this.Montant_Transaction = Montant_Transaction;
    }
    // Setters et Getters
    public Compte getCompte(){
      return Cpte;
    }
    public String getType_Transaction() {
        return Type_Transaction;
    }
    public ArrayList<Transaction> getListe_Transaction(){
       return Liste_Transaction;
   }
    public void setListe_Transaction(ArrayList<Transaction> Liste_Transaction) {
        this.Liste_Transaction = Liste_Transaction;
   }
    public String getDate() {
        return Date_Transaction;
    }
    public Double getMontant_Transaction() {
        return Montant_Transaction;
    }
    public void setMontant_Transaction(Double Montant_Transaction) {
        this.Montant_Transaction = Montant_Transaction;
    }

    public void setType_Transaction(String Type_Transaction) {
        this.Type_Transaction = Type_Transaction;
    }

    public void setDate(String Date) {
        this.Date_Transaction = Date_Transaction;
    }
    public void setClient (Compte Cpte){
      this.Cpte = Cpte;
    }
     public static void Affichage_Liste_Operation(){
    if(Compte.Liste_Compte.isEmpty()){
    System.out.println(" Opération impossible! ");
    }
    else {
    for( int i=0; i<Liste_Transaction.size(); i++){
     System.out.println( Liste_Transaction.get(i).getCompte().getNum_Compte()+ " " +
            Liste_Transaction.get(i).Montant_Transaction + " " +
            Liste_Transaction.get(i).getType_Transaction() + " " +
            Liste_Transaction.get(i).Date_Transaction);
            }
        }
    }
}
