package Constructor;


public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int pBalance){
        if (pBalance < 0) balance = 0;
        else balance = pBalance;
    }

    public BankAccount(Person pOwner){
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner){
        owner = pOwner;
        if (pBalance < 0) balance = 0;
        else balance = pBalance;
    }


    public int getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setBalance(int newBalance) {
        if (balance >= 0) {
            balance = newBalance;
        }
    }

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    boolean withdraw(int amount){
        if (amount >= 0 && balance >= amount){
            balance -= amount;
            owner.setCashAmount(amount + owner.getCashAmount());
            System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());

            return true;
        }
        System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
        return false;
    }
    // public을 붙이면 외부에서도 접근 가능, 안 붙이면 패키지 내부에서만 접근 가
    boolean deposit(int amount){
        if (amount >= 0 && owner.getCashAmount() >= amount){
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance += amount;
            System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());
            return true;
        }
        System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
        return false;
    }

    boolean deposit(double amount, double exchangeRate){
        return deposit((int) (amount * exchangeRate));
    }

    public boolean transfer(Person to, int amount){
        return transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount){
        if (amount < 0 || balance < amount){
            System.out.printf("false - from: %s, to: %s, amount: %d, balance: %d\n", owner.getName(), to.getOwner().getName(), amount, balance);
            return false;
        }
        balance -= amount;
        to.balance += amount;
        System.out.printf("true - from: %s, to: %s, amount: %d, balance: %d\n", owner.getName(), to.getOwner().getName(), amount, balance);
        return true;
    }
}
