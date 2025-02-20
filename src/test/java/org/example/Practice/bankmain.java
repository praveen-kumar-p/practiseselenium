package org.example.Practice;

public class bankmain {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        Bank bank3 = new Bank();
        bank1.bankname = "HDFC";
        bank1.holder = "Pradeep";
        bank1.balance = 5000;

        bank2.bankname = "ICICI";
        bank2.holder = "Jitendra";
        bank2.balance = 6000;

        bank3.bankname = "SBI";
        bank3.holder = "Harsha";
        bank3.balance = 8000;

//        System.out.println(bank1.bankname);
//        System.out.println(bank1.holder);
//        System.out.println(bank1.balance);

        // OR

        System.out.println("My bank name: " + bank1.bankname);
        System.out.println("My bank name: " + bank1.holder);
        System.out.println("My bank name: " + bank1.balance);


        System.out.println("---------------------------------");

//        System.out.println(bank2.bankname);
//        System.out.println(bank2.holder);
//        System.out.println(bank2.balance);
//
//        System.out.println("---------------------------------");
//
//        System.out.println(bank3.bankname);
//        System.out.println(bank3.holder);
//        System.out.println(bank3.balance);

        bank1.addmoney();
        bank1.checkbalance();
        bank1.withdrawal();

    }
}
