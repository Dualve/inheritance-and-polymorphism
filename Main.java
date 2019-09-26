package com.company;

public class Main {

    public static void main(String[] args) {
	    CardAction dc1 = new CardAction();
	    CardAction dc2 = new CreditCardAction();
	    CreditCardAction cc = new CreditCardAction();
	    //CreditCardAction cc1 = new CardAction(); - ошибка
        //Rubl d = dc1.doPayment(15.5);
        //Rubl d1 = dc2.doPayment(13.5);
        Rubl d2 = cc.doPayment(12.5);
        Dollar d3 = dc1.doPayment(15.5);
        Dollar d4 = dc2.doPayment(13.5);
        Dollar d5 = cc.doPayment(12.5);
        cc.checkCreditLimit();
        //dc2.checkCreditLimit(); - ошибка - неполиморфный метод
    }
}
