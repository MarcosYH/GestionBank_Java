package methode;

public class SparingAccount extends BankAccount{
    public SparingAccount(String client, double numero, int solde){
        super(client, numero,solde);
    }
    public  int calcultInteret(){
        return (int)interst + solde*5/100;
    }

}
