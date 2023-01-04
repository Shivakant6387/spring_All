package org.example.Bank;

public class DetailBank {
    DetailBank(){}
    private Bank account;
    DetailBank(Bank account){
        this.account=account;
    }
    public void shout(){
        account.chache();
    }
}

