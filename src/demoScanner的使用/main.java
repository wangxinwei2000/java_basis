package demoScanner的使用;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number");
        int number = sc.nextInt();
        Judge_Prime(number);
        System.out.println("please input the first number! ");
        int number1 = sc.nextInt();
        System.out.println("please input the second number! ");
        int number2 = sc.nextInt();
        System.out.println("please input the third number! ");
        int number3 = sc.nextInt();
        getMax_from_three(number1,number2,number3);
    }

    public static void Judge_Prime(int number){
        if(number<=2){
            System.out.println("number is a Prime");
            return;
        }
        else {
            int i=2;
            while (i<=number){

                if(i==number){
                    System.out.println("number is a Prime");
                }
                if(number%2==0){
                    System.out.println("number is not a Prime");
                    break;
                }
                i++;
            }
        }
    }

    public static void getMax_from_three(int number1,int number2,int number3){
        int result = Math.max(number1, number2);
        result = Math.max(result,number3);
        System.out.println("the max number is "+result);
    }
}
