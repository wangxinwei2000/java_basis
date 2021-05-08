package demoRandom使用方法;

public class GroupNumber {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    GroupNumber(String name){
        this.name = name;
    }
    private String name;
    private int money;
}
