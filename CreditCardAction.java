package com.company;

public class CreditCardAction extends  CardAction {
    //полля, конструкторы, методы
    public boolean checkCreditLimit(){
        //собственный метод
        return true;
    }

    @Override
    public Rubl doPayment(double amountPayment){
        //реализация
        System.out.println("complete from credit card");
        return new Rubl();
    }
}
