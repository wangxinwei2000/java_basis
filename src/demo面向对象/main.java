package demo面向对象;

public class main {
    public static void main(String[] args) {
        Person person = new Person("Edison",78);
        person.printInformation();
        Person person1 = new Person("Vince",34);
        person.goodFriend(person1);

        Person NoNamePeron = new Person();
        NoNamePeron.printInformation();


        //匿名对象使用
        //只能使用一次

        new Person("Jack",89).printInformation();
    }
}
