package Constructor;

public class Person {
    private String name;
    private int age;
    private int cashAmount = 0;
    private BankAccount account;

    public Person(String name) {
        this(name, 12, 0); // 12살을 기본 나이로 설정, 초기 현금 보유액은 0원.
    }

    public Person(String name, int age){
        this.name = name;
        if (age < 0){
            this.age = 0;
        } else{
            this.age = age;
        }
    }

    public Person(String name, int age, int cashAmount){
        this.name = name;
        if (age < 0){
            this.age = 0;
        }
        else {
            this.age = age;
        }

        if (cashAmount < 0) {
            this.cashAmount = 0;
        }
        else{
            this.cashAmount = cashAmount;
        }
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getCashAmount(){
        return cashAmount;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
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
