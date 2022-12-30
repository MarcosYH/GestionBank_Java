package methode;

public class NormalAccount extends BankAccount{

    private int pret;
    public static int numcomptes=0;
    public NormalAccount(){
        super();
        super.owner ="sans nom";
        super.number= nextNumber();
        super.solde=0;
        super.interst=0;
    }

    public NormalAccount(String client, int num, double soldes ) {
        super();
        super.setOwner(client);
        super.setNumber(nextNumber());
        super.setSolde(num);
        super.setInterst(soldes);

    }
    public  int calcultInteret(){
        return (int)interst + solde*5/100;
    }
    public int nextNumber(){
    numcomptes++;
    return numcomptes-1;


    }
}
