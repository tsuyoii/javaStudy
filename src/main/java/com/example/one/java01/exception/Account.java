package com.example.one.java01.exception;
//异常综合练习
public class Account {
    protected double balance;
    public Account(double balance){
        this.balance=balance;
    }
    public static void main(String[] args){
        Account ac = new Account(300);
        try{
            ac.withdraw(200);
        }catch(OverdraftException e){
            e.printStackTrace();
        }
    }
    //查余额
    public double getBalance(){
        return balance;
    }
    //存钱
    public void deposit(double amt){
        this.balance+=amt;
    }
    //取钱
    public void withdraw(double amt)throws OverdraftException{
        if(balance<amt){
            throw new OverdraftException("余额不足",amt-this.balance);
        }
        this.balance-=amt;
    }
    //自定义异常：透支异常
    class OverdraftException extends Exception{
        private double deficit;//透支额
        public OverdraftException(){

        }
        public OverdraftException(String message,double deficit){
            super(message);
        }
        public double getDeficit(){
            return deficit;
        }
    }
}
class CheckingAccount extends Account{
    private double overdraftProtection;//透支额度
    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance,double protect){
        super(balance);
    }
    public void withdraw(double amt){

    }
}
