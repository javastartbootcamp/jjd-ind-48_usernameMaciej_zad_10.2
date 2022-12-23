package pl.javastart.task;

public class CardPhoneContract implements Phone {
    private double moneyOnAccount;
    private double smsCost;
    private double mmsCost;
    private double minuteOfConversationCost;
    private int smsSend = 0;
    private int mmsSend = 0;
    private int callSeconds = 0;
    private double money;

    public CardPhoneContract(double moneyOnAccount, double smsCost, double mmsCost, double minuteOfConversationCost) {
        this.moneyOnAccount = moneyOnAccount;
        this.smsCost = smsCost;
        this.mmsCost = mmsCost;
        this.minuteOfConversationCost = minuteOfConversationCost;
    }

    @Override
    public void sendSms() {
        if (smsCost <= moneyOnAccount) {
            smsSend++;
            System.out.println("SMS wysłany");
        } else if (smsCost > moneyOnAccount) {
            smsSend--;
            System.out.println("Nie udało się wysłać SMSa");
        }
    }

    @Override
    public int call(int seconds) {
        // nie mam pojecia jak obliczyc zeby 60 sekund rozmowy odbieralo 50 groszy z konta
        callSeconds += seconds;
        return callSeconds;
    }

    private double sum() {
        return sumSms() + sumMms();
    }

    private double sumSms() {
        money += smsCost;
        double result = moneyOnAccount - money;
        if (result <= 0) {
            return Math.max(0, result);
        } else if (result >= 0) {
            return result;
        }
        return moneyOnAccount;
    }

    private double sumMms() {
        money += mmsCost;
        double result = moneyOnAccount - money;
        if (result <= 0) {
            return Math.max(0, result);
        } else if (result >= 0) {
            return result;
        }
        return moneyOnAccount;
    }

    @Override
    public void sendMms() {
        if (mmsCost <= moneyOnAccount) {
            mmsSend++;
            System.out.println("MMS wysłany");
        } else if (mmsCost > moneyOnAccount) {
            mmsSend--;
            System.out.println("Nie udało się wysłać MMSa");
        }
    }

    @Override
    public void printAccountState() {
        System.out.println();
        System.out.println("=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsSend);
        System.out.println("Wysłanych MMSów: " + mmsSend);
        System.out.println("Liczba sekund rozmowy: " + callSeconds);
        System.out.printf("Na koncie zostało: %.2f zł", sum());
        System.out.println();
    }
}
