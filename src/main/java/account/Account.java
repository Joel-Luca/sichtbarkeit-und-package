package account;

public class Account {
    private static double saldo = 0;
    private static double zinssatz = 0.01;
    public static final String waehrung = "CHF";

    public static double getSaldo() {
        return saldo;
    }

    public static double getZinssatz() {
        return zinssatz;
    }

    public static double getZinsbetrag() {
        return saldo * zinssatz;
    }

    public static void zahleEin(double betrag) {
        if(betrag > 0) {
            saldo += betrag;
        }
        else {
            throw new IllegalArgumentException(
                    "Der Betrag muss grösser als 0 sein, um ihn aufs Konto zu laden."
            );
        }
    }

    public static void hebeAb(double betrag) {
        if(betrag <= saldo) {
            saldo -= betrag;
        }
        else {
            throw new IllegalArgumentException(
                    "Der Betrag, der abgehoben werden sollte, muss kleiner oder gleich gross wie der Kontostand sein."
            );
        }
    }

    public static void setZinssatz(double zinssatz) {
        Account.zinssatz = zinssatz;
    }
}
