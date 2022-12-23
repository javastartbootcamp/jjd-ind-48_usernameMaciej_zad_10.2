package pl.javastart.task;

public class SubscriptionPhoneContract implements Phone {
    private int pricePerMonth;
    private int smsNumber;
    private int mmsNumber;
    private int secondsSpendOnTalking;

    public SubscriptionPhoneContract(int pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    @Override
    public void sendSms() {
        smsNumber++;
    }

    @Override
    public int call(int seconds) {
        secondsSpendOnTalking += seconds;
        return secondsSpendOnTalking;
    }

    @Override
    public void sendMms() {
        mmsNumber++;
    }

    @Override
    public void printAccountState() {
        System.out.println("=== STAN KONTA ===");
        System.out.println("Wysłałeś " + smsNumber + " SMS");
        System.out.println("Wysłałeś " + mmsNumber + " MMS");
        System.out.println("Rozmawiałeś przez: " + secondsSpendOnTalking + " sekund");
        System.out.println("Kwota do zapłacenia co każdy miesiąc: " + pricePerMonth + "zł");
        System.out.println();
    }

}
