package methode;

import java.util.ArrayList;

public class loan {
    protected int amount;
    protected  int mensuality;

    protected ArrayList ListeDesComptes= new ArrayList();

    public int getAmount() {
        return amount;
    }

    public int getMensuality() {
        return mensuality;
    }

    public void setAmount(int amount) {
        if (amount>0){
            this.amount = amount;
        }

    }

    public void setMensuality(int mensuality) {
        if (mensuality>0){
            this.mensuality = mensuality;
        }


    }

    public  loan(int pret, int b, BankAccount compte)
    {



    }
}
//<>