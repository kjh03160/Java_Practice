package OOP;

public class Person {
    private int age;
    private String name;
    private int cashAmount;
    private BankAccount account;

    public Person(String pName, int pAge, int pCashAmount){
        name = pName;
        age = pAge;
        cashAmount = pCashAmount;
    }


    public Person(String pName, int pAge){
        name = pName;
        age = pAge;
        cashAmount = 0;
    }

    public void setAge(int newAge){
        if (newAge >= 0){
            age = newAge;
        }
    }
    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setCashAmount(int amount){
        if (amount >= 0){
            cashAmount = amount;
        }
    }

    public void setAccount(BankAccount newAccount){
        account = newAccount;
    }

    public int getCashAmount(){
        return cashAmount;
    }

    public String getName(){
        return name;
    }

    public BankAccount getAccount(){
        return account;
    }

    public boolean transfer(Person to, int amount){
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount){
        return account.transfer(to, amount);
    }
}

