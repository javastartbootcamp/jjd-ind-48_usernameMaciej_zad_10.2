package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new CardPhoneContract(0.2, 0.1, 0.2, 0.5);
        Phone phone2 = new SubscriptionPhoneContract(50);
        Phone phone3 = new MixPhoneContract(100, 20, 1200);

//        phone2.printAccountState();
//        phone2.sendSms();
//        phone2.call(11);
//        phone2.sendMms();
//        phone2.sendMms();
//        phone2.sendMms();
//        phone2.printAccountState();

//        phone3.call(10);
//        phone3.printAccountState();
//
//        phone3.sendSms();
//        phone3.printAccountState();
//        phone3.call(120);
//        phone3.printAccountState();
//        phone3.call(110);
//        phone3.sendMms();
//        phone3.sendMms();
//        phone3.sendMms();
//        phone3.printAccountState();


        phone1.printAccountState();

        phone1.sendSms();
        phone1.printAccountState();

        phone1.sendSms();
        phone1.printAccountState();

        phone1.sendSms();
        phone1.printAccountState();
    }
}
