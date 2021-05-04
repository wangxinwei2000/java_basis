package demo面向对象;

public class Person {
    Person(String Name,int Age){
        this.name = Name;
        this.age = Age;
    }
    Person(){
        this.name = "No name person";
        this.age = 100;
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    protected void printInformation(){
        System.out.println("name is "+this.name+" and age is "+this.age);
    }


    protected void goodFriend(Person person){
        System.out.println(person.name +" is good friend of "+this.name);


        //private 修饰后只能在同一个class中使用

    }

}
