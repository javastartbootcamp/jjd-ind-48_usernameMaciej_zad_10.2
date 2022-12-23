package pl.javastart.task;

interface Phone {

    void sendSms();

    int call(int seconds);

    void sendMms();

    void printAccountState();
}
