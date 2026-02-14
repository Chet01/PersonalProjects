package org.example.oops;

public class PaymentOptionByDebitCard implements Payment{
    @Override
    public void pay(String card) {
        if(card.equalsIgnoreCase("Debit")) {
            System.out.println("Pay by Debit Card");
        }
    }
}
