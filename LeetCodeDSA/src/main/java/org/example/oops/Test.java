package org.example.oops;

public class Test {
    public static void main(String[] args){
        User user = new User(949,"Chethan Kumar N");
        System.out.println(user.id);
        System.out.println(user.name);

        BankAccount bankAccount = new BankAccount(String.valueOf(53284),0.0);
        String accountNum = bankAccount.getAccountNumber();
        System.out.println(accountNum);
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(1232);
        bankAccount.withdraw(123);
        System.out.println(bankAccount.getBalance());

        Vehicle vehicle = new Vehicle();
        vehicle.startVehicle();
        vehicle.stopVehicle();

        Vehicle vehicle1 = new Car();
        vehicle1.startVehicle();
        vehicle1.stopVehicle();

        Payment payment = new PaymentOptionByCreditCard();
        payment.pay("Cash");
    }
}
