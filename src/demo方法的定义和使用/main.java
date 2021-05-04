package demo方法的定义和使用;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello JAVA");
        System.out.println("result = "+sum(23,90));
        sumPrint(34,89);
        sumPrint(89.4,78.5);

    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static void sumPrint(int num1, int num2){
        System.out.println("结果为：："+num1+num2);
    }
    public static void sumPrint(double num1, double num2){
        System.out.println("结果为：："+(num1+num2));

    }
}
