package pl.javastart.task;

public class MixPhoneContract implements Phone {
    private int smsNumber;
    private int mmsNumber;
    private int secondsOfConversation;
    private int secondsLeft;

    public MixPhoneContract(int smsNumber, int mmsNumber, int secondsOfConversation) {
        this.smsNumber = smsNumber;
        this.mmsNumber = mmsNumber;
        this.secondsOfConversation = secondsOfConversation;
    }

    @Override
    public void sendSms() {
        if (smsNumber > 0) {
            smsNumber--;
            System.out.println("SMS wysłany");
        } else if (smsNumber == 0) {
            System.out.println("Nie można wysyłać już SMSów");
        }
    }

    @Override
    public int call(int seconds) {
        if (secondsLeft >= secondsOfConversation) {
            System.out.println("Wykorzystałeś wszystkie sekundy rozmowy");
        }
        secondsLeft += seconds;
        return secondsLeft;
    }

    @Override
    public void sendMms() {
        if (mmsNumber > 0) {
            mmsNumber--;
            System.out.println("MMS wysłany");
        } else if (mmsNumber == 0) {
            System.out.println("Nie można wysyłać już SMSów");
        }
    }

    @Override
    public void printAccountState() {
        System.out.println();
        System.out.println("=== STAN KONTA ===");
        System.out.println("Możliwych SMSów do wysłania pozostało: " + smsNumber);
        System.out.println("Możliwych MMSów do wysłania pozostało: " + mmsNumber);
        System.out.println("Wykorzystałeś " + secondsLeft + " z " + secondsOfConversation + " sekund");
        System.out.println();
    }
}
