public class App {
    public static void main(String[] args) throws Exception {
        BankAccount miro = new BankAccount(1122,20000,4.5);
        System.out.println(miro +"\n");
        miro.withdraw(2500);
        System.out.println(miro +"\n");
        miro.deposit(3000);

        System.out.println(miro + "\nDate created: " + miro.getDate());
    }
}
