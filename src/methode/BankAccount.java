package methode;

import java.util.ArrayList;

abstract class BankAccount {

    protected String owner;
    protected int number;
    protected int solde;
    protected double interst;

    protected ArrayList pret= new ArrayList();


    public BankAccount(String client, double numCompte, double solde) {
    }

    public BankAccount(String owner, int number, int solde, double interst) {
        this.owner = owner;
        this.number = number;
        this.solde = solde;
        this.interst = interst;
    }

    public BankAccount() {

    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public int getSolde() {
        return solde;
    }

    public double getInterst() {
        return interst;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void setInterst(double interst) {
        this.interst = interst;
    }

    public void deposit(int montant){

        solde=solde+montant;
    }

    public void withdraw(int montant){

        solde=solde-montant;
    }



}

