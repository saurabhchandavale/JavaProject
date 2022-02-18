public class Account {
        private String Number;
        private double Balance;
        private String Name;
        private String Email;
        private String PhoneNumber;

    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }
    public void DepositMoney(double DepositMoney){
        this.Balance += DepositMoney;
        System.out.println("Deposit is successful, New Balance " + this.Balance);
    }
    public void WithDraw(double WithdrawalMoney){
        if(this.Balance - WithdrawalMoney < 0){
            System.out.println("WithDraw Unsuccessful " + this.Balance + " left.");
        }else{
            this.Balance -= WithdrawalMoney;
            System.out.println("Withdraw Successful, Current balance is " + this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
