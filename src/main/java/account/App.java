package account;

public class App {
    public static void main(String[] args) {
        Account.zahleEin(100);
        System.out.println("Saldo: " + Account.getSaldo());

        Account.hebeAb(50);
        System.out.println("Saldo: " + Account.getSaldo());

        System.out.println("Zinssatz: " + Account.getZinssatz());
        System.out.println("Neuer Saldo: " + Account.getSaldo() + " + Zins " + Account.getZinsbetrag());

        Account.setZinssatz(0.02);
        System.out.println("Zinssatz: " + Account.getZinssatz());
        System.out.println("Neuer Saldo: " + Account.getSaldo() + " + Zins " + Account.getZinsbetrag());

        Account.hebeAb(100);
        Account.zahleEin(-100);
    }
}
