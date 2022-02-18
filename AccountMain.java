public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account("12345", 0, "Saurabh",
                "saurahchandavale@gmail.com", "9623086403");
        account.DepositMoney(500);
        account.WithDraw(400);
        account.DepositMoney(500);
        account.WithDraw(700);

    }
}
