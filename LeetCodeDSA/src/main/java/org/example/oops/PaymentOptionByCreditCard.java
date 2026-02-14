package org.example.oops;

public class PaymentOptionByCreditCard implements Payment{

    @Override
    public void pay(String card) {
        if(card.equalsIgnoreCase("Credit")) {
            System.out.println("Pay by Credit Card");
        }
        else{
            throw new IllegalArgumentException("Only credit card payment allowed");
        }
    }
}
